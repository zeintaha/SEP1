import java.io.Serializable;

public class Lecturer implements Serializable {
    /**
    * 
    */
   private static final long serialVersionUID = 1L;
   private String name;
    private String email;
    private String phoneNr;
    private String category;
    private String adress;
    public Lecturer(String name, String address, String email, String phoneNr, String category){
        this.name = name;
        this.email = email;
        this.phoneNr = phoneNr;
        this.category = category;
        this.adress = address;
    }
    public String getAdress()
   {
      return adress;
   }
   public void setAdress(String adress)
   {
      this.adress = adress;
   }
   public String getPhoneNr()
   {
      return phoneNr;
   }
   public void setPhoneNr(String phoneNr)
   {
      this.phoneNr = phoneNr;
   }
   public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getCategory() {
        return category;
    }
    public void setCategory(String category) {
        this.category = category;
    }
    
    public String toString() {
       return  name + "/ " + adress + "/ " + email + "/ " + phoneNr + "/ " + category;
    }
    
}