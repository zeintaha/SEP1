import java.util.ArrayList;

public class MemberList extends Participants
{
   private ArrayList<Members> memberList;

   public MemberList()
   {
      memberList = new ArrayList<Members>();
   }

   public void addMember(Members member)
   {
      memberList.add(member);
   }

   public void removeMember(Members member)
   {
      memberList.remove(member);
   }

   public ArrayList<Members> findByName(String name)
   {
      ArrayList<Members> members1 = new ArrayList<Members>();
      for (int i = 0; i < memberList.size(); i++)
      {
         Members mem = memberList.get(i);
         if (mem.getMember().getName().equals(name))
         {
            members1.add(mem);
         }
      }
      return members1;
   }

   public ArrayList<Members> findByID(int iD)
   {
      ArrayList<Members> members1 = new ArrayList<Members>();
      for (int i = 0; i < memberList.size(); i++)
      {
         Members mem = memberList.get(i);
         if (mem.getMember().getiD() == (iD))
         {
            members1.add(mem);
         }
      }
      return members1;
   }

   public ArrayList<Members> findByAddress(String address)
   {
      ArrayList<Members> members1 = new ArrayList<Members>();
      for (int i = 0; i < memberList.size(); i++)
      {
         Members mem = memberList.get(i);
         if (mem.getMember().getAddress().equals(address))
         {
            members1.add(mem);
         }
      }
      return members1;
   }

   public ArrayList<Members> findByPhoneNr(int phoneNr)
   {
      ArrayList<Members> members1 = new ArrayList<Members>();
      for (int i = 0; i < memberList.size(); i++)
      {
         Members mem = memberList.get(i);
         if (mem.getMember().getPhoneNr() == (phoneNr))
         {
            members1.add(mem);
         }
      }
      return members1;
   }

   public ArrayList<Members> findByEmail(String email)
   {
      ArrayList<Members> members1 = new ArrayList<Members>();
      for (int i = 0; i < memberList.size(); i++)
      {
         Members mem = memberList.get(i);
         if (mem.getMember().getEmail().equals(email))
         {
            members1.add(mem);
         }
      }
      return members1;
   }

   public ArrayList<Members> findByPreferenceActivityName(String activityName)
   {
      ArrayList<Members> members1 = new ArrayList<Members>();
      for (int i = 0; i < memberList.size(); i++)
      {
         Members mem = memberList.get(i);
         for (int index = 0; index < mem.getMember().getPreferences()
               .size(); index++)
         {
            if (mem.getMember().getPreferences().get(index).getActivityName()
                  .equals(activityName))
            {
               members1.add(mem);
            }
         }
      }
      return members1;
   }

   public ArrayList<Members> findByPreferenceActivityType(String activityType)
   {
      ArrayList<Members> members1 = new ArrayList<Members>();
      for (int i = 0; i < memberList.size(); i++)
      {
         Members mem = memberList.get(i);
         for (int index = 0; index < mem.getMember().getPreferences()
               .size(); index++)
         {
            if (mem.getMember().getPreferences().get(index).getActivityType()
                  .equals(activityType))
            {
               members1.add(mem);
            }
         }
      }
      return members1;
   }

   public ArrayList<Members> findByDateEnd(MyDate date)
   {
      ArrayList<Members> members1 = new ArrayList<Members>();
      for (int i = 0; i < memberList.size(); i++)
      {
         Members mem = memberList.get(i);
         if (mem.getDateEnd().equals(date))
         {
            members1.add(mem);
         }
      }
      return members1;
   }

   public void editMember(String name, String email, int iD, int phoneNr,
         String address)
   {
      if (memberList.size() != 0)
      {
         for (int i = 0; i < memberList.size(); i++)
         {
            if (memberList.get(i).getMember().getiD() == (iD))
            {
               memberList.get(i).getMember().setEmail(email);
               System.out.println("Member with the iD "
                     + memberList.get(i).getMember().getiD()
                     + "has successfully updated his email adress");
            }
            if (memberList.get(i).getMember().getiD() == (iD))
            {
               memberList.get(i).getMember().setName(name);
               System.out.println("Member with the iD "
                     + memberList.get(i).getMember().getiD()
                     + "has successfully updated his name");
            }
            if (memberList.get(i).getMember().getiD() == (iD))
            {
               memberList.get(i).getMember().setAddress(address);
               System.out.println("Member with the iD "
                     + memberList.get(i).getMember().getiD()
                     + "has successfully updated his address");
            }
            if (memberList.get(i).getMember().getiD() == (iD))
            {
               memberList.get(i).getMember().setPhoneNr(phoneNr);
               System.out.println("Member with the iD "
                     + memberList.get(i).getMember().getiD()
                     + "has successfully updated his phoneNr");
            }

            else
            {
               System.out.println("There are no members in the list :( ");
            }
         }
      }
   }
}
