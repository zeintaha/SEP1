
/**
 * Sample Skeleton for 'AddNoneMember.fxml' Controller Class
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

public class AddNoneMemberController implements Initializable
{
   private ArrayList<Non_Members> nonMemberArray;
   private ToBinary file;
   private String filename = "nonmember.txt";
   ArrayList<Category> categories;

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="txtPhone"
    private TextField txtPhone; // Value injected by FXMLLoader

    @FXML // fx:id="txtName"
    private TextField txtName; // Value injected by FXMLLoader

    @FXML // fx:id="cmbSelectCategory"
    private ComboBox<Category> cmbSelectCategory; // Value injected by FXMLLoader

    @FXML // fx:id="txtAddress"
    private TextField txtAddress; // Value injected by FXMLLoader

    @FXML // fx:id="txtEmail"
    private TextField txtEmail; // Value injected by FXMLLoader

    @FXML // fx:id="anchorPaneAddNoneMember"
    private AnchorPane anchorPaneAddNoneMember; // Value injected by FXMLLoader

    @FXML // fx:id="btnAddNoneMember"
    private Button btnAddNoneMember; // Value injected by FXMLLoader

    @FXML
    void selectCategory(ActionEvent event) {

    }


    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert txtPhone != null : "fx:id=\"txtPhone\" was not injected: check your FXML file 'AddNoneMember.fxml'.";
        assert txtName != null : "fx:id=\"txtName\" was not injected: check your FXML file 'AddNoneMember.fxml'.";
        assert cmbSelectCategory != null : "fx:id=\"cmbSelectCategory\" was not injected: check your FXML file 'AddNoneMember.fxml'.";
        assert txtAddress != null : "fx:id=\"txtAddress\" was not injected: check your FXML file 'AddNoneMember.fxml'.";
        assert txtEmail != null : "fx:id=\"txtEmail\" was not injected: check your FXML file 'AddNoneMember.fxml'.";
        assert anchorPaneAddNoneMember != null : "fx:id=\"anchorPaneAddNoneMember\" was not injected: check your FXML file 'AddNoneMember.fxml'.";
        assert btnAddNoneMember != null : "fx:id=\"btnAddNoneMember\" was not injected: check your FXML file 'AddNoneMember.fxml'.";

    }
    

    @SuppressWarnings("unchecked")
    public void addNoneMember() throws FileNotFoundException
    {
       Non_Members nmb = new Non_Members(txtName.getText(), txtAddress.getText(),
             txtPhone.getText(), txtEmail.getText(),cmbSelectCategory.getSelectionModel().getSelectedItem().toString());
       nonMemberArray = (ArrayList<Non_Members>) file.readObjFromFile();
       nonMemberArray.add(nmb);
       file.writeObjToFile(nonMemberArray);
    }


    @SuppressWarnings("unchecked")
    private void showWrittenData()
    {
       ArrayList<Non_Members> list = (ArrayList<Non_Members>) file.readObjFromFile();
       for (int i = 0; i < list.size(); i++)
       {
          System.out.println(list.get(i));
       }
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
       filename = "nonmember.txt";
       file = new ToBinary(filename);
       nonMemberArray = new ArrayList<Non_Members>();
       showWrittenData();
    }
}
