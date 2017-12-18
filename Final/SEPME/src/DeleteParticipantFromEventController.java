
/**
 * Sample Skeleton for 'DeleteParticipantFromEvent.fxml' Controller Class
 */

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.AnchorPane;

public class DeleteParticipantFromEventController implements Initializable
{
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

   @FXML // fx:id="cmbSelectParticipant"
   private ComboBox<Participants> cmbSelectParticipant; // Value injected by
                                                        // FXMLLoader

   @FXML // fx:id="AnchorPaneDeleteParticipantFromEvent"
   private AnchorPane AnchorPaneDeleteParticipantFromEvent; // Value injected by
                                                            // FXMLLoader

   @FXML // fx:id="dteDate"
   private DatePicker dteDate; // Value injected by FXMLLoader

   @FXML // fx:id="btnDeleteMember"
   private Button btnDeleteMember; // Value injected by FXMLLoader

   @FXML // fx:id="cmbSelectEvent"
   private ComboBox<Event> cmbSelectEvent; // Value injected by FXMLLoader

   @FXML // fx:id="cmbSelectCategory"
   private ComboBox<Category> cmbSelectCategory; // Value injected by FXMLLoader

   @FXML // fx:id="cmbSelectType"
   private ComboBox<String> cmbSelectType; // Value injected by FXMLLoader

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

   @FXML
   void deleteMember(ActionEvent event)
   {
      JOptionPane.showMessageDialog(null, nonmemparticipant.getName()
            + " Deleted from the event" + eventToAddParticipant.getTitle());
   }

   @FXML
   void selectParticipant(ActionEvent event)
   {

   }

   @FXML // This method is called by the FXMLLoader when initialization is
         // complete
   void initialize()
   {
      assert cmbSelectParticipant != null : "fx:id=\"cmbSelectParticipant\" was not injected: check your FXML file 'DeleteParticipantFromEvent.fxml'.";
      assert AnchorPaneDeleteParticipantFromEvent != null : "fx:id=\"AnchorPaneDeleteParticipantFromEvent\" was not injected: check your FXML file 'DeleteParticipantFromEvent.fxml'.";
      assert dteDate != null : "fx:id=\"dteDate\" was not injected: check your FXML file 'DeleteParticipantFromEvent.fxml'.";
      assert btnDeleteMember != null : "fx:id=\"btnDeleteMember\" was not injected: check your FXML file 'DeleteParticipantFromEvent.fxml'.";
      assert cmbSelectEvent != null : "fx:id=\"cmbSelectEvent\" was not injected: check your FXML file 'DeleteParticipantFromEvent.fxml'.";
      assert cmbSelectCategory != null : "fx:id=\"cmbSelectCategory\" was not injected: check your FXML file 'DeleteParticipantFromEvent.fxml'.";
      assert cmbSelectType != null : "fx:id=\"cmbSelectType\" was not injected: check your FXML file 'DeleteParticipantFromEvent.fxml'.";
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
