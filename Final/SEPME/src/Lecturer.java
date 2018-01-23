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
<<<<<<< HEAD:VIA/src/Lecturer.java
    private String address;
    public Lecturer(String name, String email, String phoneNr, String category, String address){
=======
    public Lecturer(String name,  String email, String phoneNr, String category){
>>>>>>> 2dfe8447c90033cd6ddfcd170fd10fd3211fc046:Final/SEPME/src/Lecturer.java
        this.name = name;
        this.email = email;
        this.phoneNr = phoneNr;
        this.category = category;
<<<<<<< HEAD:VIA/src/Lecturer.java
        this.address = address;
    }
    public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhoneNr()
=======
       
    }
    
  
   public String getPhoneNr()
>>>>>>> 2dfe8447c90033cd6ddfcd170fd10fd3211fc046:Final/SEPME/src/Lecturer.java
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
       return  name + "/ "  + "/ " + email + "/ " + phoneNr + "/ " + category;
    }
    
}