import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ToBinary
{
   private String filename;

   public ToBinary(String filename)
   {
      this.filename = filename;
   }

   public void writeObjToFile(Object obj)
   {

      FileOutputStream fout = null;
      ObjectOutputStream oos = null;

      try
      {

         fout = new FileOutputStream(filename, false);
         oos = new ObjectOutputStream(fout);
         oos.writeObject(obj);

         System.out.println("Done");

      }
      catch (Exception ex)
      {

         ex.printStackTrace();

      }
      finally
      {

         if (fout != null)
         {
            try
            {
               fout.close();
            }
            catch (IOException e)
            {
               e.printStackTrace();
            }
         }

         if (oos != null)
         {
            try
            {
               oos.close();
            }
            catch (IOException e)
            {
               e.printStackTrace();
            }
         }
      }
   }

   public Object readObjFromFile()
   {
      FileInputStream fout = null;
      ObjectInputStream ois = null;
      Object obj = new Object();
      try
      {

         fout = new FileInputStream(filename);
         ois = new ObjectInputStream(fout);
         obj = ois.readObject();

         System.out.println("Done");

      }
      catch (Exception ex)
      {

         ex.printStackTrace();

      }
      finally
      {

         if (fout != null)
         {
            try
            {
               fout.close();
            }
            catch (IOException e)
            {
               e.printStackTrace();
            }
         }

         if (ois != null)
         {
            try
            {
               ois.close();
            }
            catch (IOException e)
            {
               e.printStackTrace();
            }
         }
      }
      return obj;
   }

   public static byte[] serialize(Object obj) throws IOException
   {
      try (ByteArrayOutputStream b = new ByteArrayOutputStream())
      {
         try (ObjectOutputStream o = new ObjectOutputStream(b))
         {
            o.writeObject(obj);
         }
         return b.toByteArray();
      }
   }

   public static Object deserialize(byte[] bytes)
         throws IOException, ClassNotFoundException
   {
      try (ByteArrayInputStream b = new ByteArrayInputStream(bytes))
      {
         try (ObjectInputStream o = new ObjectInputStream(b))
         {
            return o.readObject();
         }
      }
   }

}