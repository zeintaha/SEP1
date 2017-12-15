/**
 * Sample Skeleton for 'DeleteLecturer.fxml' Controller Class
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
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class DeleteLecturerController implements Initializable
{
   private ArrayList<Lecturer> lecturerArray;
   private ToBinary file;
   private String filename = "lecturers.txt";

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="txtLecturersName"
    private TextField txtLecturersName; // Value injected by FXMLLoader

    @FXML // fx:id="btnDeleteLecturer"
    private Button btnDeleteLecturer; // Value injected by FXMLLoader

    @FXML // fx:id="AnchorPaneDeleteLecturer"
    private AnchorPane AnchorPaneDeleteLecturer; // Value injected by FXMLLoader

    @FXML // fx:id="cmbSelectLecturer"
    private ComboBox<Lecturer> cmbSelectLecturer; // Value injected by FXMLLoader

    @FXML // fx:id="btnSearchLecturer"
    private Button btnSearchLecturer; // Value injected by FXMLLoader

    @FXML
    void selectLecturer(ActionEvent event) {

    }


    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert txtLecturersName != null : "fx:id=\"txtLecturersName\" was not injected: check your FXML file 'DeleteLecturer.fxml'.";
        assert btnDeleteLecturer != null : "fx:id=\"btnDeleteLecturer\" was not injected: check your FXML file 'DeleteLecturer.fxml'.";
        assert AnchorPaneDeleteLecturer != null : "fx:id=\"AnchorPaneDeleteLecturer\" was not injected: check your FXML file 'DeleteLecturer.fxml'.";
        assert cmbSelectLecturer != null : "fx:id=\"cmbSelectLecturer\" was not injected: check your FXML file 'DeleteLecturer.fxml'.";
        assert btnSearchLecturer != null : "fx:id=\"btnSearchLecturer\" was not injected: check your FXML file 'DeleteLecturer.fxml'.";

    }
    
    @SuppressWarnings("unchecked")
    @FXML
    public void searchLecturer()
    {
       lecturerArray = (ArrayList<Lecturer>) file.readObjFromFile();
       ArrayList<Lecturer> lecturerArray2 = new ArrayList<Lecturer>();

       for (int i = 0; i < lecturerArray.size(); i++)
       {
          if (lecturerArray.get(i).getName().equals(txtLecturersName.getText()))
          {
             lecturerArray2.add(lecturerArray.get(i));
          }
       }
       cmbSelectLecturer.getItems().clear();
       cmbSelectLecturer.getItems().addAll(lecturerArray2);

       String string = "  Is Not a part of the List";
       if (lecturerArray2.size() != 0)
       {
          string = "  Found";
       }
       
       JOptionPane.showMessageDialog(null,
            txtLecturersName.getText().toString() + string);


    }

    @FXML
    public void deleteLecturer()
    {
       Lecturer selectedLecturer = cmbSelectLecturer.getSelectionModel()
             .getSelectedItem();
       for (int i = 0; i < lecturerArray.size(); i++)
       {
          if (lecturerArray.get(i).equals(selectedLecturer))
          {
             lecturerArray.remove(i);
          }
       }
       file.writeObjToFile(lecturerArray);
       searchLecturer();
    }

    public void clearName()
    {
       txtLecturersName.setText(null);
    }


    @SuppressWarnings("unchecked")
    private void showWrittenData()
    {
       ArrayList<Lecturer> list = (ArrayList<Lecturer>) file.readObjFromFile();
       for (int i = 0; i < list.size(); i++)
       {
          System.out.println(list.get(i));
       }
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1)
    {
       file = new ToBinary(filename);
       lecturerArray = new ArrayList<Lecturer>();
       showWrittenData();
    }
}
