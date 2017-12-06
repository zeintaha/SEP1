/**
 * This class represents a Lecturer
 * 
 * @author Liviu
 * @version 1.0, 29/11/2017
 */
public class Lecturer
{
   private String name;
   private String email;
   private String subject;
   private int salary;
   /**
   * Four-argument constructor. Illegal dates are converted to legal
   * dates; a negative year is set to its positive counterpart, a
   * month less than 1 is set to 1 and more than 12 is set to 12. A
   * day less than 1 is set to 1 and a day more than the last day of
   * the specified month is set to this last day
   *
   * @param day
   * the day
   * @param month
   * the month as an integer in the range 1-12
   * @param year
   * the year
   */
  
   public Lecturer(String name, String email, String subject, int salary)
   {
      this.name = name;
      this.email = email;
      this.subject = subject;
      this.salary = salary;
   }

   public String getName()
   {
      return name;
   }

   public void setName(String name)
   {
      this.name = name;
   }

   public String getEmail()
   {
      return email;
   }

   public void setEmail(String email)
   {
      this.email = email;
   }

   public String getSubject()
   {
      return subject;
   }

   public void setSubject(String subject)
   {
      this.subject = subject;
   }

   public int getSalary()
   {
      return salary;
   }

   public void setSalary(int salary)
   {
      this.salary = salary;
   }

   public boolean equals(Lecturer other)
   {
      if (other.subject == this.subject)
         return true;
      else
         return false;
   }

   public Lecturer copy()
   {
      Lecturer newLecturer = new Lecturer(name, email, subject, salary);
      return newLecturer;
   }

   public String toString()
   {
      return name + " " + email + " " + subject + " " + salary;
   }
}
