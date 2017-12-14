

/**
 * Sample Skeleton for 'MembersGivenCategory.fxml' Controller Class
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;

public class MembersGivenCategoryController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="AnchorPaneMembers"
    private AnchorPane AnchorPaneMembers; // Value injected by FXMLLoader

    @FXML // fx:id="tblColumnPhone"
    private TableColumn<?, ?> tblColumnPhone; // Value injected by FXMLLoader

    @FXML // fx:id="tblColumnName"
    private TableColumn<?, ?> tblColumnName; // Value injected by FXMLLoader

    @FXML // fx:id="tblMember"
    private TableView<?> tblMember; // Value injected by FXMLLoader

    @FXML // fx:id="tblColumnMembershipDate"
    private TableColumn<?, ?> tblColumnMembershipDate; // Value injected by FXMLLoader

    @FXML // fx:id="tblColumnEmail"
    private TableColumn<?, ?> tblColumnEmail; // Value injected by FXMLLoader

    @FXML // fx:id="tblColumnAddress"
    private TableColumn<?, ?> tblColumnAddress; // Value injected by FXMLLoader

    @FXML // fx:id="tblColumnPreferences"
    private TableColumn<?, ?> tblColumnPreferences; // Value injected by FXMLLoader

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert AnchorPaneMembers != null : "fx:id=\"AnchorPaneMembers\" was not injected: check your FXML file 'MembersGivenCategory.fxml'.";
        assert tblColumnPhone != null : "fx:id=\"tblColumnPhone\" was not injected: check your FXML file 'MembersGivenCategory.fxml'.";
        assert tblColumnName != null : "fx:id=\"tblColumnName\" was not injected: check your FXML file 'MembersGivenCategory.fxml'.";
        assert tblMember != null : "fx:id=\"tblMember\" was not injected: check your FXML file 'MembersGivenCategory.fxml'.";
        assert tblColumnMembershipDate != null : "fx:id=\"tblColumnMembershipDate\" was not injected: check your FXML file 'MembersGivenCategory.fxml'.";
        assert tblColumnEmail != null : "fx:id=\"tblColumnEmail\" was not injected: check your FXML file 'MembersGivenCategory.fxml'.";
        assert tblColumnAddress != null : "fx:id=\"tblColumnAddress\" was not injected: check your FXML file 'MembersGivenCategory.fxml'.";
        assert tblColumnPreferences != null : "fx:id=\"tblColumnPreferences\" was not injected: check your FXML file 'MembersGivenCategory.fxml'.";

    }
}
