/**
 * Sample Skeleton for 'SponsorsGivenCategory.fxml' Controller Class
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
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

public class SponsorsGivenCategoryController implements Initializable
{

   private ArrayList<Sponsor> sponsorArray = new ArrayList<Sponsor>();
   private ToBinary file;
   private String filename = "sponsor.txt";
   private static ObservableList<Sponsor> observableSponsor;

   private ArrayList<Category> categories = new ArrayList<Category>();

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="tblSponsors"
    private TableView<Sponsor> tblSponsors; // Value injected by FXMLLoader

    @FXML // fx:id="tblColumnPhone"
    private TableColumn<Sponsor, String> tblColumnPhone; // Value injected by FXMLLoader

    @FXML // fx:id="tblColumnName"
    private TableColumn<Sponsor, String> tblColumnName; // Value injected by FXMLLoader

    @FXML // fx:id="txtGivenCategory"
    private TextField txtGivenCategory; // Value injected by FXMLLoader

    @FXML // fx:id="cmbSelectCategory"
    private ComboBox<Category> cmbSelectCategory; // Value injected by FXMLLoader

    @FXML // fx:id="tblColumnEmail"
    private TableColumn<Sponsor, String> tblColumnEmail; // Value injected by FXMLLoader

    @FXML // fx:id="tblColumnAddress"
    private TableColumn<Sponsor, String> tblColumnAddress; // Value injected by FXMLLoader

    @FXML // fx:id="btnSearchCategory"
    private Button btnSearchCategory; // Value injected by FXMLLoader

    @FXML // fx:id="AnchorPaneSponsors"
    private AnchorPane AnchorPaneSponsors; // Value injected by FXMLLoader

    @FXML // fx:id="tblColumnCategory"
    private TableColumn<Sponsor, String> tblColumnCategory; // Value injected by FXMLLoader

    @SuppressWarnings("unchecked")
   @FXML
    void selectCategory(ActionEvent event) {
       
       ArrayList<Sponsor> sponsors = new ArrayList<Sponsor>();
       sponsorArray = (ArrayList<Sponsor>) file.readObjFromFile();
       for (int i = 0; i < sponsorArray.size(); i++)
       {
          if ((cmbSelectCategory.getSelectionModel().getSelectedItem().toString()).equals("Show All")){
             sponsors.add(sponsorArray.get(i));
             
          }
          if (sponsorArray.get(i).getCategory().toString()
                .equals(cmbSelectCategory.getSelectionModel().getSelectedItem().toString()))
          {
             sponsors.add(sponsorArray.get(i));
          }
       }

       observableSponsor = FXCollections
             .observableList(sponsors);
       tblSponsors.setItems(observableSponsor);
       System.out.println(observableSponsor.toString());

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert tblSponsors != null : "fx:id=\"tblSponsors\" was not injected: check your FXML file 'SponsorsGivenCategory.fxml'.";
        assert tblColumnPhone != null : "fx:id=\"tblColumnPhone\" was not injected: check your FXML file 'SponsorsGivenCategory.fxml'.";
        assert tblColumnName != null : "fx:id=\"tblColumnName\" was not injected: check your FXML file 'SponsorsGivenCategory.fxml'.";
        assert txtGivenCategory != null : "fx:id=\"txtGivenCategory\" was not injected: check your FXML file 'SponsorsGivenCategory.fxml'.";
        assert cmbSelectCategory != null : "fx:id=\"cmbSelectCategory\" was not injected: check your FXML file 'SponsorsGivenCategory.fxml'.";
        assert tblColumnEmail != null : "fx:id=\"tblColumnEmail\" was not injected: check your FXML file 'SponsorsGivenCategory.fxml'.";
        assert tblColumnAddress != null : "fx:id=\"tblColumnAddress\" was not injected: check your FXML file 'SponsorsGivenCategory.fxml'.";
        assert btnSearchCategory != null : "fx:id=\"btnSearchCategory\" was not injected: check your FXML file 'SponsorsGivenCategory.fxml'.";
        assert AnchorPaneSponsors != null : "fx:id=\"AnchorPaneSponsors\" was not injected: check your FXML file 'SponsorsGivenCategory.fxml'.";
        assert tblColumnCategory != null : "fx:id=\"tblColumnCategory\" was not injected: check your FXML file 'SponsorsGivenCategory.fxml'.";

    }
    
    @SuppressWarnings("unchecked")
    public void initializeTable()
    {
       sponsorArray = new ArrayList<Sponsor>();

       tblColumnName.setCellValueFactory(
             new PropertyValueFactory<Sponsor, String>("name"));
       tblColumnEmail.setCellValueFactory(
             new PropertyValueFactory<Sponsor, String>("email"));
       tblColumnPhone.setCellValueFactory(
             new PropertyValueFactory<Sponsor, String>("phone"));
       tblColumnAddress.setCellValueFactory(
             new PropertyValueFactory<Sponsor, String>("address"));
       tblColumnCategory.setCellValueFactory(
             new PropertyValueFactory<Sponsor, String>("category"));
       observableSponsor = FXCollections
             .observableList((ArrayList<Sponsor>) file.readObjFromFile());
       tblSponsors.setItems(observableSponsor);
       tblSponsors.setStyle("-fx-alignment: CENTER;");
    }


    void searchCategory()
    {
       
    }

    @SuppressWarnings("unchecked")
    private void showWrittenData()
    {
       ArrayList<Sponsor> list = (ArrayList<Sponsor>) file.readObjFromFile();
       for (int i = 0; i < list.size(); i++)
       {
          System.out.println(list.get(i));
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
    @Override
    public void initialize(URL arg0, ResourceBundle arg1)
    {
       filename = "categories.txt";
       file = new ToBinary(filename);
       refreshComboBox();
       filename = "sponsor.txt";
       file = new ToBinary(filename);
       sponsorArray = new ArrayList<Sponsor>();
       sponsorArray = (ArrayList<Sponsor>) file.readObjFromFile();
       initializeTable();
       showWrittenData();
    }

}
