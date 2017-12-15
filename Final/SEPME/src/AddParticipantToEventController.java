
/**
 * Sample Skeleton for 'AddParticipantToEvent.fxml' Controller Class
 */

import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;

public class AddParticipantToEventController implements Initializable
{
   private ArrayList<Members> memArray;
   private ArrayList<Non_Members> nonmemArray;
   private ToBinary file;
   private String filename = "events.txt";
   private ArrayList<Category> categories;
   private ArrayList<Event> events;
   private Event eventToAddParticipant;
   private Non_Members nonmemparticipant;

   @FXML // ResourceBundle that was given to the FXMLLoader
   private ResourceBundle resources;

   @FXML // URL location of the FXML file that was given to the FXMLLoader
   private URL location;

   @FXML // fx:id="txtMemberId1"
   private TextField txtMemberId1; // Value injected by FXMLLoader

   @FXML // fx:id="btnAddMember"
   private Button btnAddMember; // Value injected by FXMLLoader

   @FXML // fx:id="btnCreateNewNonMember"
   private Button btnCreateNewNonMember; // Value injected by FXMLLoader

   @FXML // fx:id="cmbSelectEvent"
   private ComboBox<Event> cmbSelectEvent; // Value injected by FXMLLoader

   @FXML // fx:id="cmbSelectCategory"
   private ComboBox<Category> cmbSelectCategory; // Value injected by FXMLLoader

   @FXML // fx:id="btnGetMember"
   private Button btnGetMember; // Value injected by FXMLLoader

   @FXML // fx:id="btnCreateNewMember"
   private Button btnCreateNewMember; // Value injected by FXMLLoader

   @FXML // fx:id="btnGetNonMember"
   private Button btnGetNonMember; // Value injected by FXMLLoader

   @FXML // fx:id="txtMemberId"
   private TextField txtMemberId; // Value injected by FXMLLoader

   @FXML // fx:id="dteDate"
   private DatePicker dteDate; // Value injected by FXMLLoader

   @FXML // fx:id="AnchorPaneAddParticipantToEvent"
   private AnchorPane AnchorPaneAddParticipantToEvent; // Value injected by
                                                       // FXMLLoader

   @FXML
   private TextField txtNameMember;

   @FXML
   private TextField txtNameNonMember;

   @FXML // fx:id="cmbSelectType"
   private ComboBox<String> cmbSelectType; // Value injected by FXMLLoader

   @FXML // fx:id="btnAddNonMember"
   private Button btnAddNonMember; // Value injected by FXMLLoader

   @FXML
   void selectDate(ActionEvent event)
   {
      ArrayList<Event> events2 = new ArrayList<>();
      MyDate date = new MyDate(dteDate.getValue().getDayOfMonth(),
            dteDate.getValue().getMonthValue(), dteDate.getValue().getYear());
      for (int i = 0; i < events.size(); i++)
      {
         if (events.get(i).getDate().equals(date))
         {
            events2.add(events.get(i));
         }
      }
      cmbSelectEvent.getItems().clear();
      cmbSelectEvent.getItems().addAll(events2);
   }

   @FXML
   void selectEvent(ActionEvent event)
   {
      eventToAddParticipant = cmbSelectEvent.getSelectionModel()
            .getSelectedItem();
      for (int i = 0; i < events.size(); i++)
      {
         if (events.get(i).equals(eventToAddParticipant))
         {
            events.remove(i);
         }
      }
   }

   @SuppressWarnings("unchecked")
   public void selectCategoryCMBX()
   {
      categories = new ArrayList<Category>();
      filename = "categories.txt";
      file = new ToBinary(filename);
      categories = (ArrayList<Category>) file.readObjFromFile();
      cmbSelectCategory.getItems().clear();
      cmbSelectCategory.getItems().addAll(categories);
   }

   public void selectTypeCMBX()
   {
      String[] type = { "Meditation", "Workshop", "Journey", "Training" };
      cmbSelectType.getItems().add(type[0]);
      cmbSelectType.getItems().add(type[1]);
      cmbSelectType.getItems().add(type[2]);
      cmbSelectType.getItems().add(type[3]);
   }

   @FXML
   void selectCategory(ActionEvent event)
   {
      ArrayList<Event> events2 = new ArrayList<>();
      Category category = cmbSelectCategory.getSelectionModel()
            .getSelectedItem();
      for (int i = 0; i < events.size(); i++)
      {
         if (events.get(i).getCategory().toString().equals(category.toString()))
         {
            events2.add(events.get(i));
         }
      }
      cmbSelectEvent.getItems().clear();
      cmbSelectEvent.getItems().addAll(events2);
   }

   @FXML
   void selectType(ActionEvent event)
   {
      ArrayList<Event> events2 = new ArrayList<>();
      String type = cmbSelectType.getSelectionModel().getSelectedItem();
      for (int i = 0; i < events.size(); i++)
      {
         if (events.get(i).getType().toString().equals(type.toString()))
         {
            events2.add(events.get(i));
         }
      }
      cmbSelectEvent.getItems().clear();
      cmbSelectEvent.getItems().addAll(events2);
   }

   @SuppressWarnings("unchecked")
   @FXML
   void getMember(ActionEvent event)
   {
      memArray = new ArrayList<Members>();
      filename = "members.txt";
      file = new ToBinary(filename);
      memArray = (ArrayList<Members>) file.readObjFromFile();

      String idMember = txtMemberId.getText();
      for (int i = 0; i < memArray.size(); i++)
      {
         if (memArray.get(i).getMember().getiD().toString().equals(idMember))
         {
            txtNameMember.setText(memArray.get(i).getMember().getName().toString());
            nonmemparticipant = memArray.get(i).getMember();
         }
      }
   }

   @FXML
   void addMember(ActionEvent event)
   {
      Participants participant = new Participants(nonmemparticipant);
      eventToAddParticipant.addParticipantsToEvent(participant);
      events.add(eventToAddParticipant);
      filename = "events.txt";
      file = new ToBinary(filename);
      file.writeObjToFile(events);
   }

   @FXML
   void addNonMember(ActionEvent event)
   {
      Participants participant = new Participants(nonmemparticipant);
      eventToAddParticipant.addParticipantsToEvent(participant);
      events.add(eventToAddParticipant);
      filename = "events.txt";
      file = new ToBinary(filename);
      file.writeObjToFile(events);
   }

   @SuppressWarnings("unchecked")
   @FXML
   void getNonMember(ActionEvent event)
   {
      nonmemArray = new ArrayList<Non_Members>();
      filename = "nonmember.txt";
      file = new ToBinary(filename);
      nonmemArray = (ArrayList<Non_Members>) file.readObjFromFile();

      String idMember = txtMemberId.getText();
      for (int i = 0; i < nonmemArray.size(); i++)
      {
         if (memArray.get(i).getMember().getiD().equals(idMember))
         {
            txtNameNonMember.setText(nonmemArray.get(i).getName());
            nonmemparticipant = nonmemArray.get(i);
         }
      }
   }

   @FXML
   void createNewMember(ActionEvent event)
   {

   }

   @FXML
   void createNewNonMember(ActionEvent event)
   {
      Parent root;
      try
      {
         // instatiate invoke the fxml loader
         FXMLLoader loader = new FXMLLoader();

         // set controller
         loader.setController(new AddNoneMemberController());

         // set the location of the FXML doc
         loader.setLocation(getClass().getResource("AddNoneMember.fxml"));
         root = loader.load();

         // Build the scene graph

         Scene scene = new Scene(root);

         Stage stage = new Stage();

         // show the window using the scene graph
         stage.getIcons().add(new Image(getClass().getResourceAsStream("favicon.png")));
         stage.setTitle("Add None-Member");
         stage.setScene(scene);
         stage.show();
      }
      catch (IOException e)
      {
         e.printStackTrace();
      }

   }

   @FXML // This method is called by the FXMLLoader when initialization is
         // complete
   void initialize()
   {
      assert txtMemberId1 != null : "fx:id=\"txtMemberId1\" was not injected: check your FXML file 'AddParticipantToEvent.fxml'.";
      assert btnAddMember != null : "fx:id=\"btnAddMember\" was not injected: check your FXML file 'AddParticipantToEvent.fxml'.";
      assert btnCreateNewNonMember != null : "fx:id=\"btnCreateNewNonMember\" was not injected: check your FXML file 'AddParticipantToEvent.fxml'.";
      assert cmbSelectEvent != null : "fx:id=\"cmbSelectEvent\" was not injected: check your FXML file 'AddParticipantToEvent.fxml'.";
      assert cmbSelectCategory != null : "fx:id=\"cmbSelectCategory\" was not injected: check your FXML file 'AddParticipantToEvent.fxml'.";
      assert btnGetMember != null : "fx:id=\"btnGetMember\" was not injected: check your FXML file 'AddParticipantToEvent.fxml'.";
      assert btnCreateNewMember != null : "fx:id=\"btnCreateNewMember\" was not injected: check your FXML file 'AddParticipantToEvent.fxml'.";
      assert btnGetNonMember != null : "fx:id=\"btnGetNonMember\" was not injected: check your FXML file 'AddParticipantToEvent.fxml'.";
      assert txtMemberId != null : "fx:id=\"txtMemberId\" was not injected: check your FXML file 'AddParticipantToEvent.fxml'.";
      assert dteDate != null : "fx:id=\"dteDate\" was not injected: check your FXML file 'AddParticipantToEvent.fxml'.";
      assert AnchorPaneAddParticipantToEvent != null : "fx:id=\"AnchorPaneAddParticipantToEvent\" was not injected: check your FXML file 'AddParticipantToEvent.fxml'.";
      assert cmbSelectType != null : "fx:id=\"cmbSelectType\" was not injected: check your FXML file 'AddParticipantToEvent.fxml'.";
      assert btnAddNonMember != null : "fx:id=\"btnAddNonMember\" was not injected: check your FXML file 'AddParticipantToEvent.fxml'.";
   }

   @SuppressWarnings("unchecked")
   public void initialize(URL arg0, ResourceBundle arg1)
   {
      selectCategoryCMBX();
      selectTypeCMBX();
      filename = "events.txt";
      file = new ToBinary(filename);
      events = new ArrayList<Event>();
      events = (ArrayList<Event>) file.readObjFromFile();

   }
}
