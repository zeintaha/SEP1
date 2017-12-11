    import java.io.File;
    import java.io.FileNotFoundException;
    import java.io.PrintWriter;
    import java.util.ArrayList;
    import java.util.Scanner;

    public class ActivitySubjectText {
       public void addToTextFile(ArrayList<Activity_Subject> aslist) {
          File txtFile = new File("activitysubject.txt");
          try {
          PrintWriter outFile = new PrintWriter(txtFile);
          for(int i = 0; i < aslist.size(); i++) {
             outFile.println(aslist.get(i));
             outFile.flush();
          }
          outFile.close();
          }
       catch(FileNotFoundException fne) {
          fne.printStackTrace();
       }
          
      }
      
       public ArrayList<Activity_Subject> readFromTextFile(String filename){
          ArrayList<Activity_Subject> aslist = new ArrayList<Activity_Subject>();
             File file = new File(filename);
             try {
             Scanner inFile = new Scanner(file); // Open the file
             while(inFile.hasNext()) {
                String line = inFile.nextLine(); // Read the line from the file
                String [] contents = line.split("/"); // Split the line
                String activityName = contents[0].trim();
                String activityType  = contents[1].trim();
                Activity_Subject as = new Activity_Subject(activityName, activityType);
                aslist.add(as);
             }
             inFile.close();
             }
             catch(FileNotFoundException fne){
                fne.printStackTrace();
             }
          
         return aslist;
          
      }
    }