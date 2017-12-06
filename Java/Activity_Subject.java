public class Activity_Subject
{
   private String activityName;
   private String activityType;

  public Activity_Subject(String activityName, String activityType)
   {
      this.activityName = activityName;
      this.activityType = activityType;
   }

  public String getActivityName()
   {
      return activityName;
   }
   public String getActivityType(){
   return activityType;
   }
   public void setActivityName(String activityName)
   {
      this.activityName = activityName;
   }
   public void setActivityType(String activityType){
       this.activityType = activityType;
   }

  public boolean equals(Object obj)
   {
      if (!(obj instanceof Activity_Subject))
      {
         return false;
      }

     Activity_Subject other = (Activity_Subject) obj;
      return activityName.equals(other.activityName);
   }

  public Activity_Subject copy()
   {
      return new Activity_Subject(activityName, activityType);
   }

  public String toString()
   {
      return activityName + " / "  + activityType;
   }
}