
/**
 * Sample Skeleton for 'AddEvent.fxml' Controller Class
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
import javafx.scene.control.TextField;

public class AddEventController implements Initializable
{
   private ArrayList<Event> events;
   private ToBinary file;
   private String filename = "event.txt";
   ArrayList<Category> categories;


   @FXML // ResourceBundle that was given to the FXMLLoader
   private ResourceBundle resources;

   @FXML // URL location of the FXML file that was given to the FXMLLoader
   private URL location;

   @FXML // fx:id="dteStartDate"
   private DatePicker dteStartDate; // Value injected by FXMLLoader

   @FXML // fx:id="cmbSelectCategory"
   private ComboBox<Category> cmbSelectCategory; // Value injected by FXMLLoader

   @FXML // fx:id="cmbSelectType"
   private ComboBox<String> cmbSelectType; // Value injected by FXMLLoader

   @FXML // fx:id="txtPrice"
   private TextField txtPrice; // Value injected by FXMLLoader

   @FXML // fx:id="btnAddEvent"
   private Button btnAddEvent; // Value injected by FXMLLoader

   @FXML // fx:id="txtDuration"
   private TextField txtDuration; // Value injected by FXMLLoader

   @FXML // fx:id="txtLecturer"
   private TextField txtLecturer; // Value injected by FXMLLoader

   @FXML // fx:id="txtTime"
   private TextField txtTime; // Value injected by FXMLLoader

   @FXML // fx:id="txtTitle"
   private TextField txtTitle; // Value injected by FXMLLoader

   @SuppressWarnings("unchecked")
   @FXML
   void addEvent(ActionEvent event)
   {
      MyDate date = new MyDate(dteStartDate.getValue().getDayOfMonth(),
            dteStartDate.getValue().getMonthValue(),
            dteStartDate.getValue().getYear());
      filename = "lecturers.txt";
      file = new ToBinary(filename);
      Lecturer lecturer = null;
      ArrayList<Lecturer> lec = (ArrayList<Lecturer>) file.readObjFromFile();
      for (int i = 0; i < lec.size(); i++)
      {
         if (lec.get(i).getName().toString()
               .equals(txtLecturer.getText().toString()))
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
      events = (ArrayList<Event>) file.readObjFromFile();
      events.add(eve);
      file.writeObjToFile(events);
      JOptionPane.showMessageDialog(null, eve.toString() + " Added ");
   }

   @FXML
   void selectDate(ActionEvent event)
   {

   }

   @FXML
   void selectCategory(ActionEvent event)
   {

   }

   @FXML
   void selecType()
   {

   }
   @FXML
   void selecTypeCat()
   {
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
      selecTypeCat();
      filename = "events.txt";
      file = new ToBinary(filename);
      events = new ArrayList<Event>();
      showWrittenData();
   }

}
