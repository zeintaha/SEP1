
/**
 * Sample Skeleton for 'VIAMain.fxml' Controller Class
 */

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class VIAMainController
{

   @FXML // ResourceBundle that was given to the FXMLLoader
   private ResourceBundle resources;

   @FXML // URL location of the FXML file that was given to the FXMLLoader
   private URL location;

   @FXML // fx:id="mnuCategory"
   private Menu mnuCategory; // Value injected by FXMLLoader

   @FXML // fx:id="mniAddEvent"
   private MenuItem mniAddEvent; // Value injected by FXMLLoader

   @FXML // fx:id="mniDeleteLecturer"
   private MenuItem mniDeleteLecturer; // Value injected by FXMLLoader

   @FXML // fx:id="btnLecturer"
   private Button btnLecturer; // Value injected by FXMLLoader

   @FXML // fx:id="mniEditMember"
   private MenuItem mniEditMember; // Value injected by FXMLLoader

   @FXML // fx:id="mniAddCategory"
   private MenuItem mniAddCategory; // Value injected by FXMLLoader

   @FXML // fx:id="mniDeleteSponsor"
   private MenuItem mniDeleteSponsor; // Value injected by FXMLLoader

   @FXML // fx:id="mniDeleteMember"
   private MenuItem mniDeleteMember; // Value injected by FXMLLoader

   @FXML // fx:id="mniAddParticipant"
   private MenuItem mniAddParticipant; // Value injected by FXMLLoader
   
   @FXML // fx:id="mniAddParticipant"
   private MenuItem mniRemoveParticipant; // Value injected by FXMLLoader

   @FXML // fx:id="mniDeleteEvent"
   private MenuItem mniDeleteEvent; // Value injected by FXMLLoader

   @FXML // fx:id="cmbCategorySponsorsLecturers"
   private ComboBox<?> cmbCategorySponsorsLecturers; // Value injected by
                                                     // FXMLLoader

   @FXML // fx:id="mniAddSponsor"
   private MenuItem mniAddSponsor; // Value injected by FXMLLoader

   @FXML // fx:id="mnuType"
   private Menu mnuType; // Value injected by FXMLLoader

   @FXML // fx:id="mniAddLecturer"
   private MenuItem mniAddLecturer; // Value injected by FXMLLoader

   @FXML // fx:id="mniAddMember"
   private MenuItem mniAddMember; // Value injected by FXMLLoader

   @FXML // fx:id="btnMemebresNotPaidMembership"
   private Button btnMemebresNotPaidMembership; // Value injected by FXMLLoader

   @FXML // fx:id="mniEditLecturer"
   private MenuItem mniEditLecturer; // Value injected by FXMLLoader

   @FXML // fx:id="btnNoneMembers"
   private Button btnNoneMembers; // Value injected by FXMLLoader

   @FXML // fx:id="c"
   private Menu c; // Value injected by FXMLLoader

   @FXML // fx:id="mnuLecturer"
   private Menu mnuLecturer; // Value injected by FXMLLoader

   @FXML // fx:id="mniDeleteType"
   private MenuItem mniDeleteType; // Value injected by FXMLLoader

   @FXML // fx:id="mnuMember"
   private Menu mnuMember; // Value injected by FXMLLoader

   @FXML // fx:id="mnuSponsor"
   private Menu mnuSponsor; // Value injected by FXMLLoader

   @FXML // fx:id="btnNonFinalizedEvents"
   private Button btnNonFinalizedEvents; // Value injected by FXMLLoader

   @FXML // fx:id="btnSponsors"
   private Button btnSponsors; // Value injected by FXMLLoader

   @FXML // fx:id="mniEditSponsor"
   private MenuItem mniEditSponsor; // Value injected by FXMLLoader

   @FXML // fx:id="btnMembers"
   private Button btnMembers; // Value injected by FXMLLoader

   @FXML // fx:id="mniAddType"
   private MenuItem mniAddType; // Value injected by FXMLLoader

   @FXML // fx:id="mniDeleteCategory"
   private MenuItem mniDeleteCategory; // Value injected by FXMLLoader

   @FXML // fx:id="mnuBar"
   private MenuBar mnuBar; // Value injected by FXMLLoader

   @FXML // fx:id="mniEditEvent"
   private MenuItem mniEditEvent; // Value injected by FXMLLoader

   @FXML // fx:id="btnFinalizedEvents"
   private Button btnFinalizedEvents; // Value injected by FXMLLoader

   @FXML
   void addEvent(ActionEvent event)
   {

      Parent root;
      try
      {
         // instatiate invoke the fxml loader
         FXMLLoader loader = new FXMLLoader();

         // set controller
         loader.setController(new AddEventController());

         // set the location of the FXML doc
         loader.setLocation(getClass().getResource("AddEvent.fxml"));
         root = loader.load();

         // Build the scene graph

         Scene scene = new Scene(root);

         Stage stage = new Stage();

         // show the window using the scene graph
         stage.getIcons().add(new Image(getClass().getResourceAsStream("favicon.png")));
         stage.setTitle("Add Event");
         stage.setScene(scene);
         stage.show();
      }
      catch (IOException e)
      {
         e.printStackTrace();
      }

   }

   @FXML
   void editEvent(ActionEvent event)
   {
      Parent root;
      try
      {
         // instatiate invoke the fxml loader
         FXMLLoader loader = new FXMLLoader();

         // set controller
         loader.setController(new EditEventController());

         // set the location of the FXML doc
         loader.setLocation(getClass().getResource("EditEvent.fxml"));
         root = loader.load();

         // Build the scene graph

         Scene scene = new Scene(root);

         Stage stage = new Stage();

         // show the window using the scene graph
         stage.getIcons().add(new Image(getClass().getResourceAsStream("favicon.png")));
         stage.setTitle("Edit Event");
         stage.setScene(scene);
         stage.show();
      }
      catch (IOException e)
      {
         e.printStackTrace();
      }

   }

   @FXML
   void deleteEvent(ActionEvent event)
   {
      Parent root;
      try
      {
         // instatiate invoke the fxml loader
         FXMLLoader loader = new FXMLLoader();

         // set controller
         loader.setController(new DeleteEventController());

         // set the location of the FXML doc
         loader.setLocation(getClass().getResource("DeleteEvent.fxml"));
         root = loader.load();

         // Build the scene graph

         Scene scene = new Scene(root);

         Stage stage = new Stage();

         // show the window using the scene graph
         stage.getIcons().add(new Image(getClass().getResourceAsStream("favicon.png")));
         stage.setTitle("Delete Event");
         stage.setScene(scene);
         stage.show();
      }
      catch (IOException e)
      {
         e.printStackTrace();
      }

   }

   @FXML
   void addParticipant(ActionEvent event)
   {
      Parent root;
      try
      {
         // instatiate invoke the fxml loader
         FXMLLoader loader = new FXMLLoader();

         // set controller
         loader.setController(new AddParticipantToEventController());

         // set the location of the FXML doc
         loader.setLocation(getClass().getResource("AddParticipantToEvent.fxml"));
         root = loader.load();

         // Build the scene graph

         Scene scene = new Scene(root);

         Stage stage = new Stage();

         // show the window using the scene graph
         stage.getIcons().add(new Image(getClass().getResourceAsStream("favicon.png")));
         stage.setTitle("Add Participant");
         stage.setScene(scene);
         stage.show();
      }
      catch (IOException e)
      {
         e.printStackTrace();
      }

   }
   
   @FXML
   void deleteParticipantFromEvent(ActionEvent event)
   {
      Parent root;
      try
      {
         // instatiate invoke the fxml loader
         FXMLLoader loader = new FXMLLoader();

         // set controller
         loader.setController(new DeleteParticipantFromEventController());

         // set the location of the FXML doc
         loader.setLocation(getClass().getResource("DeleteParticipantFromEvent.fxml"));
         root = loader.load();

         // Build the scene graph

         Scene scene = new Scene(root);

         Stage stage = new Stage();

         // show the window using the scene graph
         stage.getIcons().add(new Image(getClass().getResourceAsStream("favicon.png")));
         stage.setTitle("Delete Participant");
         stage.setScene(scene);
         stage.show();
      }
      catch (IOException e)
      {
         e.printStackTrace();
      }

   }

   @FXML
   void addLecturerToEvent(ActionEvent event)
   {
      Parent root;
      try
      {
         // instatiate invoke the fxml loader
         FXMLLoader loader = new FXMLLoader();

         // set controller
         loader.setController(new AddLecturerToEventController());

         // set the location of the FXML doc
         loader.setLocation(getClass().getResource("AddLecturerToEvent.fxml"));
         root = loader.load();

         // Build the scene graph

         Scene scene = new Scene(root);

         Stage stage = new Stage();

         // show the window using the scene graph
         stage.getIcons().add(new Image(getClass().getResourceAsStream("favicon.png")));
         stage.setTitle("Add Lecturer To Event");
         stage.setScene(scene);
         stage.show();
      }
      catch (IOException e)
      {
         e.printStackTrace();
      }

   }
   
   @FXML
   void deleteLecturerFromEvent(ActionEvent event)
   {
      Parent root;
      try
      {
         // instatiate invoke the fxml loader
         FXMLLoader loader = new FXMLLoader();

         // set controller
         loader.setController(new DeleteLecturerFromEventController());

         // set the location of the FXML doc
         loader.setLocation(getClass().getResource("DeleteLecturerFromEvent.fxml"));
         root = loader.load();

         // Build the scene graph

         Scene scene = new Scene(root);

         Stage stage = new Stage();

         // show the window using the scene graph
         stage.getIcons().add(new Image(getClass().getResourceAsStream("favicon.png")));
         stage.setTitle("Delete Lecturer From Event");
         stage.setScene(scene);
         stage.show();
      }
      catch (IOException e)
      {
         e.printStackTrace();
      }

   }


   @FXML
   void addMember(ActionEvent event)
   {
      Parent root;
      try
      {
         // instatiate invoke the fxml loader
         FXMLLoader loader = new FXMLLoader();

         // set controller
         loader.setController(new AddMemberController());

         // set the location of the FXML doc
         loader.setLocation(getClass().getResource("AddMember.fxml"));
         root = loader.load();

         // Build the scene graph

         Scene scene = new Scene(root);

         Stage stage = new Stage();

         // show the window using the scene graph
         stage.getIcons().add(new Image(getClass().getResourceAsStream("favicon.png")));
         stage.setTitle("Add Member");
         stage.setScene(scene);
         stage.show();
      }
      catch (IOException e)
      {
         e.printStackTrace();
      }

   }

   @FXML
   void editMember(ActionEvent event)
   {
      Parent root;
      try
      {
         // instatiate invoke the fxml loader
         FXMLLoader loader = new FXMLLoader();

         // set controller
         loader.setController(new EditMemberController());

         // set the location of the FXML doc
         loader.setLocation(getClass().getResource("EditMember.fxml"));
         root = loader.load();

         // Build the scene graph

         Scene scene = new Scene(root);

         Stage stage = new Stage();

         // show the window using the scene graph
         stage.getIcons().add(new Image(getClass().getResourceAsStream("favicon.png")));
         stage.setTitle("Edit Member");
         stage.setScene(scene);
         stage.show();
      }
      catch (IOException e)
      {
         e.printStackTrace();
      }

   }

   @FXML
   void deleteMember(ActionEvent event)
   {
      Parent root;
      try
      {
         // instatiate invoke the fxml loader
         FXMLLoader loader = new FXMLLoader();

         // set controller
         loader.setController(new DeleteMemberController());

         // set the location of the FXML doc
         loader.setLocation(getClass().getResource("DeleteMember.fxml"));
         root = loader.load();

         // Build the scene graph

         Scene scene = new Scene(root);

         Stage stage = new Stage();

         // show the window using the scene graph
         stage.getIcons().add(new Image(getClass().getResourceAsStream("favicon.png")));
         stage.setTitle("Delete Member");
         stage.setScene(scene);
         stage.show();
      }
      catch (IOException e)
      {
         e.printStackTrace();
      }

   }

   @FXML
   void addSponsor(ActionEvent event)
   {
      Parent root;
      try
      {
         // instatiate invoke the fxml loader
         FXMLLoader loader = new FXMLLoader();

         // set controller
         loader.setController(new AddSponsorController());

         // set the location of the FXML doc
         loader.setLocation(getClass().getResource("AddSponsor.fxml"));
         root = loader.load();

         // Build the scene graph

         Scene scene = new Scene(root);

         Stage stage = new Stage();

         // show the window using the scene graph
         stage.getIcons().add(new Image(getClass().getResourceAsStream("favicon.png")));
         stage.setTitle("Add Sponsor");
         stage.setScene(scene);
         stage.show();
      }
      catch (IOException e)
      {
         e.printStackTrace();
      }

   }

   @FXML
   void editSponsor(ActionEvent event)
   {
      Parent root;
      try
      {
         // instatiate invoke the fxml loader
         FXMLLoader loader = new FXMLLoader();

         // set controller
         loader.setController(new EditSponsorController());

         // set the location of the FXML doc
         loader.setLocation(getClass().getResource("EditSponsor.fxml"));
         root = loader.load();

         // Build the scene graph

         Scene scene = new Scene(root);

         Stage stage = new Stage();

         // show the window using the scene graph
         stage.getIcons().add(new Image(getClass().getResourceAsStream("favicon.png")));
         stage.setTitle("Edit Sponsor");
         stage.setScene(scene);
         stage.show();
      }
      catch (IOException e)
      {
         e.printStackTrace();
      }

   }

   @FXML
   void deleteSponsor(ActionEvent event)
   {
      Parent root;
      try
      {
         // instatiate invoke the fxml loader
         FXMLLoader loader = new FXMLLoader();

         // set controller
         loader.setController(new DeleteSponsorController());

         // set the location of the FXML doc
         loader.setLocation(getClass().getResource("DeleteSponsor.fxml"));
         root = loader.load();

         // Build the scene graph

         Scene scene = new Scene(root);

         Stage stage = new Stage();

         // show the window using the scene graph
         stage.getIcons().add(new Image(getClass().getResourceAsStream("favicon.png")));
         stage.setTitle("Delete Sponsor");
         stage.setScene(scene);
         stage.show();
      }
      catch (IOException e)
      {
         e.printStackTrace();
      }

   }

   @FXML
   void addLecturer(ActionEvent event)
   {

      Parent root;
      try
      {
         // instatiate invoke the fxml loader
         FXMLLoader loader = new FXMLLoader();

         // set controller
         loader.setController(new AddLecturerController());

         // set the location of the FXML doc
         loader.setLocation(getClass().getResource("AddLecturer.fxml"));
         root = loader.load();

         // Build the scene graph

         Scene scene = new Scene(root);

         Stage stage = new Stage();

         // show the window using the scene graph
         stage.getIcons().add(new Image(getClass().getResourceAsStream("favicon.png")));
         stage.setTitle("Add Lecturer");
         stage.setScene(scene);
         stage.show();
      }
      catch (IOException e)
      {
         e.printStackTrace();
      }

   }

   @FXML
   void editLecturer(ActionEvent event)
   {

      Parent root;
      try
      {
         // instatiate invoke the fxml loader
         FXMLLoader loader = new FXMLLoader();

         // set controller
         loader.setController(new EditLecturerController());

         // set the location of the FXML doc
         loader.setLocation(getClass().getResource("EditLecturer.fxml"));
         root = loader.load();

         // Build the scene graph

         Scene scene = new Scene(root);

         Stage stage = new Stage();

         // show the window using the scene graph
         stage.getIcons().add(new Image(getClass().getResourceAsStream("favicon.png")));
         stage.setTitle("Edit Lecturer");
         stage.setScene(scene);
         stage.show();
      }
      catch (IOException e)
      {
         e.printStackTrace();
      }

   }

   @FXML
   void deleteLecturer(ActionEvent event)
   {
      Parent root;
      try
      {
         // instatiate invoke the fxml loader
         FXMLLoader loader = new FXMLLoader();

         // set controller
         loader.setController(new DeleteLecturerController());

         // set the location of the FXML doc
         loader.setLocation(getClass().getResource("DeleteLecturer.fxml"));
         root = loader.load();

         // Build the scene graph

         Scene scene = new Scene(root);

         Stage stage = new Stage();

         // show the window using the scene graph
         stage.getIcons().add(new Image(getClass().getResourceAsStream("favicon.png")));
         stage.setTitle("Delete Lecturer");
         stage.setScene(scene);
         stage.show();
      }
      catch (IOException e)
      {
         e.printStackTrace();
      }

   }

   @FXML
   void addCategory(ActionEvent event)
   {
      Parent root;
      try
      {
         // instatiate invoke the fxml loader
         FXMLLoader loader = new FXMLLoader();

         // set controller
         loader.setController(new CategoryController());

         // set the location of the FXML doc
         loader.setLocation(getClass().getResource("Category.fxml"));
         root = loader.load();

         // Build the scene graph

         Scene scene = new Scene(root);

         Stage stage = new Stage();

         // show the window using the scene graph
         stage.getIcons().add(new Image(getClass().getResourceAsStream("favicon.png")));
         stage.setTitle("Category");
         stage.setScene(scene);
         stage.show();
      }
      catch (IOException e)
      {
         e.printStackTrace();
      }
   }

   @FXML
   void deleteCategory(ActionEvent event)
   {
      Parent root;
      try
      {
         // instatiate invoke the fxml loader
         FXMLLoader loader = new FXMLLoader();

         // set controller
         loader.setController(new CategoryController());

         // set the location of the FXML doc
         loader.setLocation(getClass().getResource("Category.fxml"));
         root = loader.load();

         // Build the scene graph

         Scene scene = new Scene(root);

         Stage stage = new Stage();

         // show the window using the scene graph
         stage.getIcons().add(new Image(getClass().getResourceAsStream("favicon.png")));
         stage.setTitle("Category");
         stage.setScene(scene);
         stage.show();
      }
      catch (IOException e)
      {
         e.printStackTrace();
      }
   }


   @FXML
   void getFinalizedEvents(ActionEvent event)
   {
      Parent root;
      try
      {
         // instatiate invoke the fxml loader
         FXMLLoader loader = new FXMLLoader();

         // set controller
         loader.setController(new FinalizedEventController());

         // set the location of the FXML doc
         loader.setLocation(getClass().getResource("FinalizedEvents.fxml"));
         root = loader.load();

         // Build the scene graph

         Scene scene = new Scene(root);

         Stage stage = new Stage();

         // show the window using the scene graph
         stage.getIcons().add(new Image(getClass().getResourceAsStream("favicon.png")));
         stage.setTitle("Finalized Event");
         stage.setScene(scene);
         stage.show();
      }
      catch (IOException e)
      {
         e.printStackTrace();
      }

   }

   @FXML
   void getNonFinalizedEvents(ActionEvent event)
   {
      Parent root;
      try
      {
         // instatiate invoke the fxml loader
         FXMLLoader loader = new FXMLLoader();

         // set controller
         loader.setController(new NoneFinalizedEventController());

         // set the location of the FXML doc
         loader.setLocation(getClass().getResource("NoneFinalizedEvents.fxml"));
         root = loader.load();

         // Build the scene graph

         Scene scene = new Scene(root);

         Stage stage = new Stage();

         // show the window using the scene graph
         stage.getIcons().add(new Image(getClass().getResourceAsStream("favicon.png")));
         stage.setTitle("None-Finalized Event");
         stage.setScene(scene);
         stage.show();
      }
      catch (IOException e)
      {
         e.printStackTrace();
      }

   }

   @FXML
   void selectCategory(ActionEvent event)
   {

   }

   @FXML
   void getSponsors(ActionEvent event)
   {
      Parent root;
      try
      {
         // instatiate invoke the fxml loader
         FXMLLoader loader = new FXMLLoader();

         // set controller
         loader.setController(new SponsorsGivenCategoryController());

         // set the location of the FXML doc
         loader.setLocation(getClass().getResource("SponsorsGivenCategory.fxml"));
         root = loader.load();

         // Build the scene graph

         Scene scene = new Scene(root);

         Stage stage = new Stage();

         // show the window using the scene graph
         stage.getIcons().add(new Image(getClass().getResourceAsStream("favicon.png")));
         stage.setTitle("Sponsors by given Category");
         stage.setScene(scene);
         stage.show();
      }
      catch (IOException e)
      {
         e.printStackTrace();
      }

   }

   @FXML
   void getLecturer(ActionEvent event)
   {
      Parent root;
      try
      {
         // instatiate invoke the fxml loader
         FXMLLoader loader = new FXMLLoader();

         // set controller
         loader.setController(new LecturersGivenCategoryController());

         // set the location of the FXML doc
         loader.setLocation(getClass().getResource("LecturersGivenCategory.fxml"));
         root = loader.load();

         // Build the scene graph

         Scene scene = new Scene(root);

         Stage stage = new Stage();

         // show the window using the scene graph
         stage.getIcons().add(new Image(getClass().getResourceAsStream("favicon.png")));
         stage.setTitle("Lecturers by given Category");
         stage.setScene(scene);
         stage.show();
      }
      catch (IOException e)
      {
         e.printStackTrace();
      }

   }

   @FXML
   void getNoneMembers(ActionEvent event)
   {
      Parent root;
      try
      {
         // instatiate invoke the fxml loader
         FXMLLoader loader = new FXMLLoader();

         // set controller
         loader.setController(new NoneMembersGivenCategoryController());

         // set the location of the FXML doc
         loader.setLocation(getClass().getResource("NoneMembersGivenCategory.fxml"));
         root = loader.load();

         // Build the scene graph

         Scene scene = new Scene(root);

         Stage stage = new Stage();

         // show the window using the scene graph
         stage.getIcons().add(new Image(getClass().getResourceAsStream("favicon.png")));
         stage.setTitle("None-Members by given Category");
         stage.setScene(scene);
         stage.show();
      }
      catch (IOException e)
      {
         e.printStackTrace();
      }

   }

   @FXML
   void getMembers(ActionEvent event)
   {
      Parent root;
      try
      {
         // instatiate invoke the fxml loader
         FXMLLoader loader = new FXMLLoader();

         // set controller
         loader.setController(new MembersGivenCategoryController());

         // set the location of the FXML doc
         loader.setLocation(getClass().getResource("MembersGivenCategory.fxml"));
         root = loader.load();

         // Build the scene graph

         Scene scene = new Scene(root);

         Stage stage = new Stage();

         // show the window using the scene graph
         stage.getIcons().add(new Image(getClass().getResourceAsStream("favicon.png")));
         stage.setTitle("Members by given Category");
         stage.setScene(scene);
         stage.show();
      }
      catch (IOException e)
      {
         e.printStackTrace();
      }

   }

   @FXML
   void getMembersHaveToPayMembership(ActionEvent event)
   {
      Parent root;
      try
      {
         // instatiate invoke the fxml loader
         FXMLLoader loader = new FXMLLoader();

         // set controller
         loader.setController(new MembersToPayMembershipController());

         // set the location of the FXML doc
         loader.setLocation(getClass().getResource("MembersToPayMembership.fxml"));
         root = loader.load();

         // Build the scene graph

         Scene scene = new Scene(root);

         Stage stage = new Stage();

         // show the window using the scene graph
         stage.getIcons().add(new Image(getClass().getResourceAsStream("favicon.png")));
         stage.setTitle("Members have to pay membership");
         stage.setScene(scene);
         stage.show();
      }
      catch (IOException e)
      {
         e.printStackTrace();
      }


   }

   @FXML // This method is called by the FXMLLoader when initialization is
         // complete
   void initialize()
   {
      assert mnuCategory != null : "fx:id=\"mnuCategory\" was not injected: check your FXML file 'VIAMain.fxml'.";
      assert mniAddEvent != null : "fx:id=\"mniAddEvent\" was not injected: check your FXML file 'VIAMain.fxml'.";
      assert mniDeleteLecturer != null : "fx:id=\"mniDeleteLecturer\" was not injected: check your FXML file 'VIAMain.fxml'.";
      assert btnLecturer != null : "fx:id=\"btnLecturer\" was not injected: check your FXML file 'VIAMain.fxml'.";
      assert mniEditMember != null : "fx:id=\"mniEditMember\" was not injected: check your FXML file 'VIAMain.fxml'.";
      assert mniAddCategory != null : "fx:id=\"mniAddCategory\" was not injected: check your FXML file 'VIAMain.fxml'.";
      assert mniDeleteSponsor != null : "fx:id=\"mniDeleteSponsor\" was not injected: check your FXML file 'VIAMain.fxml'.";
      assert mniDeleteMember != null : "fx:id=\"mniDeleteMember\" was not injected: check your FXML file 'VIAMain.fxml'.";
      assert mniAddParticipant != null : "fx:id=\"mniAddParticipant\" was not injected: check your FXML file 'VIAMain.fxml'.";
      assert mniDeleteEvent != null : "fx:id=\"mniDeleteEvent\" was not injected: check your FXML file 'VIAMain.fxml'.";
      assert cmbCategorySponsorsLecturers != null : "fx:id=\"cmbCategorySponsorsLecturers\" was not injected: check your FXML file 'VIAMain.fxml'.";
      assert mniAddSponsor != null : "fx:id=\"mniAddSponsor\" was not injected: check your FXML file 'VIAMain.fxml'.";
      assert mnuType != null : "fx:id=\"mnuType\" was not injected: check your FXML file 'VIAMain.fxml'.";
      assert mniAddLecturer != null : "fx:id=\"mniAddLecturer\" was not injected: check your FXML file 'VIAMain.fxml'.";
      assert mniAddMember != null : "fx:id=\"mniAddMember\" was not injected: check your FXML file 'VIAMain.fxml'.";
      assert btnMemebresNotPaidMembership != null : "fx:id=\"btnMemebresNotPaidMembership\" was not injected: check your FXML file 'VIAMain.fxml'.";
      assert mniEditLecturer != null : "fx:id=\"mniEditLecturer\" was not injected: check your FXML file 'VIAMain.fxml'.";
      assert btnNoneMembers != null : "fx:id=\"btnNoneMembers\" was not injected: check your FXML file 'VIAMain.fxml'.";
      assert c != null : "fx:id=\"c\" was not injected: check your FXML file 'VIAMain.fxml'.";
      assert mnuLecturer != null : "fx:id=\"mnuLecturer\" was not injected: check your FXML file 'VIAMain.fxml'.";
      assert mniDeleteType != null : "fx:id=\"mniDeleteType\" was not injected: check your FXML file 'VIAMain.fxml'.";
      assert mnuMember != null : "fx:id=\"mnuMember\" was not injected: check your FXML file 'VIAMain.fxml'.";
      assert mnuSponsor != null : "fx:id=\"mnuSponsor\" was not injected: check your FXML file 'VIAMain.fxml'.";
      assert btnNonFinalizedEvents != null : "fx:id=\"btnNonFinalizedEvents\" was not injected: check your FXML file 'VIAMain.fxml'.";
      assert btnSponsors != null : "fx:id=\"btnSponsors\" was not injected: check your FXML file 'VIAMain.fxml'.";
      assert mniEditSponsor != null : "fx:id=\"mniEditSponsor\" was not injected: check your FXML file 'VIAMain.fxml'.";
      assert btnMembers != null : "fx:id=\"btnMembers\" was not injected: check your FXML file 'VIAMain.fxml'.";
      assert mniAddType != null : "fx:id=\"mniAddType\" was not injected: check your FXML file 'VIAMain.fxml'.";
      assert mniDeleteCategory != null : "fx:id=\"mniDeleteCategory\" was not injected: check your FXML file 'VIAMain.fxml'.";
      assert mnuBar != null : "fx:id=\"mnuBar\" was not injected: check your FXML file 'VIAMain.fxml'.";
      assert mniEditEvent != null : "fx:id=\"mniEditEvent\" was not injected: check your FXML file 'VIAMain.fxml'.";
      assert btnFinalizedEvents != null : "fx:id=\"btnFinalizedEvents\" was not injected: check your FXML file 'VIAMain.fxml'.";

   }
}
