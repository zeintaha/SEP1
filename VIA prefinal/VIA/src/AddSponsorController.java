import java.io.FileNotFoundException;
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

public class AddSponsorController implements Initializable
{
   private ArrayList<Sponsor> sponsorArray;
   private ToBinary file;
   private String filename = "sponsor.txt";
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

   public void cmbSelectCategory()
   {

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