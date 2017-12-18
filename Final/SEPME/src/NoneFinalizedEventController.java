
/**
 * Sample Skeleton for 'NonFinalizedEvents.fxml' Controller Class
 */

import java.net.URL;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

public class NoneFinalizedEventController implements Initializable
{

   private ArrayList<Event> eventArray;
   private ToBinary file;
   private String filename = "events.txt";
   private static ObservableList<Event> observableEvents;

   @FXML // ResourceBundle that was given to the FXMLLoader
   private ResourceBundle resources;

   @FXML // URL location of the FXML file that was given to the FXMLLoader
   private URL location;

   @FXML // fx:id="tblColumnType"
   private TableColumn<Event, String> tblColumnType; // Value injected by
                                                     // FXMLLoader

   @FXML // fx:id="tblColumnLecturer"
   private TableColumn<Event, String> tblColumnLecturer; // Value injected by
                                                         // FXMLLoader

   @FXML // fx:id="AnchorPaneNonFinalizedEvents"
   private AnchorPane AnchorPaneNonFinalizedEvents; // Value injected by
                                                    // FXMLLoader

   @FXML
   private TableColumn<Event, String> tblDiscountedPrice;

   @FXML
   private TableColumn<Event, ArrayList<Participants>> tblParticipants;

   @FXML // fx:id="tblColumnDate"
   private TableColumn<Event, String> tblColumnDate; // Value injected by
                                                     // FXMLLoader

   @FXML
   private TableColumn<Event, String> tblColumnTitle;

   @FXML // fx:id="tblColumnDuration"
   private TableColumn<Event, String> tblColumnDuration; // Value injected by
                                                         // FXMLLoader

   @FXML // fx:id="tblColumnPrice"
   private TableColumn<Event, String> tblColumnPrice; // Value injected by
                                                      // FXMLLoader

   @FXML // fx:id="tblNonFinalizedEvent"
   private TableView<Event> tblNonFinalizedEvent; // Value injected by
                                                  // FXMLLoader

   @FXML // fx:id="tblColumnCategory"
   private TableColumn<Event, String> tblColumnCategory; // Value injected by
                                                         // FXMLLoader

   @FXML // fx:id="tblColumnTime"
   private TableColumn<Event, String> tblColumnTime; // Value injected by
                                                     // FXMLLoader

   @SuppressWarnings("unchecked")
   public void initializeTable()
   {
      tblColumnCategory.setCellValueFactory(
            new PropertyValueFactory<Event, String>("category"));
      tblColumnType.setCellValueFactory(
            new PropertyValueFactory<Event, String>("type"));
      tblColumnTitle.setCellValueFactory(
            new PropertyValueFactory<Event, String>("title"));
      tblColumnDate.setCellValueFactory(
            new PropertyValueFactory<Event, String>("date"));
      tblColumnTime.setCellValueFactory(
            new PropertyValueFactory<Event, String>("time"));
      tblColumnDuration.setCellValueFactory(
            new PropertyValueFactory<Event, String>("duration"));
      tblColumnLecturer.setCellValueFactory(
            new PropertyValueFactory<Event, String>("lecturer"));
      tblColumnPrice.setCellValueFactory(
            new PropertyValueFactory<Event, String>("price"));
      tblDiscountedPrice.setCellValueFactory(
            new PropertyValueFactory<Event, String>("discountedPrice"));
      tblParticipants.setCellValueFactory(
            new PropertyValueFactory<Event, ArrayList<Participants>>(
                  "participants"));

      observableEvents = FXCollections
            .observableList((ArrayList<Event>) file.readObjFromFile());
      tblNonFinalizedEvent.setItems(observableEvents);
      tblNonFinalizedEvent.setStyle("-fx-alignment: CENTER;");
   }

   @SuppressWarnings("unchecked")
   private void showWrittenData()
   {
      ArrayList<Event> list = (ArrayList<Event>) file.readObjFromFile();
      for (int i = 0; i < list.size(); i++)
      {
         System.out.println(list.get(i));
      }
   }

   public void showNonFInalizedEvents()
   {
      LocalDateTime now = LocalDateTime.now();
      MyDate date1 = new MyDate(now.getDayOfMonth(), now.getMonthValue(),
            now.getYear());
      ArrayList<Event> temp = new ArrayList<Event>();
      for (int i = 0; i < eventArray.size(); i++)
      {
         if (!(eventArray.get(i).getDate().isBefore(date1)))
         {
            temp.add(eventArray.get(i));
         }
      }
      observableEvents = FXCollections.observableList(temp);
      tblNonFinalizedEvent.setItems(observableEvents);
      tblNonFinalizedEvent.setStyle("-fx-alignment: CENTER;");
   }

   @SuppressWarnings("unchecked")
   @Override
   public void initialize(URL arg0, ResourceBundle arg1)
   {
      filename = "events.txt";
      file = new ToBinary(filename);
      eventArray = new ArrayList<Event>();
      eventArray = (ArrayList<Event>) file.readObjFromFile();
      initializeTable();
      showWrittenData();
      showNonFInalizedEvents();

   }
}
