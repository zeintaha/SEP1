/**
 * Sample Skeleton for 'AddLecturer.fxml' Controller Class
 */

import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class AddLecturerController implements Initializable {

   private ToBinary file;
   private String fileName = "lecturers.txt";
   private ArrayList<Lecturer> lecturerArray;
   ArrayList<Category> categories;
   
    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="txtPhone"
    private TextField txtPhone; // Value injected by FXMLLoader

    @FXML // fx:id="txtName"
    private TextField txtName; // Value injected by FXMLLoader

    @FXML // fx:id="cmbSelectCategory"
    private ComboBox<Category> cmbSelectCategory; // Value injected by FXMLLoader

    @FXML // fx:id="txtEmail"
    private TextField txtEmail; // Value injected by FXMLLoader

    @FXML // fx:id="btnAddLecturer"
    private Button btnAddLecturer; // Value injected by FXMLLoader

    @FXML
    void selectCategory(ActionEvent event) {

    }

//    @FXML
//    void addLecturer(ActionEvent event) {
//
//    }

  
    @SuppressWarnings("unchecked")
    public void addLecturer() throws FileNotFoundException
    {
       Lecturer lec = new Lecturer(txtName.getText(), txtEmail.getText(),
             txtPhone.getText(), cmbSelectCategory.getSelectionModel().getSelectedItem().toString());

       lecturerArray = (ArrayList<Lecturer>) file.readObjFromFile();
       lecturerArray.add(lec);
       file.writeObjToFile(lecturerArray);
       JOptionPane.showMessageDialog(null, lec.toString() + " Added ");
    }
    
    @SuppressWarnings({ "unchecked" })
    private void showWrittenData()
    {
       ArrayList<Lecturer> list = (ArrayList<Lecturer>) file.readObjFromFile();
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
