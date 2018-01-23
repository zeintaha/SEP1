
/**
 * Sample Skeleton for 'DeleteLecturerFromEvent.fxml' Controller Class
 */

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.AnchorPane;

public class DeleteLecturerFromEventController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="AnchorPaneDeleteParticipantFromEvent"
    private AnchorPane AnchorPaneDeleteParticipantFromEvent; // Value injected by FXMLLoader

    @FXML // fx:id="dteDate"
    private DatePicker dteDate; // Value injected by FXMLLoader

    @FXML // fx:id="cmbSelectEvent"
    private ComboBox<?> cmbSelectEvent; // Value injected by FXMLLoader

    @FXML // fx:id="cmbSelectCategory"
    private ComboBox<?> cmbSelectCategory; // Value injected by FXMLLoader

    @FXML // fx:id="btnDeleteLecturer"
    private Button btnDeleteLecturer; // Value injected by FXMLLoader

    @FXML // fx:id="cmbSelectType"
    private ComboBox<?> cmbSelectType; // Value injected by FXMLLoader

    @FXML // fx:id="cmbSelectLecturer"
    private ComboBox<?> cmbSelectLecturer; // Value injected by FXMLLoader

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
    void deleteLecturer(ActionEvent event) {

    }

    @FXML
    void selectLecturer(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert AnchorPaneDeleteParticipantFromEvent != null : "fx:id=\"AnchorPaneDeleteParticipantFromEvent\" was not injected: check your FXML file 'DeleteLecturerFromEvent.fxml'.";
        assert dteDate != null : "fx:id=\"dteDate\" was not injected: check your FXML file 'DeleteLecturerFromEvent.fxml'.";
        assert cmbSelectEvent != null : "fx:id=\"cmbSelectEvent\" was not injected: check your FXML file 'DeleteLecturerFromEvent.fxml'.";
        assert cmbSelectCategory != null : "fx:id=\"cmbSelectCategory\" was not injected: check your FXML file 'DeleteLecturerFromEvent.fxml'.";
        assert btnDeleteLecturer != null : "fx:id=\"btnDeleteLecturer\" was not injected: check your FXML file 'DeleteLecturerFromEvent.fxml'.";
        assert cmbSelectType != null : "fx:id=\"cmbSelectType\" was not injected: check your FXML file 'DeleteLecturerFromEvent.fxml'.";
        assert cmbSelectLecturer != null : "fx:id=\"cmbSelectLecturer\" was not injected: check your FXML file 'DeleteLecturerFromEvent.fxml'.";

    }
}
