
/**
 * Sample Skeleton for 'DeleteSponsor.fxml' Controller Class
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
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class DeleteSponsorController implements Initializable
{
   private ArrayList<Sponsor> sponsorArray;
   private ToBinary file;
   private String filename = "sponsor.txt";

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="AnchorPaneDeleteSponsor"
    private AnchorPane AnchorPaneDeleteSponsor; // Value injected by FXMLLoader

    @FXML // fx:id="cmbSelectSponsor"
    private ComboBox<String> cmbSelectSponsor; // Value injected by FXMLLoader

    @FXML // fx:id="btnSearchSponsor"
    private Button btnSearchSponsor; // Value injected by FXMLLoader

    @FXML // fx:id="btnDeleteSponsor"
    private Button btnDeleteSponsor; // Value injected by FXMLLoader

    @FXML // fx:id="txtSponsor"
    private TextField txtSponsor; // Value injected by FXMLLoader

    

    

    @FXML
    void selectSponsor(ActionEvent event) {

    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert AnchorPaneDeleteSponsor != null : "fx:id=\"AnchorPaneDeleteSponsor\" was not injected: check your FXML file 'DeleteSponsor.fxml'.";
        assert cmbSelectSponsor != null : "fx:id=\"cmbSelectSponsor\" was not injected: check your FXML file 'DeleteSponsor.fxml'.";
        assert btnSearchSponsor != null : "fx:id=\"btnSearchSponsor\" was not injected: check your FXML file 'DeleteSponsor.fxml'.";
        assert btnDeleteSponsor != null : "fx:id=\"btnDeleteSponsor\" was not injected: check your FXML file 'DeleteSponsor.fxml'.";
        assert txtSponsor != null : "fx:id=\"txtSponsor\" was not injected: check your FXML file 'DeleteSponsor.fxml'.";

    }
    
    @SuppressWarnings("unchecked")
    @FXML
    public void searchSponsor()
    {
       sponsorArray = (ArrayList<Sponsor>) file.readObjFromFile();
       ArrayList<String> sponsorArray2 = new ArrayList<String>();

       for (int i = 0; i < sponsorArray.size(); i++)
       {
          if (sponsorArray.get(i).getName().equals(txtSponsor.getText()))
          {
             sponsorArray2.add(sponsorArray.get(i).getName());
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
       String selectedSponsor = cmbSelectSponsor.getSelectionModel().getSelectedItem();
       for (int i = 0; i < sponsorArray.size(); i++)
       {
          if (sponsorArray.get(i).getName().equals(selectedSponsor))
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
