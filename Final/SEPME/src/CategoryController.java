import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;

public class CategoryController implements Initializable
{
   private ArrayList<Category> categories = new ArrayList<Category>();
   private ToBinary file;
   private String filename = "categories.txt";
   private static ObservableList<Category> observableCategory;

   @FXML
   private Label lblCategory;

   @FXML
   private TableView<Category> tableViewCategory = new TableView<Category>();

   @FXML
   private TableColumn<Category, String> listOfCategories = new TableColumn<Category, String>();

   @FXML
   private TextField txtCategory;

   @FXML
   private Button btnAddCategory;

   @FXML
   private Button btnDeleteCategory;

   public void addCategory() throws InvocationTargetException
   {
      String category = txtCategory.getText();
      Category cat = new Category(category);
      categories.add(cat);
      file.writeObjToFile(categories);
      initializeTable();
      JOptionPane.showMessageDialog(null, cat.toString() + " Added ");
   }

   public void deleteCategory() throws InvocationTargetException
   {    
      String category = txtCategory.getText();
      Category cat = new Category(category);    
      
      for(int i = 0; i < categories.size(); i++) {
         if(categories.get(i).getCategory().equals(cat.getCategory())) {
            categories.remove(i);
         }
      }
      System.out.println(categories);
      file.writeObjToFile(categories);
      initializeTable();
      JOptionPane.showMessageDialog(null, cat.toString() + " Deleted ");
   }

   @SuppressWarnings("unchecked")
   private void showWrittenData()
   {
      ArrayList<Category> list = (ArrayList<Category>) file.readObjFromFile();
      for (int i = 0; i < list.size(); i++)
      {
         System.out.println(list.get(i));
      }
      System.out.println(list.get(0).getCategory());
   }

   @SuppressWarnings("unchecked")
   public void initializeTable()
   {
      listOfCategories.setCellValueFactory(
            new PropertyValueFactory<Category, String>("category"));
      observableCategory = FXCollections
            .observableList((ArrayList<Category>) file.readObjFromFile());
      tableViewCategory.setItems(observableCategory);
      tableViewCategory.setStyle("-fx-alignment: CENTER;");
      listOfCategories.setStyle("-fx-alignment: CENTER;");
   }
   
   public void getCategoryFromTable() throws InvocationTargetException
   {
      txtCategory.setText(tableViewCategory.getSelectionModel().getSelectedItem().toString());
   }


   @SuppressWarnings("unchecked")
   public void initialize(URL arg0, ResourceBundle arg1)
   {
      file = new ToBinary(filename);
      categories = new ArrayList<Category>();
      categories = (ArrayList<Category>) file.readObjFromFile();
      initializeTable();
      showWrittenData();
   }

}
