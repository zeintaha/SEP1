/**
 * Sample Skeleton for 'EditSponsor.fxml' Controller Class
 */

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

public class EditSponsorController  implements Initializable
	{
	   private ArrayList<Sponsor> sponsorArray;
	   private ToBinary file;
	   private String filename = "sponsor.txt";
	   ArrayList<Category> categories;

    @FXML 
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML 
    private AnchorPane AnchorPaneEditSponsor; 

    @FXML 
    private TextField txtPhone; 

    @FXML 
    private Button btnSaveChanges; 

    @FXML 
    private Button btnSearch; 

    @FXML 
    private TextField txtName;

    @FXML 
    private TextField txtSponsorName;

    @FXML 
    private ComboBox<Category> cmbSelectCategory; 

    @FXML 
    private TextField txtAddress; 

    @FXML 
    private TextField txtEmail; 

   public void selectCategory()
   {

   }

  
	@SuppressWarnings("unchecked")
	public void searchSponsor() throws FileNotFoundException {
		sponsorArray = new ArrayList<Sponsor>();
//		wsponsorArray = (ArrayList<Sponsor>) file.readObjFromFile();
		
		String nameSponsor = txtSponsorName.getText();

		for (int i = 0; i < sponsorArray.size(); i++) {
			if (sponsorArray.get(i).getName().equals(nameSponsor)) {
				txtName.setText(sponsorArray.get(i).getName());
				txtAddress.setText(sponsorArray.get(i).getAddress());
				txtPhone.setText(sponsorArray.get(i).getPhone());
				txtEmail.setText(sponsorArray.get(i).getEmail());
			}
		}
	}

   public void saveChanges() throws FileNotFoundException
   {
      Sponsor sps = new Sponsor(txtName.getText(), txtAddress.getText(),
            txtPhone.getText(), txtEmail.getText(),
            cmbSelectCategory.getSelectionModel().getSelectedItem().toString());
//      sponsorArray = (ArrayList<Sponsor>) file.readObjFromFile();
      sponsorArray.add(sps);
      file.writeObjToFile(sponsorArray);
   }

 
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
     // showWrittenData();
   }
}