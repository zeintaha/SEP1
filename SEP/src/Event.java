import java.util.ArrayList;

public class Event
{
   private Activity_Subject type;
   private String title;
   private MyDate date;
   private Clock time;
   private Clock duration;
   private Lecturer lecturer;
   private double price;
   private double discountedPrice;
   private int numOfParticipants;
   Participants[] participantsEvent;

   public Event(Activity_Subject type, String title, MyDate date, Clock time,
         Clock duration, Lecturer lecturer, double price,
         double discountedPrice, int numOfParticipants)
   {
      this.type = type;
      this.title = title;
      this.date = date; 
      this.time = time;
      this.duration = duration;
      this.lecturer = lecturer;
      this.price = price;
      this.discountedPrice = discountedPrice;
      this.numOfParticipants = numOfParticipants;
      participantsEvent = new Participants[getNumOfParticipants()];
   }
   
   public void addParticipantsToEvent(ArrayList<Participants> participants) {
      
         participantsEvent[numOfParticipants] = participants.toArray();
      
   }
   

   public Activity_Subject getType()
   {
      return type;
   }

   public void setType(Activity_Subject type)
   {
      this.type = type;
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

   public Clock getTime()
   {
      return time;
   }

   public void setTime(Clock time)
   {
      this.time = time;
   }

   public Clock getDuration()
   {
      return duration;
   }

   public void setDuration(Clock duration)
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
   
}
