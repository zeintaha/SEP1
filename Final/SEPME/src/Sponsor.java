import java.io.Serializable;

public class Sponsor implements Serializable
{
   /**
   * 
   */
   private static final long serialVersionUID = 1L;
   private String name;
   private String email;
   private String phone;
   private String address;
   private String category;

   public Sponsor(String name, String address, String phone, String email,
         String category)
   {
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

   public void setName(String name)
   {
      this.name = name;
   }

   public String getName()
   {
      return name;
   }

   public void setEmail(String email)
   {
      this.email = email;
   }

   public String getEmail()
   {
      return email;
   }

   public boolean equals(Object obj)
   {
      if (!(obj instanceof Sponsor))
      {
         return false;
      }

      Sponsor other = (Sponsor) obj;
      return (name.equals(other.name) && email.equals(other.email)
            && phone.equals(other.phone) && address.equals(other.address)
            && category.equals(other.category));

   }

   public String toString()
   {
      return name + "/" + email + "/" + phone + "/" + address + "/" + category;
   }
}