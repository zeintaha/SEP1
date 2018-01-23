
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;



public class VIAMain extends Application
{

   @Override
   public void start(Stage primaryStage) throws Exception
   {
      // instatiate invoke the fxml loader
      FXMLLoader loader = new FXMLLoader();
      
      // set controller
      loader.setController(new VIAMainController());
      
      
      // set the location of the FXML doc
      loader.setLocation(getClass().getResource("VIAMain.fxml"));
      Parent root = loader.load();
      
      // Build the scene graph
      
      Scene scene = new Scene(root);
      
      // show the window using the scene graph
      primaryStage.getIcons().add(new Image(getClass().getResourceAsStream("favicon.png")));
      primaryStage.setTitle("VIA Main");
      primaryStage.setScene(scene);
      primaryStage.show();
      
   }
   
   public static void main(String[] args)
   {
      launch(args);
   }
   
   
}