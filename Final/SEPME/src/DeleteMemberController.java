
/**
 * Sample Skeleton for 'DeleteMember.fxml' Controller Class
 */

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class DeleteMemberController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="txtId"
    private TextField txtId; // Value injected by FXMLLoader

    @FXML // fx:id="btnSearchId"
    private Button btnSearchId; // Value injected by FXMLLoader

    @FXML // fx:id="btnDeleteMember"
    private Button btnDeleteMember; // Value injected by FXMLLoader

    @FXML // fx:id="txtName"
    private TextField txtName; // Value injected by FXMLLoader

    @FXML // fx:id="AnchorePaneDeleteMember"
    private AnchorPane AnchorePaneDeleteMember; // Value injected by FXMLLoader

    @FXML
    void searchId(ActionEvent event) {

    }

    @FXML
    void deleteMember(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert txtId != null : "fx:id=\"txtId\" was not injected: check your FXML file 'DeleteMember.fxml'.";
        assert btnSearchId != null : "fx:id=\"btnSearchId\" was not injected: check your FXML file 'DeleteMember.fxml'.";
        assert btnDeleteMember != null : "fx:id=\"btnDeleteMember\" was not injected: check your FXML file 'DeleteMember.fxml'.";
        assert txtName != null : "fx:id=\"txtName\" was not injected: check your FXML file 'DeleteMember.fxml'.";
        assert AnchorePaneDeleteMember != null : "fx:id=\"AnchorePaneDeleteMember\" was not injected: check your FXML file 'DeleteMember.fxml'.";

    }
}
