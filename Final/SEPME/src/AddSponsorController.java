/**
 * Sample Skeleton for 'AddSponsor.fxml' Controller Class
 */

import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class AddSponsorController implements Initializable {
   
   private ArrayList<Sponsor> sponsorArray;
   private ToBinary file;
   private String filename = "sponsor.txt";
   ArrayList<Category> categories;

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="txtPhone"
    private TextField txtPhone; // Value injected by FXMLLoader

    @FXML // fx:id="btnAddSponsor"
    private Button btnAddSponsor; // Value injected by FXMLLoader

    @FXML // fx:id="txtName"
    private TextField txtName; // Value injected by FXMLLoader

    @FXML // fx:id="cmbSelectCategory"
    private ComboBox<Category> cmbSelectCategory; // Value injected by FXMLLoader

    @FXML // fx:id="txtAddress"
    private TextField txtAddress; // Value injected by FXMLLoader

    @FXML // fx:id="txtEmail"
    private TextField txtEmail; // Value injected by FXMLLoader

    @FXML // fx:id="AnchorPaneAddSponsor"
    private AnchorPane AnchorPaneAddSponsor; // Value injected by FXMLLoader

    @FXML
    void selectCategory(ActionEvent event) {

    }


    @SuppressWarnings("unchecked")
    public void addSponsor() throws FileNotFoundException
    {
       Sponsor sps = new Sponsor(txtName.getText(), txtAddress.getText(),
       txtPhone.getText(), txtEmail.getText(),
       cmbSelectCategory.getSelectionModel().getSelectedItem().toString());
       sponsorArray = (ArrayList<Sponsor>) file.readObjFromFile();
       sponsorArray.add(sps);
       file.writeObjToFile(sponsorArray);
       JOptionPane.showMessageDialog(null, sps.toString() + " Added ");
       txtName.setText(""); 
       txtAddress.setText(""); 
       txtPhone.setText(""); 
       txtEmail.setText(""); 
       
       
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
       showWrittenData();
    }
}
