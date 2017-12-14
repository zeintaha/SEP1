import java.util.ArrayList;

public class Participants
{
   private MemberList memberParticipant;
   private Non_MemberList nonMemberParticipant;
   private ArrayList<Non_Members> participants;
   
   public Participants() {
      participants = new ArrayList<Non_Members>();
   }
   
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
         {
            participants.remove(nonMember);
         }
      }
   }
   
}