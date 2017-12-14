
/**
 * Sample Skeleton for 'LecturersGivenCategory.fxml' Controller Class
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;

public class LecturersGivenCategoryController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="tblColumnPhone"
    private TableColumn<?, ?> tblColumnPhone; // Value injected by FXMLLoader

    @FXML // fx:id="tblColumnName"
    private TableColumn<?, ?> tblColumnName; // Value injected by FXMLLoader

    @FXML // fx:id="AnchorPaneLecturers"
    private Label AnchorPaneLecturers; // Value injected by FXMLLoader

    @FXML // fx:id="tblColumnEmail"
    private TableColumn<?, ?> tblColumnEmail; // Value injected by FXMLLoader

    @FXML // fx:id="tblColumnAddress"
    private TableColumn<?, ?> tblColumnAddress; // Value injected by FXMLLoader

    @FXML // fx:id="AnchorPaneSponsors"
    private AnchorPane AnchorPaneSponsors; // Value injected by FXMLLoader

    @FXML // fx:id="tblLecturers"
    private TableView<?> tblLecturers; // Value injected by FXMLLoader

    @FXML // fx:id="tblColumnCategory"
    private TableColumn<?, ?> tblColumnCategory; // Value injected by FXMLLoader

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert tblColumnPhone != null : "fx:id=\"tblColumnPhone\" was not injected: check your FXML file 'LecturersGivenCategory.fxml'.";
        assert tblColumnName != null : "fx:id=\"tblColumnName\" was not injected: check your FXML file 'LecturersGivenCategory.fxml'.";
        assert AnchorPaneLecturers != null : "fx:id=\"AnchorPaneLecturers\" was not injected: check your FXML file 'LecturersGivenCategory.fxml'.";
        assert tblColumnEmail != null : "fx:id=\"tblColumnEmail\" was not injected: check your FXML file 'LecturersGivenCategory.fxml'.";
        assert tblColumnAddress != null : "fx:id=\"tblColumnAddress\" was not injected: check your FXML file 'LecturersGivenCategory.fxml'.";
        assert AnchorPaneSponsors != null : "fx:id=\"AnchorPaneSponsors\" was not injected: check your FXML file 'LecturersGivenCategory.fxml'.";
        assert tblLecturers != null : "fx:id=\"tblLecturers\" was not injected: check your FXML file 'LecturersGivenCategory.fxml'.";
        assert tblColumnCategory != null : "fx:id=\"tblColumnCategory\" was not injected: check your FXML file 'LecturersGivenCategory.fxml'.";

    }
}
