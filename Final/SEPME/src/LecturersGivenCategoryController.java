/**
 * Sample Skeleton for 'LecturersGivenCategory.fxml' Controller Class
 */

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

public class LecturersGivenCategoryController  implements Initializable
{

   private ArrayList<Lecturer> lecturersArray = new ArrayList<Lecturer>();
   private ToBinary file;
   private String filename = "lecturers.txt";
   private static ObservableList<Lecturer> observableLecturers;

   private ArrayList<Category> categories = new ArrayList<Category>();

   
   @FXML // fx:id="cmbSelectCategory"
   private ComboBox<Category> cmbSelectCategory; // Value injected by FXMLLoader

   @FXML
   private ResourceBundle resources;

   @FXML
   private URL location;

   @FXML // fx:id="tblColumnPhone"
   private TableColumn<Lecturer, String> tblColumnPhone = new TableColumn<Lecturer, String>();

   @FXML // fx:id="btnSearch"
   private Button btnSearch;

   @FXML // fx:id="tblColumnName"
   private TableColumn<Lecturer, String> tblColumnName = new TableColumn<Lecturer, String>();

   @FXML // fx:id="AnchorPaneLecturers"
   private Label AnchorPaneLecturers;

   @FXML // fx:id="tblColumnEmail"
   private TableColumn<Lecturer, String> tblColumnEmail = new TableColumn<Lecturer, String>();

   @FXML // fx:id="tblColumnAddress"
   private TableColumn<Lecturer, String> tblColumnAddress = new TableColumn<Lecturer, String>();

   @FXML // fx:id="AnchorPaneSponsors"
   private AnchorPane AnchorPaneSponsors;

   @FXML
   private TextField txtCategory;

   @FXML // fx:id="tblLecturers"
   private TableView<Lecturer> tblLecturers;

   @FXML // fx:id="tblColumnCategory"
   private TableColumn<Lecturer, String> tblColumnCategory = new TableColumn<Lecturer, String>();



    @SuppressWarnings("unchecked")
   @FXML
    void selectCategory(ActionEvent event) {
       
       ArrayList<Lecturer> lec = new ArrayList<Lecturer>();
       lecturersArray = (ArrayList<Lecturer>) file.readObjFromFile();
       for (int i = 0; i < lecturersArray.size(); i++)
       {
          if ((cmbSelectCategory.getSelectionModel().getSelectedItem().toString()).equals("Show All")){
             lec.add(lecturersArray.get(i));
             
          }
          else if (lecturersArray.get(i).getCategory().toString()
                .equals(cmbSelectCategory.getSelectionModel().getSelectedItem().toString()))
          {
             lec.add(lecturersArray.get(i));
          }
       }
       observableLecturers = FXCollections
             .observableList(lec);
       tblLecturers.setItems(observableLecturers);
       System.out.println();

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert tblColumnPhone != null : "fx:id=\"tblColumnPhone\" was not injected: check your FXML file 'LecturersGivenCategory.fxml'.";
        assert btnSearch != null : "fx:id=\"btnSearch\" was not injected: check your FXML file 'LecturersGivenCategory.fxml'.";
        assert txtCategory != null : "fx:id=\"txtCategory\" was not injected: check your FXML file 'LecturersGivenCategory.fxml'.";
        assert tblColumnName != null : "fx:id=\"tblColumnName\" was not injected: check your FXML file 'LecturersGivenCategory.fxml'.";
        assert cmbSelectCategory != null : "fx:id=\"cmbSelectCategory\" was not injected: check your FXML file 'LecturersGivenCategory.fxml'.";
        assert AnchorPaneLecturers != null : "fx:id=\"AnchorPaneLecturers\" was not injected: check your FXML file 'LecturersGivenCategory.fxml'.";
        assert tblColumnEmail != null : "fx:id=\"tblColumnEmail\" was not injected: check your FXML file 'LecturersGivenCategory.fxml'.";
        assert tblColumnAddress != null : "fx:id=\"tblColumnAddress\" was not injected: check your FXML file 'LecturersGivenCategory.fxml'.";
        assert AnchorPaneSponsors != null : "fx:id=\"AnchorPaneSponsors\" was not injected: check your FXML file 'LecturersGivenCategory.fxml'.";
        assert tblLecturers != null : "fx:id=\"tblLecturers\" was not injected: check your FXML file 'LecturersGivenCategory.fxml'.";
        assert tblColumnCategory != null : "fx:id=\"tblColumnCategory\" was not injected: check your FXML file 'LecturersGivenCategory.fxml'.";

    }
    
    @SuppressWarnings("unchecked")
    public void initializeTable()
    {
       lecturersArray = new ArrayList<Lecturer>();

       tblColumnName.setCellValueFactory(
             new PropertyValueFactory<Lecturer, String>("name"));
       tblColumnAddress.setCellValueFactory(
             new PropertyValueFactory<Lecturer, String>("address"));
       tblColumnPhone.setCellValueFactory(
             new PropertyValueFactory<Lecturer, String>("phoneNr"));
       tblColumnEmail.setCellValueFactory(
             new PropertyValueFactory<Lecturer, String>("email"));
       tblColumnCategory.setCellValueFactory(
             new PropertyValueFactory<Lecturer, String>("category"));
      
       
       
       observableLecturers = FXCollections
             .observableList((ArrayList<Lecturer>) file.readObjFromFile());
       tblLecturers.setItems(observableLecturers);
       tblLecturers.setStyle("-fx-alignment: CENTER;");
    }


    @FXML
    void search()
    {
            
    }

    @SuppressWarnings("unchecked")
    private void showWrittenData()
    {
       ArrayList<Lecturer> list = (ArrayList<Lecturer>) file.readObjFromFile();
       for (int i = 0; i < list.size(); i++)
       {
          System.out.println(list.get(i));
          System.out.println(lecturersArray);
       }
    }
    
    @SuppressWarnings("unchecked")
   public void refreshComboBox()
    {
       categories = new ArrayList<Category>();
       
       String category = "Show All";
       Category cat = new Category(category);
       
       
       categories = (ArrayList<Category>) file.readObjFromFile();
       categories.add(cat);
       cmbSelectCategory.getItems().addAll(categories);
    }

    @SuppressWarnings("unchecked")
    public void initialize(URL arg0, ResourceBundle arg1)
    {
 
       filename = "categories.txt";
       file = new ToBinary(filename);
       refreshComboBox();
       filename = "lecturers.txt";
       file = new ToBinary(filename);
       lecturersArray = new ArrayList<Lecturer>();
       lecturersArray = (ArrayList<Lecturer>) file.readObjFromFile();
       
       showWrittenData();
       initializeTable();

    }
}
