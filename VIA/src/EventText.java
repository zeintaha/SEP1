import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class EventText
{
   public void addToTextFile(ArrayList<Event> eventlist) {
      File txtFile = new File("Events.txt");
      try {
      PrintWriter outFile = new PrintWriter(txtFile);
      for(int i = 0; i < eventlist.size(); i++) {
         outFile.println(eventlist.get(i));
         outFile.flush();
      }
      outFile.close();
      }
   catch(FileNotFoundException fne) {
      fne.printStackTrace();
   }
      
  }
  
   public ArrayList<Event> readFromTextFile(String filename){
      ArrayList<Event> eventlist = new ArrayList<Event>();
         File file = new File(filename);
         try {
         Scanner inFile = new Scanner(file); // Open the file
         while(inFile.hasNext()) {
//            String line = inFile.nextLine(); // Read the line from the file
//            String [] contents = line.split("/"); // Split the line
//            String activityName = contents[0].trim();
//            String activityType  = contents[1].trim();
         //   Event event = new Event();
          //  eventlist.add(event);
         }
         inFile.close();
         }
         catch(FileNotFoundException fne){
            fne.printStackTrace();
         }
      
     return eventlist;
      
  }
}
