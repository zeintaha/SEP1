import java.util.ArrayList;

public class Participants
{
   private ArrayList<Members> mem = new ArrayList<Members>();
   private ArrayList<Non_Members> non = new ArrayList<Non_Members>();
   private Non_Members participant;

  public Participants(Non_Members participant)
   {
      this.participant = participant;
   }
<<<<<<< HEAD:VIA/src/Participants.java

  public Non_Members getParticipant()
   {
      return participant;
   }

  public void setParticipant(Non_Members participant)
   {
      this.participant = participant;
   }

  public void addMemberParticipant(String iD)
   {
      for (int i = 0; i < mem.size(); i++)
      {
         if (mem.get(i).getMember().getiD().equals(iD))
         {
            participant = mem.get(i).getMember();
         }
      }
   }

  public void addNonMemberParticipant(String iD)
   {
      for (int i = 0; i < non.size(); i++)
      {
         if (non.get(i).getiD().equals(iD))
=======
   
   public void addMemberParticipant(String iD) {
      ArrayList<Members> mem = new ArrayList<Members>();
      mem = memberParticipant.findByID(iD);
      
      for(int i = 0; i < mem.size(); i++) {
         participants.add(mem.get(i).getMember());
      }
   }
   
   public void addNonMemberParticipant(String iD) {
      ArrayList<Non_Members> non = new ArrayList<Non_Members>();
      non = nonMemberParticipant.findById(iD);
      
      for(int i = 0; i < non.size(); i++) {
         participants.add(non.get(i));
      }
   }
   
   public void deleteParticipant(String iD) {
      for (int i = 0; i < participants.size(); i++)
      {
         Non_Members nonMember = participants.get(i);
         if (nonMember.getiD().equals(iD))
>>>>>>> 2dfe8447c90033cd6ddfcd170fd10fd3211fc046:VIA prefinal/VIA/src/Participants.java
         {
            participant = non.get(i);
         }
      }
   }

  @Override
   public String toString()
   {
      return  participant.toString();
   }
   
}