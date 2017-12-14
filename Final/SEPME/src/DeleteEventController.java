/**
 * Sample Skeleton for 'DeleteEvent.fxml' Controller Class
 */

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.layout.AnchorPane;

public class DeleteEventController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="AnchorPaneDeleteEvent"
    private AnchorPane AnchorPaneDeleteEvent; // Value injected by FXMLLoader

    @FXML // fx:id="dteDate"
    private DatePicker dteDate; // Value injected by FXMLLoader

    @FXML // fx:id="cmbSelectEvent"
    private ComboBox<?> cmbSelectEvent; // Value injected by FXMLLoader

    @FXML // fx:id="cmbSelectCategory"
    private ComboBox<?> cmbSelectCategory; // Value injected by FXMLLoader

    @FXML // fx:id="cmbSelectType"
    private ComboBox<?> cmbSelectType; // Value injected by FXMLLoader

    @FXML // fx:id="btnDeleteEvent"
    private Button btnDeleteEvent; // Value injected by FXMLLoader

    @FXML
    void selectDate(ActionEvent event) {

    }

    @FXML
    void selectEvent(ActionEvent event) {

    }

    @FXML
    void deleteEvent(ActionEvent event) {

    }

    @FXML
    void selectCategory(ActionEvent event) {

    }

    @FXML
    void selectType(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert AnchorPaneDeleteEvent != null : "fx:id=\"AnchorPaneDeleteEvent\" was not injected: check your FXML file 'DeleteEvent.fxml'.";
        assert dteDate != null : "fx:id=\"dteDate\" was not injected: check your FXML file 'DeleteEvent.fxml'.";
        assert cmbSelectEvent != null : "fx:id=\"cmbSelectEvent\" was not injected: check your FXML file 'DeleteEvent.fxml'.";
        assert cmbSelectCategory != null : "fx:id=\"cmbSelectCategory\" was not injected: check your FXML file 'DeleteEvent.fxml'.";
        assert cmbSelectType != null : "fx:id=\"cmbSelectType\" was not injected: check your FXML file 'DeleteEvent.fxml'.";
        assert btnDeleteEvent != null : "fx:id=\"btnDeleteEvent\" was not injected: check your FXML file 'DeleteEvent.fxml'.";

    }
}
