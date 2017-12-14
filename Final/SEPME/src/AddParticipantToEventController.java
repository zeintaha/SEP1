
/**
 * Sample Skeleton for 'AddParticipantToEvent.fxml' Controller Class
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

public class AddParticipantToEventController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="txtMemberId1"
    private TextField txtMemberId1; // Value injected by FXMLLoader

    @FXML // fx:id="btnAddMember"
    private Button btnAddMember; // Value injected by FXMLLoader

    @FXML // fx:id="btnCreateNewNonMember"
    private Button btnCreateNewNonMember; // Value injected by FXMLLoader

    @FXML // fx:id="cmbSelectEvent"
    private ComboBox<?> cmbSelectEvent; // Value injected by FXMLLoader

    @FXML // fx:id="cmbSelectCategory"
    private ComboBox<?> cmbSelectCategory; // Value injected by FXMLLoader

    @FXML // fx:id="btnGetMember"
    private Button btnGetMember; // Value injected by FXMLLoader

    @FXML // fx:id="btnCreateNewMember"
    private Button btnCreateNewMember; // Value injected by FXMLLoader

    @FXML // fx:id="btnGetNonMember"
    private Button btnGetNonMember; // Value injected by FXMLLoader

    @FXML // fx:id="txtMemberId"
    private TextField txtMemberId; // Value injected by FXMLLoader

    @FXML // fx:id="dteDate"
    private DatePicker dteDate; // Value injected by FXMLLoader

    @FXML // fx:id="AnchorPaneAddParticipantToEvent"
    private AnchorPane AnchorPaneAddParticipantToEvent; // Value injected by FXMLLoader

    @FXML // fx:id="cmbSelectType"
    private ComboBox<?> cmbSelectType; // Value injected by FXMLLoader

    @FXML // fx:id="btnAddNonMember"
    private Button btnAddNonMember; // Value injected by FXMLLoader

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
    void getMember(ActionEvent event) {

    }

    @FXML
    void addMember(ActionEvent event) {

    }

    @FXML
    void addNonMember(ActionEvent event) {

    }

    @FXML
    void getNonMember(ActionEvent event) {

    }

    @FXML
    void createNewMember(ActionEvent event) {

    }

    @FXML
    void createNewNonMember(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert txtMemberId1 != null : "fx:id=\"txtMemberId1\" was not injected: check your FXML file 'AddParticipantToEvent.fxml'.";
        assert btnAddMember != null : "fx:id=\"btnAddMember\" was not injected: check your FXML file 'AddParticipantToEvent.fxml'.";
        assert btnCreateNewNonMember != null : "fx:id=\"btnCreateNewNonMember\" was not injected: check your FXML file 'AddParticipantToEvent.fxml'.";
        assert cmbSelectEvent != null : "fx:id=\"cmbSelectEvent\" was not injected: check your FXML file 'AddParticipantToEvent.fxml'.";
        assert cmbSelectCategory != null : "fx:id=\"cmbSelectCategory\" was not injected: check your FXML file 'AddParticipantToEvent.fxml'.";
        assert btnGetMember != null : "fx:id=\"btnGetMember\" was not injected: check your FXML file 'AddParticipantToEvent.fxml'.";
        assert btnCreateNewMember != null : "fx:id=\"btnCreateNewMember\" was not injected: check your FXML file 'AddParticipantToEvent.fxml'.";
        assert btnGetNonMember != null : "fx:id=\"btnGetNonMember\" was not injected: check your FXML file 'AddParticipantToEvent.fxml'.";
        assert txtMemberId != null : "fx:id=\"txtMemberId\" was not injected: check your FXML file 'AddParticipantToEvent.fxml'.";
        assert dteDate != null : "fx:id=\"dteDate\" was not injected: check your FXML file 'AddParticipantToEvent.fxml'.";
        assert AnchorPaneAddParticipantToEvent != null : "fx:id=\"AnchorPaneAddParticipantToEvent\" was not injected: check your FXML file 'AddParticipantToEvent.fxml'.";
        assert cmbSelectType != null : "fx:id=\"cmbSelectType\" was not injected: check your FXML file 'AddParticipantToEvent.fxml'.";
        assert btnAddNonMember != null : "fx:id=\"btnAddNonMember\" was not injected: check your FXML file 'AddParticipantToEvent.fxml'.";

    }
}

