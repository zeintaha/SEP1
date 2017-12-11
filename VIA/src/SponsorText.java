import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class SponsorText
{
   public void addToTextFile(ArrayList<Sponsor> splist) {
      File txtFile = new File("Sponsors.txt");
      try {
      PrintWriter outFile = new PrintWriter(txtFile);
      for(int i = 0; i < splist.size(); i++) {
         outFile.println(splist.get(i));
         outFile.flush();
      }
      outFile.close();
      }
   catch(FileNotFoundException fne) {
      fne.printStackTrace();
   }
      
  }
  
   public ArrayList<Sponsor> readFromTextFile(String filename){
      ArrayList<Sponsor> splist = new ArrayList<Sponsor>();
         File file = new File(filename);
         try {
         Scanner inFile = new Scanner(file); // Open the file
         while(inFile.hasNext()) {
            String line = inFile.nextLine(); // Read the line from the file
            String [] contents = line.split("/"); // Split the line
            String sponsorName = contents[0].trim();
            String sponsorEmail  = contents[1].trim();
            boolean sponsorNewsletter = Boolean.parseBoolean(contents[2].trim());
            Sponsor sp = new Sponsor(sponsorName, sponsorEmail, sponsorNewsletter);
            splist.add(sp);
         }
         inFile.close();
         }
         catch(FileNotFoundException fne){
            fne.printStackTrace();
         }
      
     return splist;
      
  }
}
