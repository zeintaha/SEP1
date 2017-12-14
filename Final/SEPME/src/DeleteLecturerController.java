/**
 * Sample Skeleton for 'DeleteLecturer.fxml' Controller Class
 */

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class DeleteLecturerController {

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
    private ComboBox<?> cmbSelectLecturer; // Value injected by FXMLLoader

    @FXML // fx:id="btnSearchLecturer"
    private Button btnSearchLecturer; // Value injected by FXMLLoader

    @FXML
    void selectLecturer(ActionEvent event) {

    }

    @FXML
    void searchLecturer(ActionEvent event) {

    }

    @FXML
    void deleteLecturer(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert txtLecturersName != null : "fx:id=\"txtLecturersName\" was not injected: check your FXML file 'DeleteLecturer.fxml'.";
        assert btnDeleteLecturer != null : "fx:id=\"btnDeleteLecturer\" was not injected: check your FXML file 'DeleteLecturer.fxml'.";
        assert AnchorPaneDeleteLecturer != null : "fx:id=\"AnchorPaneDeleteLecturer\" was not injected: check your FXML file 'DeleteLecturer.fxml'.";
        assert cmbSelectLecturer != null : "fx:id=\"cmbSelectLecturer\" was not injected: check your FXML file 'DeleteLecturer.fxml'.";
        assert btnSearchLecturer != null : "fx:id=\"btnSearchLecturer\" was not injected: check your FXML file 'DeleteLecturer.fxml'.";

    }
}
