import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Members implements Serializable
{
   /**
<<<<<<< HEAD:VIA/src/Members.java
    *
=======
    * 
>>>>>>> 2dfe8447c90033cd6ddfcd170fd10fd3211fc046:VIA prefinal/VIA/src/Members.java
    */
   private static final long serialVersionUID = 1L;
   private Non_Members member;
   private MyDate datePaid;
   private MyDate dateEnd;

<<<<<<< HEAD:VIA/src/Members.java
 
=======
   
>>>>>>> 2dfe8447c90033cd6ddfcd170fd10fd3211fc046:VIA prefinal/VIA/src/Members.java
   public Members() {
      member = new Non_Members(null, null, null, null, null);
      datePaid = new MyDate();
      dateEnd = new MyDate();
   }

<<<<<<< HEAD:VIA/src/Members.java
  public Members(Non_Members member, MyDate datePaid)
   {
      this.member = member;
      this.member.setiD(idGeneratorMember());
      this.datePaid = datePaid;
      this.dateEnd = new MyDate(datePaid.getDay(), datePaid.getDay(), datePaid.getYear()+1);
   }
  
   public Members(Non_Members member, MyDate datePaid, String iD)
   {
      this.member = member;
      this.member.setiD(iD);
      this.datePaid = datePaid;
      this.dateEnd = new MyDate(datePaid.getDay(), datePaid.getDay(), datePaid.getYear()+1);
   }
  
=======
   public Members(Non_Members member, MyDate datePaid)
   {
      this.member = member;
      this.member.setiD(idGeneratorMember());
      this.datePaid = datePaid;
      this.dateEnd = new MyDate(datePaid.getDay(), datePaid.getDay(), datePaid.getYear()+1);
   }
   
   public Members(Non_Members member, MyDate datePaid, String iD)
   {
      this.member = member;
      this.member.setiD(iD); 
      this.datePaid = datePaid;
      this.dateEnd = new MyDate(datePaid.getDay(), datePaid.getDay(), datePaid.getYear()+1);
   }
   
>>>>>>> 2dfe8447c90033cd6ddfcd170fd10fd3211fc046:VIA prefinal/VIA/src/Members.java
   

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

<<<<<<< HEAD:VIA/src/Members.java
  public String toString()
=======
   public String toString()
>>>>>>> 2dfe8447c90033cd6ddfcd170fd10fd3211fc046:VIA prefinal/VIA/src/Members.java
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
<<<<<<< HEAD:VIA/src/Members.java
  
=======
   
>>>>>>> 2dfe8447c90033cd6ddfcd170fd10fd3211fc046:VIA prefinal/VIA/src/Members.java
   public String idGeneratorMember()
   {
      Date dNow = new Date();
      SimpleDateFormat ft = new SimpleDateFormat("yyMMddhhmmss");
      String datetime = "M" + ft.format(dNow);
      return datetime;
   }
}