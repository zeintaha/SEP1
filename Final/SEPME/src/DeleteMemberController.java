
/**
 * Sample Skeleton for 'DeleteMember.fxml' Controller Class
 */

import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class DeleteMemberController implements Initializable{
   
   private ArrayList<Members> membersArray;
   private ToBinary file;
   private String filename = "members.txt";

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML // fx:id="txtId"
    private TextField txtId; // Value injected by FXMLLoader

    @FXML // fx:id="btnSearchId"
    private Button btnSearchId; // Value injected by FXMLLoader

    @FXML // fx:id="btnDeleteMember"
    private Button btnDeleteMember; // Value injected by FXMLLoader

    @FXML // fx:id="txtName"
    private TextField txtName; // Value injected by FXMLLoader

    @FXML // fx:id="AnchorePaneDeleteMember"
    private AnchorPane AnchorePaneDeleteMember; // Value injected by FXMLLoader


    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {
        assert txtId != null : "fx:id=\"txtId\" was not injected: check your FXML file 'DeleteMember.fxml'.";
        assert btnSearchId != null : "fx:id=\"btnSearchId\" was not injected: check your FXML file 'DeleteMember.fxml'.";
        assert btnDeleteMember != null : "fx:id=\"btnDeleteMember\" was not injected: check your FXML file 'DeleteMember.fxml'.";
        assert txtName != null : "fx:id=\"txtName\" was not injected: check your FXML file 'DeleteMember.fxml'.";
        assert AnchorePaneDeleteMember != null : "fx:id=\"AnchorePaneDeleteMember\" was not injected: check your FXML file 'DeleteMember.fxml'.";

    }
    
    @SuppressWarnings("unchecked")
    @FXML
    public void searchId() throws InvocationTargetException
    {
       membersArray = (ArrayList<Members>) file.readObjFromFile();
       ArrayList<Members> membersArray2 = new ArrayList<Members>();

       for (int i = 0; i < membersArray.size(); i++)
       {
          if (membersArray.get(i).getMember().getiD().toString()
                .equals(txtId.getText().toString()))
          {
             membersArray2.add(membersArray.get(i));
             txtName.setText(membersArray.get(i).getMember().getName());
             membersArray.remove(i);
          }
       }

       String string = "  Is Not a part of the List";
       if (membersArray2.size() != 0)
       {
          string = "  Found";
       }

       JOptionPane.showMessageDialog(null, txtId.getText().toString() + string);
    }

    @FXML
    public void deleteMember()
    {
       file.writeObjToFile(membersArray);
       JOptionPane.showMessageDialog(null,
             txtName.getText().toString() + " Deleted");

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

    @Override
    public void initialize(URL arg0, ResourceBundle arg1)
    {
       file = new ToBinary(filename);
       membersArray = new ArrayList<Members>();
       showWrittenData();
    }
    
    @FXML
    public void emptyTxt() {
       txtId.setText(null);
    }
}
