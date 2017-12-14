/**
 * Sample Skeleton for 'EditSponsor.fxml' Controller Class
 */

import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class EditSponsorController implements Initializable{
   
   private ArrayList<Sponsor> sponsorArray;
   private ToBinary file;
   private String filename = "sponsor.txt";
   ArrayList<Category> categories;

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="AnchorPaneEditSponsor"
    private AnchorPane AnchorPaneEditSponsor; // Value injected by FXMLLoader

    @FXML // fx:id="txtPhone"
    private TextField txtPhone; // Value injected by FXMLLoader

    @FXML // fx:id="btnSaveChanges"
    private Button btnSaveChanges; // Value injected by FXMLLoader

    @FXML // fx:id="btnSearch"
    private Button btnSearch; // Value injected by FXMLLoader

    @FXML // fx:id="txtName"
    private TextField txtName; // Value injected by FXMLLoader

    @FXML // fx:id="txtSponsorName"
    private TextField txtSponsorName; // Value injected by FXMLLoader

    @FXML // fx:id="cmbSelectCategory"
    private ComboBox<Category> cmbSelectCategory; // Value injected by FXMLLoader

    @FXML // fx:id="txtAddress"
    private TextField txtAddress; // Value injected by FXMLLoader

    @FXML // fx:id="txtEmail"
    private TextField txtEmail; // Value injected by FXMLLoader







    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert AnchorPaneEditSponsor != null : "fx:id=\"AnchorPaneEditSponsor\" was not injected: check your FXML file 'EditSponsor.fxml'.";
        assert txtPhone != null : "fx:id=\"txtPhone\" was not injected: check your FXML file 'EditSponsor.fxml'.";
        assert btnSaveChanges != null : "fx:id=\"btnSaveChanges\" was not injected: check your FXML file 'EditSponsor.fxml'.";
        assert btnSearch != null : "fx:id=\"btnSearch\" was not injected: check your FXML file 'EditSponsor.fxml'.";
        assert txtName != null : "fx:id=\"txtName\" was not injected: check your FXML file 'EditSponsor.fxml'.";
        assert txtSponsorName != null : "fx:id=\"txtSponsorName\" was not injected: check your FXML file 'EditSponsor.fxml'.";
        assert cmbSelectCategory != null : "fx:id=\"cmbSelectCategory\" was not injected: check your FXML file 'EditSponsor.fxml'.";
        assert txtAddress != null : "fx:id=\"txtAddress\" was not injected: check your FXML file 'EditSponsor.fxml'.";
        assert txtEmail != null : "fx:id=\"txtEmail\" was not injected: check your FXML file 'EditSponsor.fxml'.";

    }
    
    @SuppressWarnings("unchecked")
    @FXML
    private void searchSponsor() throws FileNotFoundException
    {
       sponsorArray = new ArrayList<Sponsor>();
       sponsorArray = (ArrayList<Sponsor>) file.readObjFromFile();

       String nameSponsor = txtSponsorName.getText();

       for (int i = 0; i < sponsorArray.size(); i++)
       {
          if (sponsorArray.get(i).getName().equals(nameSponsor))
          {
             txtName.setText(sponsorArray.get(i).getName());
             txtEmail.setText(sponsorArray.get(i).getAddress());
             txtPhone.setText(sponsorArray.get(i).getPhone());
             txtAddress.setText(sponsorArray.get(i).getEmail());
             sponsorArray.remove(sponsorArray.get(i));
  
          }
       }
    }

    @FXML
    private void selectCategory()
    {

    }

    @SuppressWarnings("unchecked")
   @FXML
    private void saveChanges() throws FileNotFoundException
    {
       Sponsor sps = new Sponsor(txtName.getText(), txtEmail.getText(),
             txtPhone.getText(), txtAddress.getText(),
             cmbSelectCategory.getSelectionModel().getSelectedItem().toString());
       //sponsorArray = (ArrayList<Sponsor>) file.readObjFromFile();
       sponsorArray.add(sps);
       file.writeObjToFile(sponsorArray);
    }

    @SuppressWarnings("unchecked")
    private void showWrittenData()
    {
       ArrayList<Sponsor> list = (ArrayList<Sponsor>) file.readObjFromFile();
       for (int i = 0; i < list.size(); i++)
       {
          System.out.println(list.get(i));
       }
       System.out.println(list.get(0).getName());
    }

    @SuppressWarnings("unchecked")
    public void refreshComboBox()
    {
       categories = new ArrayList<Category>();
       categories = (ArrayList<Category>) file.readObjFromFile();
       cmbSelectCategory.getItems().addAll(categories);
    }

    @Override
    public void initialize(URL arg0, ResourceBundle arg1)
    {
       filename = "categories.txt";
       file = new ToBinary(filename);
       categories = new ArrayList<Category>();
       refreshComboBox();
       filename = "sponsor.txt";
       file = new ToBinary(filename);
       sponsorArray = new ArrayList<Sponsor>();
       showWrittenData();
    }
}
