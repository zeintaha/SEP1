import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class EditMemberController implements Initializable
{
   private ArrayList<Members> memberArray;
   private ToBinary file;
   private String filename = "members.txt";
   private ArrayList<Category> categories;
   private MyDate date = new MyDate();
   private String iD = null;

   @FXML
   private ResourceBundle resources;

   @FXML
   private URL location;

   @FXML
   private TextField txtMemberId;

   @FXML
   private TextField txtPhone;

   @FXML
   private Button btnSaveChanges;

   @FXML
   private TextField txtName;

   @FXML
   private ComboBox<Category> cmbSelectCategory;

   @FXML
   private TextField txtAddress;

   @FXML
   private Button btnGetMember;

   @FXML
   private TextField txtEmail;

   @FXML
   private AnchorPane AnchorPaneEditMember;

   public void selectCategory()
   {

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
