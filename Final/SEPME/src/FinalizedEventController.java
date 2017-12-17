

/**
 * Sample Skeleton for 'FinalizedEvents.fxml' Controller Class
 */

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.AnchorPane;

public class FinalizedEventController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="tblColumnType"
    private TableColumn<Event, String> tblColumnType; // Value injected by FXMLLoader

    @FXML // fx:id="tblColumnLecturer"
    private TableColumn<Event, Lecturer> tblColumnLecturer; // Value injected by FXMLLoader

    @FXML // fx:id="AnchorPaneFinalizedEvents"
    private AnchorPane AnchorPaneFinalizedEvents; // Value injected by FXMLLoader

    @FXML // fx:id="tblColumnDate"
    private TableColumn<Event, MyDate> tblColumnDate; // Value injected by FXMLLoader

    @FXML // fx:id="tblColumnDuration"
    private TableColumn<Event, String> tblColumnDuration; // Value injected by FXMLLoader

    @FXML // fx:id="tblFinalizedEvent"
    private TableView<Event> tblFinalizedEvent; // Value injected by FXMLLoader

    @FXML // fx:id="tblColumnPrice"
    private TableColumn<Event, String> tblColumnPrice; // Value injected by FXMLLoader

    @FXML // fx:id="tblColumnCategory"
    private TableColumn<Event, Category> tblColumnCategory; // Value injected by FXMLLoader

    @FXML // fx:id="tblColumnTime"
    private TableColumn<Event, String> tblColumnTime; // Value injected by FXMLLoader

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert tblColumnType != null : "fx:id=\"tblColumnType\" was not injected: check your FXML file 'FinalizedEvents.fxml'.";
        assert tblColumnLecturer != null : "fx:id=\"tblColumnLecturer\" was not injected: check your FXML file 'FinalizedEvents.fxml'.";
        assert AnchorPaneFinalizedEvents != null : "fx:id=\"AnchorPaneFinalizedEvents\" was not injected: check your FXML file 'FinalizedEvents.fxml'.";
        assert tblColumnDate != null : "fx:id=\"tblColumnDate\" was not injected: check your FXML file 'FinalizedEvents.fxml'.";
        assert tblColumnDuration != null : "fx:id=\"tblColumnDuration\" was not injected: check your FXML file 'FinalizedEvents.fxml'.";
        assert tblFinalizedEvent != null : "fx:id=\"tblFinalizedEvent\" was not injected: check your FXML file 'FinalizedEvents.fxml'.";
        assert tblColumnPrice != null : "fx:id=\"tblColumnPrice\" was not injected: check your FXML file 'FinalizedEvents.fxml'.";
        assert tblColumnCategory != null : "fx:id=\"tblColumnCategory\" was not injected: check your FXML file 'FinalizedEvents.fxml'.";
        assert tblColumnTime != null : "fx:id=\"tblColumnTime\" was not injected: check your FXML file 'FinalizedEvents.fxml'.";

    }
}
