import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javax.sound.sampled.LineEvent.Type;
import javax.swing.JOptionPane;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class AddEventController implements Initializable
{
   private ArrayList<Event> events;
   private ToBinary file;
   private String filename = "event.txt";
   ArrayList<Category> categories;
   private String[] type;
   private MyDate date = new MyDate();

   @FXML
   private ResourceBundle resources;

   @FXML
   private URL location;

   @FXML
   private DatePicker dteStartDate;

   @FXML
   private ComboBox<Category> cmbSelectCategory;

   @FXML
   private ComboBox<String> cmbSelectType;

   @FXML
   private TextField txtPrice;

   @FXML
   private Button btnAddEvent;

   @FXML
   private TextField txtDuration;

   @FXML
   private TextField txtLecturer;

   @FXML
   private TextField txtTime;

   @FXML
   private TextField txtTitle;

   @FXML
   public void selectCategory()
   {

   }

   @SuppressWarnings("unchecked")
   @FXML
   public void addEvent()
   {
      filename = "lecturers";
      file = new ToBinary(filename);
      Lecturer lecturer = null;
      ArrayList<Lecturer> lec = (ArrayList<Lecturer>) file.readObjFromFile();
      for (int i = 0; i < lec.size(); i++)
      {
         if (lec.get(i).getName().toString().equals(txtLecturer.getText()))
         {
            lecturer = lec.get(i);
         }
      }
      Category cat = new Category(
            cmbSelectCategory.getSelectionModel().getSelectedItem().toString());
      Event eve = new Event(cat,
            cmbSelectType.getSelectionModel().getSelectedItem().toString(),
            txtTitle.getText(), date, txtTime.getText(), txtDuration.getText(),
            lecturer, Double.parseDouble(txtPrice.getText()),
            Double.parseDouble(txtPrice.getText()) * 0.8);
      filename = "events.txt";
      file = new ToBinary(filename);
//      events = (ArrayList<Event>) file.readObjFromFile();
      events.add(eve);
      file.writeObjToFile(events);
   }

   @FXML
   public void selectDate()
   {

      MyDate date = new MyDate(dteStartDate.getValue().getDayOfMonth(),
            dteStartDate.getValue().getMonthValue(),
            dteStartDate.getValue().getYear());
   }

   @FXML
   public void selecType()
   {
      type = new String[4];
      String[] type = { "Meditation", "Workshop", "Jorney", "Training" };
      cmbSelectType.getItems().add(type[0]);
      cmbSelectType.getItems().add(type[1]);
      cmbSelectType.getItems().add(type[2]);
      cmbSelectType.getItems().add(type[3]);
   }

   @SuppressWarnings("unchecked")
   private void showWrittenData()
   {
      ArrayList<Event> list = (ArrayList<Event>) file.readObjFromFile();
      for (int i = 0; i < list.size(); i++)
      {
         System.out.println(list.get(i));
      }
   }

   @SuppressWarnings("unchecked")
   public void refreshComboBox()
   {
      categories = new ArrayList<Category>();
      categories = (ArrayList<Category>) file.readObjFromFile();
      cmbSelectCategory.getItems().addAll(categories);
   }

   @Override
   public void initialize(URL arg0, ResourceBundle arg1)
   {
      filename = "categories.txt";
      file = new ToBinary(filename);
      categories = new ArrayList<Category>();
      refreshComboBox();
      selecType();
      filename = "events.txt";
      file = new ToBinary(filename);
      events = new ArrayList<Event>();
//      showWrittenData();
   }

}