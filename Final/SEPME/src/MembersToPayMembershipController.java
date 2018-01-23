
/**
 * Sample Skeleton for 'MembersToPayMembership.fxml' Controller Class
 */

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

public class MembersToPayMembershipController implements Initializable
{
   private ArrayList<Members> membersArray = new ArrayList<Members>();
   private ToBinary file;
   private String filename = "members.txt";
   private static ObservableList<Members> observableMembers;


   @FXML
   private TableColumn<Members, Non_Members> tblColumnName;

   @FXML
   private TableView<Members> tblMember;

   @FXML
   private AnchorPane AnchorPaneMembersToPayMembership;

   @FXML
   private DatePicker toDate;

   @FXML
   private Button find;

   @FXML
   private TableColumn<Members, MyDate> tblColumnStartOfMembership;

   @FXML
   private TableColumn<Members, MyDate> tblColumnEndOfMembership;

   @FXML
   void findByDates(ActionEvent event) {
      ArrayList<Members> mem2 = new ArrayList<Members>();
      MyDate dateTo = new MyDate(toDate.getValue().getDayOfMonth(), toDate.getValue().getMonthValue(), toDate.getValue().getYear());
      for(int i = 0; i < membersArray.size(); i++) {
         if(membersArray.get(i).getDateEnd().isBefore(dateTo)) {
            mem2.add(membersArray.get(i));
         }
      }
      
      observableMembers = FXCollections
            .observableList(mem2);
      tblMember.setItems(observableMembers);
      tblMember.setStyle("-fx-alignment: CENTER;");

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
   public void initializeTable()
   {
      tblColumnName.setCellValueFactory(
            new PropertyValueFactory<Members, Non_Members>("member"));
      tblColumnStartOfMembership.setCellValueFactory(
            new PropertyValueFactory<Members, MyDate>("datePaid"));
      tblColumnEndOfMembership.setCellValueFactory(
            new PropertyValueFactory<Members, MyDate>("dateEnd"));

      observableMembers = FXCollections
            .observableList((ArrayList<Members>) file.readObjFromFile());
      tblMember.setItems(observableMembers);
      tblMember.setStyle("-fx-alignment: CENTER;");
   }

   @SuppressWarnings("unchecked")
   public void initialize(URL arg0, ResourceBundle arg1)
   {
      file = new ToBinary(filename);

      membersArray = new ArrayList<Members>();
      membersArray = (ArrayList<Members>) file.readObjFromFile();

      showWrittenData();
      initializeTable();

   }

}