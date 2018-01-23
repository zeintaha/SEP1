import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
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
   private MyDate date = new MyDate();
   
   @FXML
   private AnchorPane AnchorPaneDeleteEvent;

   @FXML
   private DatePicker dteDate;

   @FXML
   private ComboBox<Event> cmbSelectEvent;

   @FXML
   private ComboBox<Category> cmbSelectCategory;

   @FXML
   private ComboBox<Object> cmbSelectType;

   @FXML
   private Button btnDeleteEvent;

   @FXML
   void selectDate() {

   }

   @FXML
   void selectEvent() {

   }

   @FXML
   void deleteEvent() {

   }

   @FXML
   void selectCategory() {
      
   }

   @FXML
   public void selectType() {

   }
   
   @SuppressWarnings("unchecked")
   public void selectCatyGoryComboBox() {
      categories = (ArrayList<Category>) file.readObjFromFile();
      cmbSelectCategory.getItems().addAll(categories);
   }
   
   public void selectTypeComboBox() {
      type = new String[4];
      String[] type = {"Meditation", "Workshop", "Journey", "Training"};
      cmbSelectType.getItems().add(type[0]);
      cmbSelectType.getItems().add(type[1]);
      cmbSelectType.getItems().add(type[2]);
      cmbSelectType.getItems().add(type[3]);
   }
   
   
   @SuppressWarnings("unchecked")
   @Override
   public void initialize(URL arg0, ResourceBundle arg1)
   {
      filename = "categories.txt";
      file = new ToBinary(filename);
      categories = new ArrayList<Category>();
      selectCatyGoryComboBox();
      selectTypeComboBox();
      filename = "events.txt";
      file = new ToBinary(filename);
      events = new ArrayList<Event>();
      events = (ArrayList<Event>) file.readObjFromFile();

   }

   
}
