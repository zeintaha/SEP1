import java.util.*;

public class Non_MemberList extends Participants
{
   private ArrayList<Non_Members> nonMemberArray;

   public Non_MemberList(String name)
   {
      nonMemberArray = new ArrayList<Non_Members>();
   }

   public void addMember(Non_Members name)
   {
      nonMemberArray.add(name);
   }

   public void deleteMember(Non_Members name)
   {
      nonMemberArray.remove(name);
   }

   public ArrayList<Non_Members> findById(String iD)
   {
      ArrayList<Non_Members> iD1 = new ArrayList<Non_Members>();
      for (int i = 0; i < nonMemberArray.size(); i++)
      {
         Non_Members nonMember = nonMemberArray.get(i);
         if (nonMember.getiD().equals(iD))
         {
            iD1.add(nonMember);
         }
      }
      return iD1;
   }

   public ArrayList<Non_Members> findByName(String name)
   {
      ArrayList<Non_Members> name1 = new ArrayList<Non_Members>();
      for (int i = 0; i < nonMemberArray.size(); i++)
      {
         Non_Members nonMemberName = nonMemberArray.get(i);
         if (nonMemberName.getName().equals(name))
         {
            name1.add(nonMemberName);
         }
      }
      return name1;
<<<<<<< HEAD:VIA/src/Non_MemberList.java
   
   }

   public ArrayList<Non_Members> findByPhoneNr(int phoneNr)
   {
      ArrayList<Non_Members> phoneNr1 = new ArrayList<Non_Members>();
      for (int i = 0; i < nonMemberArray.size(); i++)
      {
         Non_Members nonMemberPhone = nonMemberArray.get(i);
         if (nonMemberPhone.getPhoneNr().equals(phoneNr))
         {
            phoneNr1.add(nonMemberPhone);
         }
      }
      return phoneNr1;
   }

   public void editLecturer(String name, String email, int iD, String phoneNr,
         String address)
=======
   }

   public void editLecturer(String name, String email, String iD,
         String phoneNr, String address)
>>>>>>> 2dfe8447c90033cd6ddfcd170fd10fd3211fc046:VIA prefinal/VIA/src/Non_MemberList.java
   {
      if (nonMemberArray.size() != 0)
      {
         for (int i = 0; i < nonMemberArray.size(); i++)
         {
            if (nonMemberArray.get(i).getiD().equals(iD))
            {
               nonMemberArray.get(i).setEmail(email);
               System.out.println(
                     "NonMember with the iD " + nonMemberArray.get(i).getiD()
                           + "has successfully updated his email adress");
            }
            if (nonMemberArray.get(i).getiD().equals(iD))
            {
               nonMemberArray.get(i).setName(name);
               System.out.println(
                     "NonMember with the iD " + nonMemberArray.get(i).getiD()
                           + "has successfully updated his name");
            }
            if (nonMemberArray.get(i).getiD().equals(iD))
            {
               nonMemberArray.get(i).setAddress(address);
               System.out.println(
                     "NonMember with the iD " + nonMemberArray.get(i).getiD()
                           + "has successfully updated his address");
            }
            if (nonMemberArray.get(i).getiD().equals(iD))
            {
               nonMemberArray.get(i).setPhoneNr(phoneNr);
               System.out.println(
                     "NonMember with the iD " + nonMemberArray.get(i).getiD()
                           + "has successfully updated his phoneNr");
            }

            else
            {
               System.out.println("There are no sponsors in the list :(");
            }
         }
      }
   }
}