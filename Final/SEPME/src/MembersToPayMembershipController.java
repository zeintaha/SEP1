

/**
 * Sample Skeleton for 'MembersToPayMembership.fxml' Controller Class
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;

public class MembersToPayMembershipController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="tblColumnPhone"
    private TableColumn<?, ?> tblColumnPhone; // Value injected by FXMLLoader

    @FXML // fx:id="tblColumnName"
    private TableColumn<?, ?> tblColumnName; // Value injected by FXMLLoader

    @FXML // fx:id="tblMember"
    private TableView<?> tblMember; // Value injected by FXMLLoader

    @FXML // fx:id="AnchorPaneMembersToPayMembership"
    private AnchorPane AnchorPaneMembersToPayMembership; // Value injected by FXMLLoader

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
        assert tblColumnPhone != null : "fx:id=\"tblColumnPhone\" was not injected: check your FXML file 'MembersToPayMembership.fxml'.";
        assert tblColumnName != null : "fx:id=\"tblColumnName\" was not injected: check your FXML file 'MembersToPayMembership.fxml'.";
        assert tblMember != null : "fx:id=\"tblMember\" was not injected: check your FXML file 'MembersToPayMembership.fxml'.";
        assert AnchorPaneMembersToPayMembership != null : "fx:id=\"AnchorPaneMembersToPayMembership\" was not injected: check your FXML file 'MembersToPayMembership.fxml'.";
        assert tblColumnMembershipDate != null : "fx:id=\"tblColumnMembershipDate\" was not injected: check your FXML file 'MembersToPayMembership.fxml'.";
        assert tblColumnEmail != null : "fx:id=\"tblColumnEmail\" was not injected: check your FXML file 'MembersToPayMembership.fxml'.";
        assert tblColumnAddress != null : "fx:id=\"tblColumnAddress\" was not injected: check your FXML file 'MembersToPayMembership.fxml'.";
        assert tblColumnPreferences != null : "fx:id=\"tblColumnPreferences\" was not injected: check your FXML file 'MembersToPayMembership.fxml'.";

    }
}
