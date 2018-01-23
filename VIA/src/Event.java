import java.io.Serializable;
import java.util.ArrayList;

public class Event implements Serializable
{
   /**
    * 
    */
   private static final long serialVersionUID = 1L;
   private Category category;
   private String title;
   private MyDate date;
   private String time;
   private String duration;
   private Lecturer lecturer;
   private double price;
   private double discountedPrice;
   private int numOfParticipants;
   private ArrayList<Participants> participants;
   private String type;

   public Event(Category category, String type, String title, MyDate date,
         String time, String duration, Lecturer lecturer, double price,
         double discountedPrice)
   {
      this.type = type;
      this.category = category;
      this.title = title;
      this.date = date;
      this.time = time;
      this.duration = duration;
      this.lecturer = lecturer;
      this.price = price;
      this.discountedPrice = discountedPrice;
      this.participants = new ArrayList<Participants>();
   }

   public void addParticipantsToEvent(Participants participant)
   {
      if (participants.size() <= numOfParticipants)
      {
         participants.add(participant);
      }

   }

   public void removeParticipantsFromEvent(String iD)
   {
      for (int i = 0; i < participants.size(); i++)
      {
         if(participants.get(i).getParticipant().getiD().equals(iD)) {
            participants.remove(i);
         }
      }
   }

   public Category getCategory()
   {
      return category;
   }

   public void setCategory(Category category)
   {
      this.category = category;
   }

   public String getTitle()
   {
      return title;
   }

   public void setTitle(String title)
   {
      this.title = title;
   }

   public MyDate getDate()
   {
      return date;
   }

   public void setDate(MyDate date)
   {
      this.date = date;
   }

   public String getTime()
   {
      return time;
   }

   public void setTime(String time)
   {
      this.time = time;
   }

   public String getDuration()
   {
      return duration;
   }

   public void setDuration(String duration)
   {
      this.duration = duration;
   }

   public Lecturer getLecturer()
   {
      return lecturer;
   }

   public void setLecturer(Lecturer lecturer)
   {
      this.lecturer = lecturer;
   }

   public double getPrice()
   {
      return price;
   }

   public void setPrice(double price)
   {
      this.price = price;
   }

   public double getDiscountedPrice()
   {
      return discountedPrice;
   }

   public void setDiscountedPrice(double discountedPrice)
   {
      this.discountedPrice = discountedPrice;
   }

   public int getNumOfParticipants()
   {
      return numOfParticipants;
   }

   public void setNumOfParticipants(int numOfParticipants)
   {
      this.numOfParticipants = numOfParticipants;
   }

   public ArrayList<Participants> getParticipants()
   {
      return participants;
   }

   public void setParticipants(ArrayList<Participants> participants)
   {
      this.participants = participants;
   }

   public String getType()
   {
      return type;
   }

   public void setType(String type)
   {
      this.type = type;
   }

   public boolean equals(Object obj)
   {
      if (!(obj instanceof Event))
      {
         return false;
      }

      Event other = (Event) obj;
      return category.equals(other.category) && type.equals(other.type) && title.equals(other.title)
            && date.equals(other.date) && time.equals(other.time)
            && duration.equals(other.duration)
            && lecturer.equals(other.lecturer) && price == (other.price)
            && discountedPrice == (other.discountedPrice)
            && numOfParticipants == (other.numOfParticipants);
   }

   @Override
   public String toString()
   {
      return "Event [category=" + category + ", title=" + title + ", date="
            + date + ", time=" + time + ", duration=" + duration + ", lecturer="
            + lecturer + ", price=" + price + ", discountedPrice="
            + discountedPrice + ", numOfParticipants=" + numOfParticipants
            + ", participants=" + participants + ", type=" + type + "]";
   }
}