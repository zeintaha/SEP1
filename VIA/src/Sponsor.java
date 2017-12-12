public class Sponsor {
    private String name;
    private String email;
    private String phone;
    private String address;
    private String category;
    public Sponsor(String name, String email, String phone, String address, String category){
        this.name = name;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.category = category;
    }
    
    public String getCategory()
   {
      return category;
   }

   public void setCategory(String category)
   {
      this.category = category;
   }

   public String getPhone()
   {
      return phone;
   }

   public void setPhone(String phone)
   {
      this.phone = phone;
   }

   public String getAddress()
   {
      return address;
   }

   public void setAddress(String address)
   {
      this.address = address;
   }

   public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public String getEmail(){
        return email;
    }
    
    public String toString() {
       return name + "/" + email + "/" + phone + "/" + address;
    }
}