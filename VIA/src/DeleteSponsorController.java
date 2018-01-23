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

public class DeleteSponsorController implements Initializable
{
   private ArrayList<Sponsor> sponsorArray;
   private ToBinary file;
   private String filename = "sponsor.txt";

   @FXML
   private AnchorPane AnchorPaneDeleteSponsor;

   @FXML
   private ComboBox<Sponsor> cmbSelectSponsor;

   @FXML
   private Button btnSearchSponsor;

   @FXML
   private Button btnDeleteSponsor;

   @FXML
   private TextField txtSponsor;

   @SuppressWarnings("unchecked")
   @FXML
   public void searchSponsor()
   {
      sponsorArray = (ArrayList<Sponsor>) file.readObjFromFile();
      ArrayList<Sponsor> sponsorArray2 = new ArrayList<Sponsor>();

      for (int i = 0; i < sponsorArray.size(); i++)
      {
         if (sponsorArray.get(i).getName().equals(txtSponsor.getText()))
         {
            sponsorArray2.add(sponsorArray.get(i));
         }
      }
      cmbSelectSponsor.getItems().clear();
      cmbSelectSponsor.getItems().addAll(sponsorArray2);

      String string = "  Is Not a part of the List";
      if (sponsorArray2.size() != 0)
      {
         string = "  Found";
      }
      
      JOptionPane.showMessageDialog(null,
            txtSponsor.getText().toString() + string);


   }

   @FXML
   public void deleteSponsor()
   {
      Sponsor selectedSponsor = cmbSelectSponsor.getSelectionModel()
            .getSelectedItem();
      for (int i = 0; i < sponsorArray.size(); i++)
      {
         if (sponsorArray.get(i).equals(selectedSponsor))
         {
            sponsorArray.remove(i);
         }
      }
      file.writeObjToFile(sponsorArray);
      searchSponsor();
   }

   public void emtyTXT()
   {
      txtSponsor.setText(null);
   }

   @FXML
   public void selectSponsor()
   {

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

   @Override
   public void initialize(URL arg0, ResourceBundle arg1)
   {
      file = new ToBinary(filename);
      sponsorArray = new ArrayList<Sponsor>();
      showWrittenData();
   }
}
