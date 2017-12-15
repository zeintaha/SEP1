
/**
 * Sample Skeleton for 'AddLecturerToEvent.fxml' Controller Class
 */

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

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

public class AddLecturerToEventController implements Initializable
{
   private ArrayList<Lecturer> lecturers;
   private ToBinary file;
   private String filename = "events.txt";
   private ArrayList<Category> categories;
   private ArrayList<Event> events;
   private Lecturer lec;

   @FXML // ResourceBundle that was given to the FXMLLoader
   private ResourceBundle resources;

   @FXML // URL location of the FXML file that was given to the FXMLLoader
   private URL location;

   @FXML // fx:id="dteDate"
   private DatePicker dteDate; // Value injected by FXMLLoader

   @FXML // fx:id="cmbSelectEvent"
   private ComboBox<String> cmbSelectEvent; // Value injected by FXMLLoader

   @FXML // fx:id="cmbSelectCategory"
   private ComboBox<Category> cmbSelectCategory; // Value injected by FXMLLoader

   @FXML // fx:id="AnchorPaneAddParticipantToEvent"
   private AnchorPane AnchorPaneAddParticipantToEvent; // Value injected by
                                                       // FXMLLoader

   @FXML // fx:id="cmbSelectType"
   private ComboBox<String> cmbSelectType; // Value injected by FXMLLoader

   @FXML // fx:id="txtShowLecturerName"
   private TextField txtShowLecturerName; // Value injected by FXMLLoader

   @FXML // fx:id="btnAddLecturer"
   private Button btnAddLecturer; // Value injected by FXMLLoader

   @FXML // fx:id="txtEnterLecturerName"
   private TextField txtEnterLecturerName; // Value injected by FXMLLoader

   @FXML // fx:id="btnCreateNewLecturer"
   private Button btnCreateNewLecturer; // Value injected by FXMLLoader

   @FXML // fx:id="btnSearchLecturer"
   private Button btnSearchLecturer; // Value injected by FXMLLoader

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
      for (int i = 0; i < events2.size(); i++)
      {
         cmbSelectEvent.getItems().add(events2.get(i).getTitle());
      }
      System.out.println(events2.toString());
   }

   @FXML
   void selectEvent(ActionEvent event)
   {
      for (int i = 0; i < events.size(); i++)
      {
         if (events.get(i).getTitle()
               .equals(cmbSelectEvent.getSelectionModel().getSelectedItem()))
         {
            System.out.println(i);
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
      for (int i = 0; i < events2.size(); i++)
      {
         cmbSelectEvent.getItems().add(events2.get(i).getTitle());
      }
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
      for (int i = 0; i < events2.size(); i++)
      {
         cmbSelectEvent.getItems().add(events2.get(i).getTitle());
      }
   }

   @FXML
   void addLecturer(ActionEvent event)
   {
      for (int i = 0; i < events.size(); i++)
      {
         if (events.get(i).getTitle().equals(
               cmbSelectEvent.getSelectionModel().getSelectedItem().toString()))
         {
            events.get(i).setLecturer(lec);
         }
      }   
      filename = "events.txt";
      file = new ToBinary(filename);
      file.writeObjToFile(events);
      JOptionPane.showMessageDialog(null,
            lec.getName().toString() + " Added ");
   }

   @FXML
   void createNewLecturer(ActionEvent event)
   {
      Parent root;
      try
      {
         // instatiate invoke the fxml loader
         FXMLLoader loader = new FXMLLoader();

         // set controller
         loader.setController(new AddLecturerController());

         // set the location of the FXML doc
         loader.setLocation(getClass().getResource("AddLecturer.fxml"));
         root = loader.load();

         // Build the scene graph

         Scene scene = new Scene(root);

         Stage stage = new Stage();

         // show the window using the scene graph
         stage.getIcons()
               .add(new Image(getClass().getResourceAsStream("favicon.png")));
         stage.setTitle("Add Lecturer");
         stage.setScene(scene);
         stage.show();
      }
      catch (IOException e)
      {
         e.printStackTrace();
      }
   }

   @SuppressWarnings("unchecked")
   @FXML
   void searchLecturer(ActionEvent event)
   {
      lecturers = new ArrayList<Lecturer>();
      filename = "Lecturers.txt";
      file = new ToBinary(filename);
      lecturers = (ArrayList<Lecturer>) file.readObjFromFile();

      String lecName = txtEnterLecturerName.getText();
      for (int i = 0; i < lecturers.size(); i++)
      {
         if (lecturers.get(i).getName().equals(lecName))
         {
            txtShowLecturerName.setText(lecturers.get(i).getName());
            lec = lecturers.get(i);
         }
      }

   }

   @FXML // This method is called by the FXMLLoader when initialization is
         // complete
   void initialize()
   {
      assert dteDate != null : "fx:id=\"dteDate\" was not injected: check your FXML file 'AddLecturerToEvent.fxml'.";
      assert cmbSelectEvent != null : "fx:id=\"cmbSelectEvent\" was not injected: check your FXML file 'AddLecturerToEvent.fxml'.";
      assert cmbSelectCategory != null : "fx:id=\"cmbSelectCategory\" was not injected: check your FXML file 'AddLecturerToEvent.fxml'.";
      assert AnchorPaneAddParticipantToEvent != null : "fx:id=\"AnchorPaneAddParticipantToEvent\" was not injected: check your FXML file 'AddLecturerToEvent.fxml'.";
      assert cmbSelectType != null : "fx:id=\"cmbSelectType\" was not injected: check your FXML file 'AddLecturerToEvent.fxml'.";
      assert txtShowLecturerName != null : "fx:id=\"txtShowLecturerName\" was not injected: check your FXML file 'AddLecturerToEvent.fxml'.";
      assert btnAddLecturer != null : "fx:id=\"btnAddLecturer\" was not injected: check your FXML file 'AddLecturerToEvent.fxml'.";
      assert txtEnterLecturerName != null : "fx:id=\"txtEnterLecturerName\" was not injected: check your FXML file 'AddLecturerToEvent.fxml'.";
      assert btnCreateNewLecturer != null : "fx:id=\"btnCreateNewLecturer\" was not injected: check your FXML file 'AddLecturerToEvent.fxml'.";
      assert btnSearchLecturer != null : "fx:id=\"btnSearchLecturer\" was not injected: check your FXML file 'AddLecturerToEvent.fxml'.";

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
