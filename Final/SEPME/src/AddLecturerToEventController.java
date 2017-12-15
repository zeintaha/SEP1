
/**
 * Sample Skeleton for 'AddLecturerToEvent.fxml' Controller Class
 */

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class AddLecturerToEventController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="dteDate"
    private DatePicker dteDate; // Value injected by FXMLLoader

    @FXML // fx:id="cmbSelectEvent"
    private ComboBox<?> cmbSelectEvent; // Value injected by FXMLLoader

    @FXML // fx:id="cmbSelectCategory"
    private ComboBox<?> cmbSelectCategory; // Value injected by FXMLLoader

    @FXML // fx:id="AnchorPaneAddParticipantToEvent"
    private AnchorPane AnchorPaneAddParticipantToEvent; // Value injected by FXMLLoader

    @FXML // fx:id="cmbSelectType"
    private ComboBox<?> cmbSelectType; // Value injected by FXMLLoader

    @FXML // fx:id="txtShowLecturerName"
    private TextField txtShowLecturerName; // Value injected by FXMLLoader

    @FXML // fx:id="btnAddLecturer"
    private Button btnAddLecturer; // Value injected by FXMLLoader

    @FXML // fx:id="txtEnterLecturerName"
    private TextField txtEnterLecturerName; // Value injected by FXMLLoader

    @FXML // fx:id="btnCreateNewLecturer"
    private Button btnCreateNewLecturer; // Value injected by FXMLLoader

    @FXML // fx:id="btnSearchLecturer"
    private Button btnSearchLecturer; // Value injected by FXMLLoader

    @FXML
    void selectDate(ActionEvent event) {

    }

    @FXML
    void selectEvent(ActionEvent event) {

    }

    @FXML
    void selectCategory(ActionEvent event) {

    }

    @FXML
    void selectType(ActionEvent event) {

    }

    @FXML
    void addLecturer(ActionEvent event) {

    }

    @FXML
    void createNewLecturer(ActionEvent event) {

    }

    @FXML
    void searchLecturer(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert dteDate != null : "fx:id=\"dteDate\" was not injected: check your FXML file 'AddLecturerToEvent.fxml'.";
        assert cmbSelectEvent != null : "fx:id=\"cmbSelectEvent\" was not injected: check your FXML file 'AddLecturerToEvent.fxml'.";
        assert cmbSelectCategory != null : "fx:id=\"cmbSelectCategory\" was not injected: check your FXML file 'AddLecturerToEvent.fxml'.";
        assert AnchorPaneAddParticipantToEvent != null : "fx:id=\"AnchorPaneAddParticipantToEvent\" was not injected: check your FXML file 'AddLecturerToEvent.fxml'.";
        assert cmbSelectType != null : "fx:id=\"cmbSelectType\" was not injected: check your FXML file 'AddLecturerToEvent.fxml'.";
        assert txtShowLecturerName != null : "fx:id=\"txtShowLecturerName\" was not injected: check your FXML file 'AddLecturerToEvent.fxml'.";
        assert btnAddLecturer != null : "fx:id=\"btnAddLecturer\" was not injected: check your FXML file 'AddLecturerToEvent.fxml'.";
        assert txtEnterLecturerName != null : "fx:id=\"txtEnterLecturerName\" was not injected: check your FXML file 'AddLecturerToEvent.fxml'.";
        assert btnCreateNewLecturer != null : "fx:id=\"btnCreateNewLecturer\" was not injected: check your FXML file 'AddLecturerToEvent.fxml'.";
        assert btnSearchLecturer != null : "fx:id=\"btnSearchLecturer\" was not injected: check your FXML file 'AddLecturerToEvent.fxml'.";

    }
}

