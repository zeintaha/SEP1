import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class EditLecturerController implements Initializable
{

   private ToBinary file;
   private String fileName = "lecturers.txt";
   private ArrayList<Lecturer> lecturerArray;
   private ArrayList<Category> categories;

   @FXML
   private ResourceBundle resources;

   @FXML
   private URL location;

   @FXML 
   private TextField txtLecturersName;

   @FXML 
   private TextField txtPhone;

   @FXML 
   private Button btnSaveChanges;

   @FXML 
   private TextField txtName;

   @FXML 
   private ComboBox<Category> cmbSelectCategory;

   @FXML 
   private TextField txtAddress;

   @FXML 
   private TextField txtEmail;
   
   @FXML 
   private AnchorPane anchorPaneEditLecturer;

   @FXML 
   private Button btnSearchLecturer;

   public void selectCategory()
   {

   }

   @SuppressWarnings("unchecked")
   public void searchSponsor() throws FileNotFoundException
   {
      lecturerArray = new ArrayList<Lecturer>();
      lecturerArray = (ArrayList<Lecturer>) file.readObjFromFile();

      String nameLecturer = txtLecturersName.getText();

      for (int i = 0; i < lecturerArray.size(); i++)
      {
         if (lecturerArray.get(i).getName().equals(nameLecturer))
         {
            txtName.setText(lecturerArray.get(i).getName());
            txtAddress.setText(lecturerArray.get(i).getAddress());
            txtPhone.setText(lecturerArray.get(i).getPhoneNr());
            txtEmail.setText(lecturerArray.get(i).getEmail());
            lecturerArray.remove(i);
         }
      }
   }

   @FXML
   public void saveChanges() throws FileNotFoundException
   {
      Lecturer lec = new Lecturer(txtName.getText(), txtAddress.getText(),
            txtPhone.getText(), txtEmail.getText(),
            cmbSelectCategory.getSelectionModel().getSelectedItem().toString());
      lecturerArray = (ArrayList<Lecturer>) file.readObjFromFile();
      lecturerArray.add(lec);
      file.writeObjToFile(lecturerArray);
   }

  

   public void refreshComboBox()
   {
      categories = new ArrayList<Category>();
      categories = (ArrayList<Category>) file.readObjFromFile();
      cmbSelectCategory.getItems().addAll(categories);
   }

   private void showWrittenData()
   {
      ArrayList<Lecturer> list = (ArrayList<Lecturer>) file.readObjFromFile();
      for (int i = 0; i < list.size(); i++)
      {
         System.out.println(list.get(i));
      }
      System.out.println(list.get(0).getName());
   }
   public void initialize(URL arg0, ResourceBundle arg1)
   {
      fileName = "categories.txt";
      file = new ToBinary(fileName);
      categories = new ArrayList<Category>();
      refreshComboBox();
      fileName = "lecturers.txt";
      file = new ToBinary(fileName);
      lecturerArray = new ArrayList<Lecturer>();
      showWrittenData();

   }
}