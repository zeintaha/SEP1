import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Non_Members implements Serializable
{
   /**
    * 
    */
   private static final long serialVersionUID = 1L;
   private String name;
   private String address;
   private String phoneNr;
   private String email;
   private String preferences;
   private String iD;

   public Non_Members(String name, String address, String email, String phoneNr,
         String preferences)
   {
      
      this.iD = idGenerator();
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

   public String getPhoneNr()
   {
      return phoneNr;
   }

   public void setPhoneNr(String phoneNr)
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

   public String getPreferences()
   {
      return preferences;
   }

   public String getiD()
   {
      return iD;
   }

   public void setiD(String id)
   {
      this.iD = id;
   }

   public String idGenerator()
   {
      Date NdNow = new Date();
      SimpleDateFormat Nft = new SimpleDateFormat("yyMMddhhmmss");
      String Ndatetime = "N" + Nft.format(NdNow);
      return Ndatetime;
   }

   public String toString()
   {
      return iD + "/" + name + "/" + address + "/" + phoneNr + "/" + email + "/"
            + preferences;
   }

   public boolean equals(Object obj)
   {
      if (!(obj instanceof Non_Members))
      {
         return false;
      }

      Non_Members other = (Non_Members) obj;
      return iD == (other.iD) && name.equals(other.name)
            && address.equals(other.address) && phoneNr == other.phoneNr
            && email.equals(other.email);
   }
}