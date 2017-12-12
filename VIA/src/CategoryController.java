import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javax.swing.JOptionPane;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import java.io.EOFException;
import java.io.IOException;

public class CategoryController extends ToBinary implements Initializable
{

   @FXML
   private Label lblCategory;

   @FXML
   private TableColumn<Category, String> listOfCategories = new TableColumn<Category, String>();

   @FXML
   private TextField txtCategory;

   @FXML
   private Button btnAddCategory;

   @FXML
   private Button btnDeleteCategory;

   @SuppressWarnings("unchecked")
   public void addCategory()
         throws ClassNotFoundException, IOException, EOFException
   {
      String category = txtCategory.getText();
      Category cat = new Category(category);
      ArrayList<Category> categories = new ArrayList<Category>();
      categories = (ArrayList<Category>) readObjFromFile(
            "D://Liviu//ECLIPSE STORAGE//VIA/categories.txt");
      categories.add(cat);
      writeObjFromFile(categories,
            "D://Liviu//ECLIPSE STORAGE//VIA/categories.txt");
      JOptionPane.showMessageDialog(null, cat.toString() + "Added ");
   }

   @SuppressWarnings("unchecked")
   public void deleteCategory()
         throws ClassNotFoundException, IOException, EOFException
   {
      String category = txtCategory.getText();
      Category cat = new Category(category);
      ArrayList<Category> categories = new ArrayList<Category>();
      categories = (ArrayList<Category>) readObjFromFile(
            "D://Liviu//ECLIPSE STORAGE//VIA/categories.txt");
      categories.add(cat);
      writeObjFromFile(categories,
            "D://Liviu//ECLIPSE STORAGE//VIA/categories.txt");
      JOptionPane.showMessageDialog(null, cat.toString() + "Deleted ");
   }

   @SuppressWarnings("unchecked")
   public void initializeTable()
   {
      ArrayList<Category> data = new ArrayList<Category>();
      data = ((ArrayList<Category>) readObjFromFile(
            "D://Liviu//ECLIPSE STORAGE//VIA/categories.txt"));
      TableView<Category> listOfCategories = new TableView<Category>();

      for (int i = 0; i < data.size(); i++)
      {
         TableColumn<Category, String> firstNameCol = new TableColumn<Category, String>(
               data.get(i).getCategory());
         listOfCategories.getColumns().add(firstNameCol);
      }
   }

   public void initialize(URL arg0, ResourceBundle arg1)
   {
      //initializeTable();
   }

}
