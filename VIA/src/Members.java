import java.util.ArrayList;

public class Members
{
   private Non_Members member;
   private MyDate datePaid;
   private MyDate dateEnd;
   private ArrayList<Activity_Subject> preferences;
   
   public Members() {
      member = new Non_Members(0, null, null, 0, null);
      datePaid = new MyDate();
      dateEnd = new MyDate();
   }

   public Members(int iD, String name, String address, int phoneNr,
         String email, int dayp, int monthp, int yearp, int dayE, int monthE,
         int yearE)
   {
      member = new Non_Members(iD, name, address, phoneNr, email);
      datePaid = new MyDate(dayp, monthp, yearp);
      dateEnd = new MyDate(dayE, monthE, yearE);
      preferences = new ArrayList<Activity_Subject>();
   }

   public Non_Members getMember()
   {
      return member;
   }

   public void setMember(Non_Members member)
   {
      this.member = member;
   }

   public MyDate getDatePaid()
   {
      return datePaid;
   }

   public void setDatePaid(MyDate datePaid)
   {
      this.datePaid = datePaid;
   }

   public MyDate getDateEnd()
   {
      return dateEnd;
   }

   public void setDateEnd(MyDate dateEnd)
   {
      this.dateEnd = dateEnd;
   }

    public ArrayList<Activity_Subject> getPreferences()
    {
    return preferences;
    }
   
    public void addPreferences(Activity_Subject subject)
    {
    this.preferences.add(subject);
    }
   
    public void delPreferences(Activity_Subject subject) {
    preferences.remove(subject);
    }

   public String toString()
   {
      return member.toString() + " / " + datePaid.toString() + " / "
            + dateEnd.toString(); // + " / " + preferences;
   }

   public boolean equals(Object obj)
   {
      if (!(obj instanceof Members))
      {
         return false;
      }

      Members other = (Members) obj;
      return member.equals(other.member) && datePaid.equals(other.datePaid)
            && dateEnd.equals(other.dateEnd);
   }
}