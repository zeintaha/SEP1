import java.io.Serializable;

public class Category implements Serializable
{
   /**
    * 
    */
   private static final long serialVersionUID = 1L;
   private String category;
   
   public Category( String category) {
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
   
   public String toString() {
      return category;
   }
   
   
}
