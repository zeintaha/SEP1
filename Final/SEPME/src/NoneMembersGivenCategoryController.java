

/**
 * Sample Skeleton for 'NoneMembersGivenCategory.fxml' Controller Class
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;

public class NoneMembersGivenCategoryController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="tblColumnPhone"
    private TableColumn<?, ?> tblColumnPhone; // Value injected by FXMLLoader

    @FXML // fx:id="tblColumnName"
    private TableColumn<?, ?> tblColumnName; // Value injected by FXMLLoader

    @FXML // fx:id="tblNoneMember"
    private TableView<?> tblNoneMember; // Value injected by FXMLLoader

    @FXML // fx:id="tblColumnEmail"
    private TableColumn<?, ?> tblColumnEmail; // Value injected by FXMLLoader

    @FXML // fx:id="AnchorPaneNoneMembers"
    private AnchorPane AnchorPaneNoneMembers; // Value injected by FXMLLoader

    @FXML // fx:id="tblColumnAddress"
    private TableColumn<?, ?> tblColumnAddress; // Value injected by FXMLLoader

    @FXML // fx:id="tblColumnPreferences"
    private TableColumn<?, ?> tblColumnPreferences; // Value injected by FXMLLoader

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert tblColumnPhone != null : "fx:id=\"tblColumnPhone\" was not injected: check your FXML file 'NoneMembersGivenCategory.fxml'.";
        assert tblColumnName != null : "fx:id=\"tblColumnName\" was not injected: check your FXML file 'NoneMembersGivenCategory.fxml'.";
        assert tblNoneMember != null : "fx:id=\"tblNoneMember\" was not injected: check your FXML file 'NoneMembersGivenCategory.fxml'.";
        assert tblColumnEmail != null : "fx:id=\"tblColumnEmail\" was not injected: check your FXML file 'NoneMembersGivenCategory.fxml'.";
        assert AnchorPaneNoneMembers != null : "fx:id=\"AnchorPaneNoneMembers\" was not injected: check your FXML file 'NoneMembersGivenCategory.fxml'.";
        assert tblColumnAddress != null : "fx:id=\"tblColumnAddress\" was not injected: check your FXML file 'NoneMembersGivenCategory.fxml'.";
        assert tblColumnPreferences != null : "fx:id=\"tblColumnPreferences\" was not injected: check your FXML file 'NoneMembersGivenCategory.fxml'.";

    }
}
