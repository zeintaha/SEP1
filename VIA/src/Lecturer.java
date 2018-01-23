

public class Lecturer {
    private String name;
    private String email;
    private String phoneNr;
    private String category;
    private String address;
    public Lecturer(String name, String email, String phoneNr, String category, String address){
        this.name = name;
        this.email = email;
        this.phoneNr = phoneNr;
        this.category = category;
        this.address = address;
    }
    public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
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
       return  name + "/ " + email + "/ " + phoneNr + "/ " + category;
    }
    
}