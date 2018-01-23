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