/**
 * Sample Skeleton for 'EditEvent.fxml' Controller Class
 */

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class EditEventController implements Initializable {
   private ArrayList<Event> events;
   private ToBinary file;
   private String filename = "events.txt";
   ArrayList<Category> categories;
   int index = 0;

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="AnchorPaneEditEvent"
    private AnchorPane AnchorPaneEditEvent; // Value injected by FXMLLoader

    @FXML // fx:id="cmbSelectEvent"
    private ComboBox<String> cmbSelectEvent; // Value injected by FXMLLoader

    @FXML // fx:id="cmbSelectCategory"
    private ComboBox<Category> cmbSelectCategory; // Value injected by FXMLLoader

    @FXML // fx:id="cmbSelectTypeEdit"
    private ComboBox<String> cmbSelectTypeEdit; // Value injected by FXMLLoader

    @FXML // fx:id="dteDateEdit"
    private DatePicker dteDateEdit; // Value injected by FXMLLoader

    @FXML // fx:id="txtDuration"
    private TextField txtDuration; // Value injected by FXMLLoader

    @FXML // fx:id="txtLecturer"
    private TextField txtLecturer; // Value injected by FXMLLoader

    @FXML // fx:id="btnSaveChanges"
    private Button btnSaveChanges; // Value injected by FXMLLoader

    @FXML // fx:id="dteDate"
    private DatePicker dteDate; // Value injected by FXMLLoader

    @FXML // fx:id="cmbSelectType"
    private ComboBox<String> cmbSelectType; // Value injected by FXMLLoader

    @FXML // fx:id="cmbSelectCategoryEdit"
    private ComboBox<Category> cmbSelectCategoryEdit; // Value injected by FXMLLoader

    @FXML // fx:id="txtPrice"
    private TextField txtPrice; // Value injected by FXMLLoader

    @FXML // fx:id="txtTitle"
    private TextField txtTitle; // Value injected by FXMLLoader

    @FXML // fx:id="txtTime"
    private TextField txtTime; // Value injected by FXMLLoader
    
    @SuppressWarnings("unchecked")
   private void setSelectCategoryCMBX()
    {
       categories = new ArrayList<Category>();
       filename = "categories.txt";
       file = new ToBinary(filename);
       categories = (ArrayList<Category>) file.readObjFromFile();
       cmbSelectCategory.getItems().clear();
       cmbSelectCategory.getItems().addAll(categories);
       cmbSelectCategoryEdit.getItems().addAll(categories);
    }
    
    private void setSelectTypeCMBX()
    {
       String[] type = { "Meditation", "Workshop", "Journey", "Training" };
       cmbSelectType.getItems().add(type[0]);
       cmbSelectType.getItems().add(type[1]);
       cmbSelectType.getItems().add(type[2]);
       cmbSelectType.getItems().add(type[3]);
       cmbSelectTypeEdit.getItems().add(type[0]);
       cmbSelectTypeEdit.getItems().add(type[1]);
       cmbSelectTypeEdit.getItems().add(type[2]);
       cmbSelectTypeEdit.getItems().add(type[3]);
    }
    
    @FXML
    void selectDateFind(ActionEvent event) {
       ArrayList<Event> events2 = new ArrayList<>();
       MyDate date = new MyDate(dteDate.getValue().getDayOfMonth(),
       dteDate.getValue().getMonthValue(), dteDate.getValue().getYear());
      for (int i = 0; i < events.size(); i++)
      {
         if (events.get(i).getDate().equals(date))         
               {
                  events2.add(events.get(i));
               }
      }
      cmbSelectEvent.getItems().clear();
      for(int i = 0; i < events2.size(); i++) {
      cmbSelectEvent.getItems().add(events2.get(i).getTitle());
      }
      System.out.println(events2.toString());
    }

    @FXML
    public void selectEventFind(ActionEvent event) {
       String eventToEdit = cmbSelectEvent.getSelectionModel()
             .getSelectedItem();
       for (int i = 0; i < events.size(); i++)
       {
          if (events.get(i).getTitle().toString().equals(eventToEdit.toString()))
          {
             index = i;
          }
       }
       txtTitle.setText(events.get(index).getTitle());
       txtTime.setText(events.get(index).getTime());
       txtDuration.setText(events.get(index).getDuration());
       txtLecturer.setText(events.get(index).getLecturer().getName());
       txtPrice.setText(String.valueOf(events.get(index).getPrice()));
    }

    @SuppressWarnings("unchecked")
   @FXML
    public void saveChanges(ActionEvent event) {
       MyDate date = new MyDate();
       date = new MyDate(dteDateEdit.getValue().getDayOfMonth(),
             dteDateEdit.getValue().getMonthValue(),
             dteDateEdit.getValue().getYear());
       filename = "lecturers.txt";
       file = new ToBinary(filename);
       Lecturer lecturer = null;
       ArrayList<Lecturer> lec = (ArrayList<Lecturer>) file.readObjFromFile();
       for (int i = 0; i < lec.size(); i++)
       {
          if (lec.get(i).getName().toString()
                .equals(txtLecturer.getText().toString()))
          {
             lecturer = lec.get(i);
          }
       }
       Category cat = new Category(
             cmbSelectCategoryEdit.getSelectionModel().getSelectedItem().toString());
       Event eve = new Event(cat,
             cmbSelectTypeEdit.getSelectionModel().getSelectedItem().toString(),
             txtTitle.getText(), date, txtTime.getText(), txtDuration.getText(),
             lecturer, Double.parseDouble(txtPrice.getText()),
             Double.parseDouble(txtPrice.getText()) * 0.8);

       events.remove(index);
       events.add(index, eve);
       
       filename = "events.txt";
       file = new ToBinary(filename);
       file.writeObjToFile(events);
       JOptionPane.showMessageDialog(null, eve.toString() + " Added ");
    }

    @FXML
    void selectCategoryFind(ActionEvent event) {
       ArrayList<Event> events2 = new ArrayList<>();
       Category category = cmbSelectCategory.getSelectionModel()
             .getSelectedItem();
       for (int i = 0; i < events.size(); i++)
       {
          if (events.get(i).getCategory().toString().equals(category.toString()))
          {
             events2.add(events.get(i));
          }
       }
       cmbSelectEvent.getItems().clear();
       for(int i = 0; i < events2.size(); i++) {
       cmbSelectEvent.getItems().add(events2.get(i).getTitle());
       }
    }

    @FXML
    void selectTypeFind(ActionEvent event) {
       ArrayList<Event> events2 = new ArrayList<>();
       String type = cmbSelectType.getSelectionModel().getSelectedItem();
       for (int i = 0; i < events.size(); i++)
       {
          if (events.get(i).getType().toString().equals(type.toString()))
          {
             events2.add(events.get(i));
          }
       }
       cmbSelectEvent.getItems().clear();
       for(int i = 0; i < events2.size(); i++) {
       cmbSelectEvent.getItems().add(events2.get(i).getTitle());
       }
    }

    @FXML
    void selectCategoryEdit(ActionEvent event) {

    }

    @FXML
    void selectTypeEdit(ActionEvent event) {

    }

    @FXML
    void selectDateEdit(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert AnchorPaneEditEvent != null : "fx:id=\"AnchorPaneEditEvent\" was not injected: check your FXML file 'EditEvent.fxml'.";
        assert cmbSelectEvent != null : "fx:id=\"cmbSelectEvent\" was not injected: check your FXML file 'EditEvent.fxml'.";
        assert cmbSelectCategory != null : "fx:id=\"cmbSelectCategory\" was not injected: check your FXML file 'EditEvent.fxml'.";
        assert cmbSelectTypeEdit != null : "fx:id=\"cmbSelectTypeEdit\" was not injected: check your FXML file 'EditEvent.fxml'.";
        assert dteDateEdit != null : "fx:id=\"dteDateEdit\" was not injected: check your FXML file 'EditEvent.fxml'.";
        assert txtDuration != null : "fx:id=\"txtDuration\" was not injected: check your FXML file 'EditEvent.fxml'.";
        assert txtLecturer != null : "fx:id=\"txtLecturer\" was not injected: check your FXML file 'EditEvent.fxml'.";
        assert btnSaveChanges != null : "fx:id=\"btnSaveChanges\" was not injected: check your FXML file 'EditEvent.fxml'.";
        assert dteDate != null : "fx:id=\"dteDate\" was not injected: check your FXML file 'EditEvent.fxml'.";
        assert cmbSelectType != null : "fx:id=\"cmbSelectType\" was not injected: check your FXML file 'EditEvent.fxml'.";
        assert cmbSelectCategoryEdit != null : "fx:id=\"cmbSelectCategoryEdit\" was not injected: check your FXML file 'EditEvent.fxml'.";
        assert txtPrice != null : "fx:id=\"txtPrice\" was not injected: check your FXML file 'EditEvent.fxml'.";
        assert txtTitle != null : "fx:id=\"txtTitle\" was not injected: check your FXML file 'EditEvent.fxml'.";
        assert txtTime != null : "fx:id=\"txtTime\" was not injected: check your FXML file 'EditEvent.fxml'.";
    }
    
    @SuppressWarnings("unchecked")
    @Override
    public void initialize(URL arg0, ResourceBundle arg1)
    {
       setSelectCategoryCMBX();
       setSelectTypeCMBX();
       filename = "events.txt";
       file = new ToBinary(filename);
       events = new ArrayList<Event>();
       events = (ArrayList<Event>) file.readObjFromFile();
    }
}
