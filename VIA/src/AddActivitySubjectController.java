
/**
 * Sample Skeleton for ‘Add_Activity_Subject.fxml’ Controller Class
 */

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

public class AddActivitySubjectController implements Initializable
{
   private ArrayList<Activity_Subject> activityList;
   public AddActivitySubjectController()
   {
      activityList = new ArrayList<Activity_Subject>();
   }

   @FXML
   private Button btnAddActivitySubject;

   @FXML
   private TextField activityTypeTxtField;

   @FXML
   private TextField activityNameTxtField;

   @FXML
   private ComboBox<Activity_Subject> cmbActivitySubject = new ComboBox<Activity_Subject>();

   @FXML
   private Button btnEditActivity;

   public void cmbSelectSubject()
   {

      // activityList = new ArrayList<Activity_Subject>();
      // activityList = (ArrayList<Activity_Subject>)
      // deserializeAddress(filename);

      // for(int i=0; i< activityList.size(); i++) {
      // cmbActivitySubject.setValue(activityList.get(i));
      // }
   }

   // public void setCmbActivitySubject()
   // {
   // activityNameTxtField.setText(cmbActivitySubject.getValue().getActivityName());
   // activityTypeTxtField.setText(cmbActivitySubject.getValue().getActivityType());
   //
   // }

   // @SuppressWarnings("unchecked")
   // public void addActivitySubject()
   // throws ClassNotFoundException, IOException, EOFException
   // {
   // String activityName = activityNameTxtField.getText();
   // String activityType = activityTypeTxtField.getText();
   // activityList = new ArrayList<Activity_Subject>();
   // cmbActivitySubject = new ComboBox<Activity_Subject>();
   // activityList = (ArrayList<Activity_Subject>) readObjFromFile(filename);
   // Activity_Subject asb = new Activity_Subject(activityName, activityType);
   // activityList.add(asb);
   // writeObjFromFile(activityList, filename);
   // // cmbActivitySubject.getItems().addAll(activityList);
   //
   // JOptionPane.showMessageDialog(null, asb.toString() + " Added ");
   // refreshComboBox();
   // }

   // @SuppressWarnings({ "unused", "unchecked" })
   // private void showWrittenData()
   // {
   // ArrayList<Activity_Subject> list = (ArrayList<Activity_Subject>)
   // readObjFromFile(
   // filename);
   // for (int i = 0; i < list.size(); i++)
   // {
   // System.out.println(list.get(i));
   // }
   //
   // }

   public void editActivity()
   {
      // activityList = new ArrayList<Activity_Subject>();
      // activityList = (ArrayList<Activity_Subject>) readObjFromFile(filename);
      // String activityName = activityNameTxtField.getText();
      // String activityType = activityTypeTxtField.getText();
      // editActivitySubject(cmbActivitySubject.getValue(), activityName,
      // activityType);
   }

   public void addASubject(String name, String type)
   {

      Activity_Subject a1 = new Activity_Subject(name, type);
      activityList.add(a1);
   }

   public ArrayList<Activity_Subject> findByActivityName(String subject)
   {
      ArrayList<Activity_Subject> activity1 = new ArrayList<Activity_Subject>();
      for (int i = 0; i < activityList.size(); i++)
      {
         Activity_Subject activity = activityList.get(i);
         if (activity.getActivityName().equals(subject))
         {
            activity1.add(activity);
         }
      }
      return activity1;
   }

   public void removeActivitySubject(Activity_Subject activityName)
   {
      this.activityList.remove(activityName);
   }

   public void editActivitySubject(Activity_Subject a1, String activityName,
         String activityType)
   {
      removeActivitySubject(a1);
      addASubject(activityName, activityType);
   }

   public void refreshComboBox()
   {
      // activityList = (ArrayList<Activity_Subject>) readObjFromFile(filename);
      // cmbActivitySubject.getItems().addAll(activityList);
   }

   @Override
   public void initialize(URL arg0, ResourceBundle arg1)
   {
      refreshComboBox();
   }
}
