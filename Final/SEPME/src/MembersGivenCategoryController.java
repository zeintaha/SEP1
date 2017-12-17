
/**
 * Sample Skeleton for 'MembersGivenCategory.fxml' Controller Class
 */

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

public class MembersGivenCategoryController implements Initializable
{

   private ArrayList<Members> membersArray = new ArrayList<Members>();
   private ToBinary file;
   private String filename = "members.txt";
   private static ObservableList<Members> observableMembers;

   @FXML
   private AnchorPane AnchorPaneMembers;

   @FXML
   private ComboBox<Category> cmbPreferences;

   @FXML
   private TableView<Members> tblMember;

   @FXML
   private TableColumn<Members, MyDate> tblColumnMembershipDate;

   @FXML
   private TableColumn<Members, MyDate> tblColumnEndMembershipDate;


   @FXML
   private TableColumn<Members, Non_Members> tblPersonalInfo;



   @SuppressWarnings("unchecked")
   public void initializeTable()
   {
      tblPersonalInfo.setCellValueFactory(
            new PropertyValueFactory<Members, Non_Members>("member"));
      tblColumnMembershipDate.setCellValueFactory(
            new PropertyValueFactory<Members, MyDate>("datePaid"));
      tblColumnEndMembershipDate.setCellValueFactory(
            new PropertyValueFactory<Members, MyDate>("dateEnd"));
      // tblPersonalInfo.getColumns().addAll(memberId, tblColumnName,
      // tblColumnAddress, tblColumnPhone, tblColumnEmail,
      // tblColumnPreferences);
      observableMembers = FXCollections
            .observableList((ArrayList<Members>) file.readObjFromFile());
      tblMember.setItems(observableMembers);
      tblMember.setStyle("-fx-alignment: CENTER;");
   }

   @SuppressWarnings("unchecked")
   public void refreshComboBox()
   {
      ArrayList<Category> categories = new ArrayList<Category>();

      String category = "Show All";
      Category cat = new Category(category);

      categories = (ArrayList<Category>) file.readObjFromFile();
      categories.add(cat);
      cmbPreferences.getItems().addAll(categories);
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

   @FXML
   void preferences(ActionEvent event)
   {
      ArrayList<Members> mem = new ArrayList<Members>();
      for (int i = 0; i < membersArray.size(); i++)
      {
         if ((cmbPreferences.getSelectionModel().getSelectedItem().toString())
               .equals("Show All"))
         {
            mem.add(membersArray.get(i));

         }
         else if (membersArray.get(i).getMember().getPreferences().toString()
               .equals(cmbPreferences.getSelectionModel().getSelectedItem()
                     .toString()))
         {
            mem.add(membersArray.get(i));
         }
      }
      observableMembers = FXCollections.observableList(mem);
      tblMember.setItems(observableMembers);
      System.out.println();

   }

   @SuppressWarnings("unchecked")
   public void initialize(URL arg0, ResourceBundle arg1)
   {
      filename = "categories.txt";
      file = new ToBinary(filename);
      refreshComboBox();
      filename = "members.txt";
      file = new ToBinary(filename);
      membersArray = new ArrayList<Members>();
      membersArray = (ArrayList<Members>) file.readObjFromFile();
      showWrittenData();
      initializeTable();

   }

}
