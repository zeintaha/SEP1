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

   public void addParticipantsToEvent(ArrayList<Participants> participants)
   {

      for (int i = 0; i < numOfParticipants; i++)
      {
         participantsEvent[i] = participants.get(i);
      }

   }
   
   public void removeParticipantsFromEvent(int iD) {
      ArrayList<Participants> participants = new ArrayList<Participants>();
      for(int i = 0; i < participantsEvent.length; i++) {
         participants.add(participantsEvent[i]);
      }
      for(int i = 0; i < participants.size(); i++) {
      participants.get(i).deleteParticipant(iD);
      }
      addParticipantsToEvent(participants);
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

   public boolean equals(Object obj)
   {
      if (!(obj instanceof Event))
      {
         return false;
      }

      Event other = (Event) obj;
      return type.equals(other.type) && title.equals(other.title)
            && date.equals(other.date) && time.equals(other.time)
            && duration.equals(other.duration)
            && lecturer.equals(other.lecturer) && price == (other.price)
            && discountedPrice == (other.discountedPrice)
            && numOfParticipants == (other.numOfParticipants);
   }
}