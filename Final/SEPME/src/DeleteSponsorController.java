
/**
 * Sample Skeleton for 'DeleteSponsor.fxml' Controller Class
 */

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class DeleteSponsorController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="AnchorPaneDeleteSponsor"
    private AnchorPane AnchorPaneDeleteSponsor; // Value injected by FXMLLoader

    @FXML // fx:id="cmbSelectSponsor"
    private ComboBox<?> cmbSelectSponsor; // Value injected by FXMLLoader

    @FXML // fx:id="btnSearchSponsor"
    private Button btnSearchSponsor; // Value injected by FXMLLoader

    @FXML // fx:id="btnDeleteSponsor"
    private Button btnDeleteSponsor; // Value injected by FXMLLoader

    @FXML // fx:id="txtSponsor"
    private TextField txtSponsor; // Value injected by FXMLLoader

    @FXML
    void searchSponsor(ActionEvent event) {

    }

    @FXML
    void deleteSponsor(ActionEvent event) {

    }

    @FXML
    void selectSponsor(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert AnchorPaneDeleteSponsor != null : "fx:id=\"AnchorPaneDeleteSponsor\" was not injected: check your FXML file 'DeleteSponsor.fxml'.";
        assert cmbSelectSponsor != null : "fx:id=\"cmbSelectSponsor\" was not injected: check your FXML file 'DeleteSponsor.fxml'.";
        assert btnSearchSponsor != null : "fx:id=\"btnSearchSponsor\" was not injected: check your FXML file 'DeleteSponsor.fxml'.";
        assert btnDeleteSponsor != null : "fx:id=\"btnDeleteSponsor\" was not injected: check your FXML file 'DeleteSponsor.fxml'.";
        assert txtSponsor != null : "fx:id=\"txtSponsor\" was not injected: check your FXML file 'DeleteSponsor.fxml'.";

    }
}
