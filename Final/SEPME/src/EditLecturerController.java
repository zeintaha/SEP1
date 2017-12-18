/**
 * Sample Skeleton for 'EditLecturer.fxml' Controller Class
 */

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class EditLecturerController implements Initializable{
   private ToBinary file;
   private String fileName = "lecturers.txt";
   private ArrayList<Lecturer> lecturerArray;
   ArrayList<Category> categories;

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="txtLecturersName"
    private TextField txtLecturersName; // Value injected by FXMLLoader

    @FXML // fx:id="txtPhone"
    private TextField txtPhone; // Value injected by FXMLLoader

    @FXML // fx:id="btnSaveChanges"
    private Button btnSaveChanges; // Value injected by FXMLLoader

    @FXML // fx:id="txtName"
    private TextField txtName; // Value injected by FXMLLoader

    @FXML // fx:id="cmbSelectCategory"
    private ComboBox<Category> cmbSelectCategory; // Value injected by FXMLLoader

    @FXML // fx:id="txtAddress"
    private TextField txtAddress; // Value injected by FXMLLoader

    @FXML // fx:id="txtEmail"
    private TextField txtEmail; // Value injected by FXMLLoader

    @FXML // fx:id="anchorPaneEditLecturer"
    private AnchorPane anchorPaneEditLecturer; // Value injected by FXMLLoader

    @FXML // fx:id="btnSearchLecturer"
    private Button btnSearchLecturer; // Value injected by FXMLLoader

    @SuppressWarnings("unchecked")
   @FXML
    void searchLecturer(ActionEvent event) {
       lecturerArray = new ArrayList<Lecturer>();
       lecturerArray = (ArrayList<Lecturer>) file.readObjFromFile();

       String nameLecturer = txtLecturersName.getText();

       for (int i = 0; i < lecturerArray.size(); i++)
       {
          if (lecturerArray.get(i).getName().equals(nameLecturer))
          {
             txtName.setText(lecturerArray.get(i).getName());
             txtPhone.setText(lecturerArray.get(i).getPhoneNr());
             txtEmail.setText(lecturerArray.get(i).getEmail());
          }
       }
    }

    @FXML
    void selectCategory(ActionEvent event) {

    }

    @SuppressWarnings("unchecked")
   @FXML
    void saveChanges(ActionEvent event) {
       Lecturer lec = new Lecturer(txtName.getText(),
             txtPhone.getText(), txtEmail.getText(),
             cmbSelectCategory.getSelectionModel().getSelectedItem().toString());
       lecturerArray = (ArrayList<Lecturer>) file.readObjFromFile();
       lecturerArray.add(lec);
       file.writeObjToFile(lecturerArray);
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert txtLecturersName != null : "fx:id=\"txtLecturersName\" was not injected: check your FXML file 'EditLecturer.fxml'.";
        assert txtPhone != null : "fx:id=\"txtPhone\" was not injected: check your FXML file 'EditLecturer.fxml'.";
        assert btnSaveChanges != null : "fx:id=\"btnSaveChanges\" was not injected: check your FXML file 'EditLecturer.fxml'.";
        assert txtName != null : "fx:id=\"txtName\" was not injected: check your FXML file 'EditLecturer.fxml'.";
        assert cmbSelectCategory != null : "fx:id=\"cmbSelectCategory\" was not injected: check your FXML file 'EditLecturer.fxml'.";
        assert txtAddress != null : "fx:id=\"txtAddress\" was not injected: check your FXML file 'EditLecturer.fxml'.";
        assert txtEmail != null : "fx:id=\"txtEmail\" was not injected: check your FXML file 'EditLecturer.fxml'.";
        assert anchorPaneEditLecturer != null : "fx:id=\"anchorPaneEditLecturer\" was not injected: check your FXML file 'EditLecturer.fxml'.";
        assert btnSearchLecturer != null : "fx:id=\"btnSearchLecturer\" was not injected: check your FXML file 'EditLecturer.fxml'.";

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
    
    @SuppressWarnings("unchecked")
    public void refreshComboBox()
    {
       categories = new ArrayList<Category>();
       categories = (ArrayList<Category>) file.readObjFromFile();
       cmbSelectCategory.getItems().addAll(categories);
    }

    @SuppressWarnings("unchecked")
    private void showWrittenData()
    {
       ArrayList<Lecturer> list = (ArrayList<Lecturer>) file.readObjFromFile();
       for (int i = 0; i < list.size(); i++)
       {
          System.out.println(list.get(i));
       }
       System.out.println(list.get(0).getName());
    }
}
