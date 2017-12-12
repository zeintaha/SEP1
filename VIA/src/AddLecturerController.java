import java.io.EOFException;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class AddLecturerController extends ToBinary implements Initializable
{

   @FXML
   private TextField txtPhone;

   @FXML
   private TextField txtName;

   @FXML
   private ComboBox<Category> cmbSelectCategory = new ComboBox<Category>();

   @FXML
   private TextField txtAddress;

   @FXML
   private TextField txtEmail;

   @FXML
   private Button btnAddLecturer;

   @Override
   public void initialize(URL arg0, ResourceBundle arg1)
   {
       comboBoxLoader();
   }

   @SuppressWarnings("unchecked")
   public void comboBoxLoader()
   {
      cmbSelectCategory = new ComboBox<Category>();
      ArrayList<Category> categories = new ArrayList<Category>();
      categories = (ArrayList<Category>) readObjFromFile(
            "D://Liviu//ECLIPSE STORAGE//VIA/activitysubject.txt");
      cmbSelectCategory.getItems().addAll(categories);
   }

   @FXML
   void selectCategory()
   {
//      comboBoxLoader();
   }

   @SuppressWarnings("unchecked")
   @FXML
   void addLecturer() throws ClassNotFoundException, IOException, EOFException
   {
      String name = txtName.getText();
      String email = txtEmail.getText();
      String category = cmbSelectCategory.getAccessibleText();
      String phoneNr = txtPhone.getText();
      Lecturer lec = new Lecturer(name, email, phoneNr, category);
      ArrayList<Lecturer> lecturers = new ArrayList<Lecturer>();
      lecturers = ((ArrayList<Lecturer>) readObjFromFile(
            "D://Liviu//ECLIPSE STORAGE//VIA/lecturers.txt"));
      lecturers.add(lec);
      writeObjFromFile(lecturers,
            "D://Liviu//ECLIPSE STORAGE//VIA/lecturers.txt");
      JOptionPane.showMessageDialog(null, lec.toString() + "Added ");
   }

   private ArrayList<Lecturer> lecturerArray;

   public void addLecturer(Lecturer lecturer)
   {
      lecturerArray.add(lecturer);
   }

   public void deleteLecturer(Lecturer lecturer)
   {
      lecturerArray.remove(lecturer);
   }

   public void editLecturer(String name, String email)
   {
      if (lecturerArray.size() != 0)
      {
         for (int i = 0; i < lecturerArray.size(); i++)
         {
            if (lecturerArray.get(i).getName().equals(name))
            {
               lecturerArray.get(i).setEmail(email);
               System.out.println("Lecturer " + lecturerArray.get(i).getName()
                     + "has successfully updated his email adress");
            }
            if (lecturerArray.get(i).getEmail().equals(email))
            {
               lecturerArray.get(i).setName(name);
               System.out.println("Lecturer with the email "
                     + lecturerArray.get(i).getEmail()
                     + "has successfully updated his name");
            }
         }
      }
      else
      {
         System.out.println("There are no lecturers in the list :(");
      }
   }

}
