 import java.io.EOFException;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.event.ActionEvent;


public class AddSponsorController extends ToBinary implements Initializable {
    private ArrayList<Sponsor> sponsorArray;
    private String filename = "D://Liviu//ECLIPSE STORAGE//VIA/sponsor.txt";

    public AddSponsorController() {
        sponsorArray = new ArrayList<Sponsor>();
    }

    @FXML
    private TextField txtPhone;

    @FXML
    private Button btnAddSponsor;

    @FXML
    private TextField txtName;

    @FXML
    private ComboBox<Category> cmbSelectCategory = new ComboBox<Category>();

    @FXML
    private TextField txtAddress;

    @FXML
    private TextField txtEmail;

    @FXML
    private AnchorPane AnchorPaneAddSponsor;
    
    public void cmbSelectCategory()
       {

         // activityList = new ArrayList<Activity_Subject>();
          // activityList = (ArrayList<Activity_Subject>)
          // deserializeAddress(filename);

         // for(int i=0; i< activityList.size(); i++) {
          // cmbActivitySubject.setValue(activityList.get(i));
          // }
       }

      // public void setCmbActivitySubject()
       // {
       // activityNameTxtField.setText(cmbActivitySubject.getValue().getActivityName());
       // activityTypeTxtField.setText(cmbActivitySubject.getValue().getActivityType());
       //
       // }

      
       public void addSponsor()
             throws ClassNotFoundException, IOException, EOFException
       {
          String email = txtEmail.getText();
          String name = txtName.getText();
          String address = txtAddress.getText();
          String phone = txtPhone.getText();
          String category = cmbSelectCategory.getAccessibleText();
          sponsorArray = new ArrayList<Sponsor>();
          sponsorArray = (ArrayList<Sponsor>) readObjFromFile(filename);
          Sponsor sps = new Sponsor(name, address,phone, email, category);
          sponsorArray.add(sps);
          writeObjFromFile(sponsorArray, filename);
          //cmbActivitySubject.getItems().addAll(activityList);
         JOptionPane.showMessageDialog(null, sps.toString() + " Added ");
       }

      @SuppressWarnings({ "unused", "unchecked" })
       private void showWrittenData()
       {
          ArrayList<Sponsor> list = (ArrayList<Sponsor>) readObjFromFile(
                filename);
          for (int i = 0; i < list.size(); i++)
          {
             System.out.println(list.get(i));
          }
       }
     


      @SuppressWarnings("unchecked")
       public void refreshComboBox()
       {
          ArrayList<Category> categories = (ArrayList<Category>) readObjFromFile("D://Liviu//ECLIPSE STORAGE//VIA/categories.txt");
          cmbSelectCategory.getItems().addAll(categories);
       }
    @Override
       public void initialize(URL arg0, ResourceBundle arg1)
       {
          //refreshComboBox();
       }
    }