
/**
 * Sample Skeleton for 'EditMember.fxml' Controller Class
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

public class EditMemberController implements Initializable {
   
   private ArrayList<Members> memberArray;
   private ToBinary file;
   private String filename = "members.txt";
   private ArrayList<Category> categories;
   private MyDate date = new MyDate();
   private String iD = null;

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="txtMemberId"
    private TextField txtMemberId; // Value injected by FXMLLoader

    @FXML // fx:id="txtPhone"
    private TextField txtPhone; // Value injected by FXMLLoader

    @FXML // fx:id="btnSaveChanges"
    private Button btnSaveChanges; // Value injected by FXMLLoader

    @FXML // fx:id="txtName"
    private TextField txtName; // Value injected by FXMLLoader

    @FXML // fx:id="cmbSelectCategory"
    private ComboBox<Category> cmbSelectCategory; // Value injected by FXMLLoader

    @FXML // fx:id="txtAddress"
    private TextField txtAddress; // Value injected by FXMLLoader

    @FXML // fx:id="btnGetMember"
    private Button btnGetMember; // Value injected by FXMLLoader

    @FXML // fx:id="txtEmail"
    private TextField txtEmail; // Value injected by FXMLLoader

    @FXML // fx:id="AnchorPaneEditMember"
    private AnchorPane AnchorPaneEditMember; // Value injected by FXMLLoader



    @FXML
    void selectCategory(ActionEvent event) {

    }


    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert txtMemberId != null : "fx:id=\"txtMemberId\" was not injected: check your FXML file 'EditMember.fxml'.";
        assert txtPhone != null : "fx:id=\"txtPhone\" was not injected: check your FXML file 'EditMember.fxml'.";
        assert btnSaveChanges != null : "fx:id=\"btnSaveChanges\" was not injected: check your FXML file 'EditMember.fxml'.";
        assert txtName != null : "fx:id=\"txtName\" was not injected: check your FXML file 'EditMember.fxml'.";
        assert cmbSelectCategory != null : "fx:id=\"cmbSelectCategory\" was not injected: check your FXML file 'EditMember.fxml'.";
        assert txtAddress != null : "fx:id=\"txtAddress\" was not injected: check your FXML file 'EditMember.fxml'.";
        assert btnGetMember != null : "fx:id=\"btnGetMember\" was not injected: check your FXML file 'EditMember.fxml'.";
        assert txtEmail != null : "fx:id=\"txtEmail\" was not injected: check your FXML file 'EditMember.fxml'.";
        assert AnchorPaneEditMember != null : "fx:id=\"AnchorPaneEditMember\" was not injected: check your FXML file 'EditMember.fxml'.";

    }
    
    @SuppressWarnings("unchecked")
    public void getMember() throws FileNotFoundException
    {
       memberArray = new ArrayList<Members>();
       memberArray = (ArrayList<Members>) file.readObjFromFile();

       String iD = txtMemberId.getText();
       

       for (int i = 0; i < memberArray.size(); i++)
       {
          if (memberArray.get(i).getMember().getiD().equals(iD))
          {
             txtName.setText(memberArray.get(i).getMember().getName());
             txtAddress.setText(memberArray.get(i).getMember().getAddress());
             txtPhone.setText(memberArray.get(i).getMember().getPhoneNr());
             txtEmail.setText(memberArray.get(i).getMember().getEmail());
             iD = memberArray.get(i).getMember().getiD();
             this.iD = iD;
             date = memberArray.get(i).getDatePaid();
             memberArray.remove(i);
          }
       }
    }

    public void saveChanges() throws FileNotFoundException
    {
       Non_Members mbs = new Non_Members(txtName.getText(), txtAddress.getText(),
             txtPhone.getText(), txtEmail.getText(),
             cmbSelectCategory.getSelectionModel().getSelectedItem().toString());
       Members mbm = new Members(mbs, date, iD);
       memberArray.add(mbm);
       file.writeObjToFile(memberArray);
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
       memberArray = new ArrayList<Members>();
       showWrittenData();
    }
}
