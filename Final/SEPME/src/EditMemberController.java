
/**
 * Sample Skeleton for 'EditMember.fxml' Controller Class
 */

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class EditMemberController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="txtMemberId"
    private TextField txtMemberId; // Value injected by FXMLLoader

    @FXML // fx:id="txtPhone"
    private TextField txtPhone; // Value injected by FXMLLoader

    @FXML // fx:id="btnSaveChanges"
    private Button btnSaveChanges; // Value injected by FXMLLoader

    @FXML // fx:id="txtName"
    private TextField txtName; // Value injected by FXMLLoader

    @FXML // fx:id="cmbSelectCategory"
    private ComboBox<?> cmbSelectCategory; // Value injected by FXMLLoader

    @FXML // fx:id="txtAddress"
    private TextField txtAddress; // Value injected by FXMLLoader

    @FXML // fx:id="btnGetMember"
    private Button btnGetMember; // Value injected by FXMLLoader

    @FXML // fx:id="txtEmail"
    private TextField txtEmail; // Value injected by FXMLLoader

    @FXML // fx:id="AnchorPaneEditMember"
    private AnchorPane AnchorPaneEditMember; // Value injected by FXMLLoader

    @FXML
    void getMember(ActionEvent event) {

    }

    @FXML
    void selectCategory(ActionEvent event) {

    }

    @FXML
    void saveChanges(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert txtMemberId != null : "fx:id=\"txtMemberId\" was not injected: check your FXML file 'EditMember.fxml'.";
        assert txtPhone != null : "fx:id=\"txtPhone\" was not injected: check your FXML file 'EditMember.fxml'.";
        assert btnSaveChanges != null : "fx:id=\"btnSaveChanges\" was not injected: check your FXML file 'EditMember.fxml'.";
        assert txtName != null : "fx:id=\"txtName\" was not injected: check your FXML file 'EditMember.fxml'.";
        assert cmbSelectCategory != null : "fx:id=\"cmbSelectCategory\" was not injected: check your FXML file 'EditMember.fxml'.";
        assert txtAddress != null : "fx:id=\"txtAddress\" was not injected: check your FXML file 'EditMember.fxml'.";
        assert btnGetMember != null : "fx:id=\"btnGetMember\" was not injected: check your FXML file 'EditMember.fxml'.";
        assert txtEmail != null : "fx:id=\"txtEmail\" was not injected: check your FXML file 'EditMember.fxml'.";
        assert AnchorPaneEditMember != null : "fx:id=\"AnchorPaneEditMember\" was not injected: check your FXML file 'EditMember.fxml'.";

    }
}
