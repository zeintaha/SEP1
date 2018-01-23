import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;
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
   private String filename = "sponsor.txt";
   ArrayList<Category> categories;

   @FXML
   private TextField txtPhone;

   @FXML
   private Button btnAddMember;

   @FXML
   private TextField txtName;

   @FXML
   private ComboBox<Category> cmbSelectCategory;

   @FXML
   private DatePicker dteStartOfMembership;

   @FXML
   private TextField txtAddress;

   @FXML
   private TextField txtEmail;

   @FXML
   private AnchorPane anchorPaneAddMember;

   @FXML
   public void selectCategory()
   {

   }

   @FXML
   public void selectDate()
   {

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
