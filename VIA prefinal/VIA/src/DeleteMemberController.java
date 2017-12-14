import javafx.fxml.Initializable;

import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

public class DeleteMemberController implements Initializable
{
   private ArrayList<Members> membersArray;
   private ToBinary file;
   private String filename = "members.txt";

   @FXML
   private TextField txtId;

   @FXML
   private Button btnSearchId;

   @FXML
   private Button btnDeleteMember;

   @FXML
   private TextField txtName;

   @FXML
   private AnchorPane AnchorePaneDeleteMember;

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
