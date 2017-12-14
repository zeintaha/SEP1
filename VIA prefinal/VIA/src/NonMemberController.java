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

public class NonMemberController implements Initializable
{
   private ArrayList<Non_Members> nonMemberArray;
   private ToBinary file;
   private String filename = "nonmember.txt";
   ArrayList<Category> categories;

   @FXML
   private TextField txtPhone;

   @FXML
   private Button btnAddSponsor;

   @FXML
   private TextField txtName;

   @FXML
   private ComboBox<Category> cmbSelectCategory;

   @FXML
   private TextField txtAddress;

   @FXML
   private TextField txtEmail;

   @FXML
   private AnchorPane AnchorPaneAddSponsor;

   public void selectCategory()
   {

   }

   @SuppressWarnings("unchecked")
   public void addMember() throws FileNotFoundException
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