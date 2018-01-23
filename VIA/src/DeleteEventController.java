
/**
 * Sample Skeleton for 'DeleteEvent.fxml' Controller Class
 */

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.AnchorPane;

public class DeleteEventController implements Initializable
{
   private ArrayList<Event> events;
   private ToBinary file;
   private String filename = "members.txt";
   ArrayList<Category> categories;
   private String[] type;
   int index = 0;

   @FXML // ResourceBundle that was given to the FXMLLoader
   private ResourceBundle resources;

   @FXML // URL location of the FXML file that was given to the FXMLLoader
   private URL location;

   @FXML // fx:id="AnchorPaneDeleteEvent"
   private AnchorPane AnchorPaneDeleteEvent; // Value injected by FXMLLoader

   @FXML // fx:id="dteDate"
   private DatePicker dteDate; // Value injected by FXMLLoader

   @FXML // fx:id="cmbSelectEvent"
   private ComboBox<Event> cmbSelectEvent; // Value injected by FXMLLoader

   @FXML // fx:id="cmbSelectCategory"
   private ComboBox<Category> cmbSelectCategory; // Value injected by FXMLLoader

   @FXML // fx:id="cmbSelectType"
   private ComboBox<String> cmbSelectType; // Value injected by FXMLLoader

   @FXML // fx:id="btnDeleteEvent"
   private Button btnDeleteEvent; // Value injected by FXMLLoader

   @SuppressWarnings("unchecked")
   private void setSelectCategoryCMBX()
   {
      categories = new ArrayList<Category>();
      filename = "categories.txt";
      file = new ToBinary(filename);
      categories = (ArrayList<Category>) file.readObjFromFile();
      cmbSelectCategory.getItems().clear();
      cmbSelectCategory.getItems().addAll(categories);
   }

   private void setSelectTypeCMBX()
   {
      type = new String[4];
      String[] type = { "Meditation", "Workshop", "Journey", "Training" };
      cmbSelectType.getItems().add(type[0]);
      cmbSelectType.getItems().add(type[1]);
      cmbSelectType.getItems().add(type[2]);
      cmbSelectType.getItems().add(type[3]);
   }

   @FXML
   void selectDate(ActionEvent event)
   {
      ArrayList<Event> events2 = new ArrayList<>();
      MyDate date = new MyDate(dteDate.getValue().getDayOfMonth(),
            dteDate.getValue().getMonthValue(), dteDate.getValue().getYear());
      for(int i = 0; i < events.size(); i++) {
         if(events.get(i).getDate().equals(date)) {
            events2.add(events.get(i));
         }
      }
      cmbSelectEvent.getItems().clear();
      cmbSelectEvent.getItems().addAll(events2);
   }

   @FXML
   void selectEvent(ActionEvent event)
   {

   }

   @FXML
   void deleteEvent(ActionEvent event)
   {
      Event eventToDelete = cmbSelectEvent.getSelectionModel().getSelectedItem();
      for(int i = 0; i < events.size(); i++) {
         if(events.get(i).toString().equals(eventToDelete.toString())) {
            index = i;
         }
      }
      events.remove(index);
      filename = "events.txt";
      file = new ToBinary(filename);
      file.writeObjToFile(events);
   }

   @FXML
   void selectCategory(ActionEvent event)
   {
      ArrayList<Event> events2 = new ArrayList<>();
      Category category = cmbSelectCategory.getSelectionModel().getSelectedItem();
      for(int i = 0; i < events.size(); i++) {
         if(events.get(i).getCategory().toString().equals(category.toString())) {
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
      for(int i = 0; i < events.size(); i++) {
         if(events.get(i).getType().toString().equals(type.toString())) {
            events2.add(events.get(i));
         }
      }
      cmbSelectEvent.getItems().clear();
      cmbSelectEvent.getItems().addAll(events2);
   }

   @FXML // This method is called by the FXMLLoader when initialization is
         // complete
   void initialize()
   {
      assert AnchorPaneDeleteEvent != null : "fx:id=\"AnchorPaneDeleteEvent\" was not injected: check your FXML file 'DeleteEvent.fxml'.";
      assert dteDate != null : "fx:id=\"dteDate\" was not injected: check your FXML file 'DeleteEvent.fxml'.";
      assert cmbSelectEvent != null : "fx:id=\"cmbSelectEvent\" was not injected: check your FXML file 'DeleteEvent.fxml'.";
      assert cmbSelectCategory != null : "fx:id=\"cmbSelectCategory\" was not injected: check your FXML file 'DeleteEvent.fxml'.";
      assert cmbSelectType != null : "fx:id=\"cmbSelectType\" was not injected: check your FXML file 'DeleteEvent.fxml'.";
      assert btnDeleteEvent != null : "fx:id=\"btnDeleteEvent\" was not injected: check your FXML file 'DeleteEvent.fxml'.";
   }

   @SuppressWarnings("unchecked")
   @Override
   public void initialize(URL arg0, ResourceBundle arg1)
   {
      setSelectCategoryCMBX();
      setSelectTypeCMBX();
      filename = "events.txt";
      file = new ToBinary(filename);
      events = new ArrayList<Event>();
      events = (ArrayList<Event>) file.readObjFromFile();

   }
}
