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

public class NoneMembersGivenCategoryController implements Initializable
{

   private ArrayList<Non_Members> nonMemberArray = new ArrayList<Non_Members>();
   private ToBinary file;
   private String filename = "nonmember.txt";
   private static ObservableList<Non_Members> observableNonMembers;

   private ArrayList<Category> categories = new ArrayList<Category>();

   @FXML
   private ResourceBundle resources;

   @FXML
   private URL location;

   @FXML
   private AnchorPane AnchorPaneMembers;

   @FXML
   private TableColumn<Non_Members, String> tblColumnPhone;

   @FXML
   private TableColumn<Non_Members, String> tblColumnName;

   @FXML
   private ComboBox<Category> cmbPreferences;

   @FXML
   private TableView<Non_Members> tblMember;

   @FXML
   private TableColumn<Non_Members, String> tblColumnEmail;

   @FXML
   private TableColumn<Non_Members, String> tblColumnAddress;

   @FXML
   private TableColumn<Non_Members, String> tblColumnPreferences;

   
   @SuppressWarnings("unchecked")
   @FXML
   void preferences(ActionEvent event)
   {
      ArrayList<Non_Members> nonMembers = new ArrayList<Non_Members>();
      nonMemberArray = (ArrayList<Non_Members>) file.readObjFromFile();
      for (int i = 0; i < nonMemberArray.size(); i++)
      {
         if ((cmbPreferences.getSelectionModel().getSelectedItem().toString())
               .equals("Show All"))
         {
            nonMembers.add(nonMemberArray.get(i));

         }
         if (nonMemberArray.get(i).getPreferences().toString().equals(
               cmbPreferences.getSelectionModel().getSelectedItem().toString()))
         {
            nonMembers.add(nonMemberArray.get(i));
         }
      }
      observableNonMembers = FXCollections
            .observableList(nonMembers);
      tblMember.setItems(observableNonMembers);
      System.out.println();

   }

   @SuppressWarnings("unchecked")
   public void initializeTable()
   {
      nonMemberArray = new ArrayList<Non_Members>();

      tblColumnName.setCellValueFactory(
            new PropertyValueFactory<Non_Members, String>("name"));
      tblColumnAddress.setCellValueFactory(
            new PropertyValueFactory<Non_Members, String>("address"));
      
      tblColumnEmail.setCellValueFactory(
            new PropertyValueFactory<Non_Members, String>("phoneNr"));
      tblColumnPhone.setCellValueFactory(
            new PropertyValueFactory<Non_Members, String>("email"));
      tblColumnPreferences.setCellValueFactory(
            new PropertyValueFactory<Non_Members, String>("Preferences"));
      
      observableNonMembers = FXCollections
            .observableList((ArrayList<Non_Members>) file.readObjFromFile());
      tblMember.setItems(observableNonMembers);
      tblMember.setStyle("-fx-alignment: CENTER;");
   }

   
   
   @FXML
   void initialize()
   {

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

      String category = "Show All";
      Category cat = new Category(category);

      categories = (ArrayList<Category>) file.readObjFromFile();
      categories.add(cat);
      cmbPreferences.getItems().addAll(categories);
   }

   @SuppressWarnings("unchecked")
   @Override
   public void initialize(URL arg0, ResourceBundle arg1)
   {
      filename = "categories.txt";
      file = new ToBinary(filename);
      refreshComboBox();
      filename = "nonmember.txt";
      file = new ToBinary(filename);
      nonMemberArray = new ArrayList<Non_Members>();
      nonMemberArray = (ArrayList<Non_Members>) file.readObjFromFile();
      initializeTable();
      showWrittenData();
   }

}