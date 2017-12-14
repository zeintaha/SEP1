/**
 * Sample Skeleton for 'AddMember.fxml' Controller Class
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

public class AddMemberController implements Initializable
{
   private ArrayList<Members> members;
   private ToBinary file;
   private String filename = "members.txt";
   ArrayList<Category> categories;

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="txtPhone"
    private TextField txtPhone; // Value injected by FXMLLoader

    @FXML // fx:id="btnAddMember"
    private Button btnAddMember; // Value injected by FXMLLoader

    @FXML // fx:id="txtName"
    private TextField txtName; // Value injected by FXMLLoader

    @FXML // fx:id="cmbSelectCategory"
    private ComboBox<Category> cmbSelectCategory; // Value injected by FXMLLoader

    @FXML // fx:id="dteStartOfMembership"
    private DatePicker dteStartOfMembership; // Value injected by FXMLLoader

    @FXML // fx:id="txtAddress"
    private TextField txtAddress; // Value injected by FXMLLoader

    @FXML // fx:id="txtEmail"
    private TextField txtEmail; // Value injected by FXMLLoader

    @FXML // fx:id="anchorPaneAddMember"
    private AnchorPane anchorPaneAddMember; // Value injected by FXMLLoader

    @FXML
    void selectCategory(ActionEvent event) {

    }

    @FXML
    void selectDate(ActionEvent event) {

    }



    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert txtPhone != null : "fx:id=\"txtPhone\" was not injected: check your FXML file 'AddMember.fxml'.";
        assert btnAddMember != null : "fx:id=\"btnAddMember\" was not injected: check your FXML file 'AddMember.fxml'.";
        assert txtName != null : "fx:id=\"txtName\" was not injected: check your FXML file 'AddMember.fxml'.";
        assert cmbSelectCategory != null : "fx:id=\"cmbSelectCategory\" was not injected: check your FXML file 'AddMember.fxml'.";
        assert dteStartOfMembership != null : "fx:id=\"dteStartOfMembership\" was not injected: check your FXML file 'AddMember.fxml'.";
        assert txtAddress != null : "fx:id=\"txtAddress\" was not injected: check your FXML file 'AddMember.fxml'.";
        assert txtEmail != null : "fx:id=\"txtEmail\" was not injected: check your FXML file 'AddMember.fxml'.";
        assert anchorPaneAddMember != null : "fx:id=\"anchorPaneAddMember\" was not injected: check your FXML file 'AddMember.fxml'.";

    }
    
    @SuppressWarnings("unchecked")
    @FXML
    public void addMember()
    {
       Non_Members non = new Non_Members(txtName.getText(), txtAddress.getText(),
             txtEmail.getText(), txtPhone.getText(),
             cmbSelectCategory.getSelectionModel().getSelectedItem().toString());
       MyDate date = new MyDate(dteStartOfMembership.getValue().getDayOfMonth(),
             dteStartOfMembership.getValue().getMonthValue(),
             dteStartOfMembership.getValue().getYear());
       Members member = new Members(non, date);
       members = (ArrayList<Members>) file.readObjFromFile();
       members.add(member);
       file.writeObjToFile(members);
       JOptionPane.showMessageDialog(null, member.toString() + " Added ");
    }

    @SuppressWarnings("unchecked")
    private void showWrittenData()
    {
       ArrayList<Members> list = (ArrayList<Members>) file.readObjFromFile();
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
       filename = "members.txt";
       file = new ToBinary(filename);
       members = new ArrayList<Members>();
       showWrittenData();
    }
}
