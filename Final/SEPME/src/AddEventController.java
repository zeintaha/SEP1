
/**
 * Sample Skeleton for 'AddEvent.fxml' Controller Class
 */

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;

public class AddEventController {

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="dteStartDate"
    private DatePicker dteStartDate; // Value injected by FXMLLoader

    @FXML // fx:id="cmbSelectCategory"
    private ComboBox<?> cmbSelectCategory; // Value injected by FXMLLoader

    @FXML // fx:id="cmbSelectType"
    private ComboBox<?> cmbSelectType; // Value injected by FXMLLoader

    @FXML // fx:id="txtPrice"
    private TextField txtPrice; // Value injected by FXMLLoader

    @FXML // fx:id="btnAddEvent"
    private Button btnAddEvent; // Value injected by FXMLLoader

    @FXML // fx:id="txtDuration"
    private TextField txtDuration; // Value injected by FXMLLoader

    @FXML // fx:id="txtLecturer"
    private TextField txtLecturer; // Value injected by FXMLLoader

    @FXML // fx:id="txtTime"
    private TextField txtTime; // Value injected by FXMLLoader

    @FXML // fx:id="txtTitle"
    private TextField txtTitle; // Value injected by FXMLLoader

    @FXML
    void addEvent(ActionEvent event) {

    }

    @FXML
    void selectDate(ActionEvent event) {

    }

    @FXML
    void selectCategory(ActionEvent event) {

    }

    @FXML
    void selecType(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert dteStartDate != null : "fx:id=\"dteStartDate\" was not injected: check your FXML file 'AddEvent.fxml'.";
        assert cmbSelectCategory != null : "fx:id=\"cmbSelectCategory\" was not injected: check your FXML file 'AddEvent.fxml'.";
        assert cmbSelectType != null : "fx:id=\"cmbSelectType\" was not injected: check your FXML file 'AddEvent.fxml'.";
        assert txtPrice != null : "fx:id=\"txtPrice\" was not injected: check your FXML file 'AddEvent.fxml'.";
        assert btnAddEvent != null : "fx:id=\"btnAddEvent\" was not injected: check your FXML file 'AddEvent.fxml'.";
        assert txtDuration != null : "fx:id=\"txtDuration\" was not injected: check your FXML file 'AddEvent.fxml'.";
        assert txtLecturer != null : "fx:id=\"txtLecturer\" was not injected: check your FXML file 'AddEvent.fxml'.";
        assert txtTime != null : "fx:id=\"txtTime\" was not injected: check your FXML file 'AddEvent.fxml'.";
        assert txtTitle != null : "fx:id=\"txtTitle\" was not injected: check your FXML file 'AddEvent.fxml'.";

    }
}

