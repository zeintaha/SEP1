import java.util.ArrayList;

public class Non_Members
{
   private String name;
   private String address;
   private int phoneNr;
   private String email;
   private ArrayList<Activity_Subject> preferences;
   private int iD;

   public Non_Members(int iD, String name, String address, int phoneNr,
         String email)
   {
      this.iD = iD;
      this.name = name;
      this.address = address;
      this.phoneNr = phoneNr;
      this.email = email;
      this.preferences = new ArrayList<Activity_Subject>();
   }
   
   public Non_Members(int iD, String name, String address, int phoneNr,
         String email, ArrayList<Activity_Subject> preferences)
   {
      this.iD = iD;
      this.name = name;
      this.address = address;
      this.phoneNr = phoneNr;
      this.email = email;
      this.preferences = preferences;
   }

   public String getName()
   {
      return name;
   }

   public void setName(String name)
   {
      this.name = name;
   }

   public String getAddress()
   {
      return address;
   }

   public void setAddress(String address)
   {
      this.address = address;
   }

   public int getPhoneNr()
   {
      return phoneNr;
   }

   public void setPhoneNr(int phoneNr)
   {
      this.phoneNr = phoneNr;
   }

   public String getEmail()
   {
      return email;
   }

   public void setEmail(String email)
   {
      this.email = email;
   }

   public ArrayList<Activity_Subject> getPreferences()
   {
      return preferences;
   }

   public void addPreferences(Activity_Subject subject)
   {
      this.preferences.add(subject);
   }

   public int getiD()
   {
      return iD;
   }

   public void setiD(int iD)
   {
      this.iD = iD;
   }

   public String toString()
   {
      return iD + "//" + name + "//" + address + "//" + phoneNr + "//"
            + email + "//" + preferences;
   }
   
   public boolean equals(Object obj)
   {
      if (!(obj instanceof Non_Members))
      {
         return false;
      }

     Non_Members other = (Non_Members) obj;
      return iD == (other.iD) && name.equals(other.name) && address.equals(other.address) && phoneNr == other.phoneNr && email.equals(other.email);
   }
}