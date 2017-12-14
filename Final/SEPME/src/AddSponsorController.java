/**
 * Sample Skeleton for 'AddSponsor.fxml' Controller Class
 */

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class AddSponsorController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="txtPhone"
    private TextField txtPhone; // Value injected by FXMLLoader

    @FXML // fx:id="btnAddSponsor"
    private Button btnAddSponsor; // Value injected by FXMLLoader

    @FXML // fx:id="txtName"
    private TextField txtName; // Value injected by FXMLLoader

    @FXML // fx:id="cmbSelectCategory"
    private ComboBox<?> cmbSelectCategory; // Value injected by FXMLLoader

    @FXML // fx:id="txtAddress"
    private TextField txtAddress; // Value injected by FXMLLoader

    @FXML // fx:id="txtEmail"
    private TextField txtEmail; // Value injected by FXMLLoader

    @FXML // fx:id="AnchorPaneAddSponsor"
    private AnchorPane AnchorPaneAddSponsor; // Value injected by FXMLLoader

    @FXML
    void selectCategory(ActionEvent event) {

    }

    @FXML
    void addSponsor(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert txtPhone != null : "fx:id=\"txtPhone\" was not injected: check your FXML file 'AddSponsor.fxml'.";
        assert btnAddSponsor != null : "fx:id=\"btnAddSponsor\" was not injected: check your FXML file 'AddSponsor.fxml'.";
        assert txtName != null : "fx:id=\"txtName\" was not injected: check your FXML file 'AddSponsor.fxml'.";
        assert cmbSelectCategory != null : "fx:id=\"cmbSelectCategory\" was not injected: check your FXML file 'AddSponsor.fxml'.";
        assert txtAddress != null : "fx:id=\"txtAddress\" was not injected: check your FXML file 'AddSponsor.fxml'.";
        assert txtEmail != null : "fx:id=\"txtEmail\" was not injected: check your FXML file 'AddSponsor.fxml'.";
        assert AnchorPaneAddSponsor != null : "fx:id=\"AnchorPaneAddSponsor\" was not injected: check your FXML file 'AddSponsor.fxml'.";

    }
}
