   import javafx.application.Application;
   import javafx.fxml.FXMLLoader;
   import javafx.scene.Parent;
   import javafx.scene.Scene;
   import javafx.stage.Stage;
   
public class EditLecturerDisplay extends Application
{
   @Override
   public void start(Stage stage) throws Exception
   {
      // Instantiate and invoke the fxml loader
      FXMLLoader loader = new FXMLLoader();
      // set controller
      loader.setController(new EditLecturerController());
      // set the location of the fxml doc
      loader.setLocation(getClass().getResource("EditLecturer.fxml"));
      Parent root = loader.load();
      // build the scene graph
      Scene scene = new Scene(root);
      // show the window using the scene graph

      stage.setTitle("EditLecturer");
      stage.setScene(scene);
      stage.show();
   }

   public static void main(String[] args)
   {
      launch(args);
   }
}
