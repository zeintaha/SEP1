
public class Clock
{
   private int hour;
   private int minute;
   private int second;
   
   public Clock(int hour, int minute, int second) {
      this.hour=hour;
      this.minute=minute;
      this.second=second;
   }
   
   public Clock(int totalSeconds) {
      this.hour=totalSeconds/3600;
      this.minute=totalSeconds%3600/60;
      this.second=totalSeconds%3600%60;
   }
   
   public void set(int hour, int minute, int second) {
      this.hour=hour;
      this.minute=minute;
      this.second=second;
   }
   
   public int getHour() {
      return hour;
   }
   
   public int getMinute() {
      return minute;
   }
   
   public int getSecond() {
      return second;
   }
   
   public void tic() {
      this.second=second+1;
      if (second >=60) {
         second = 00;
         minute=minute+1;
         if (minute >=60) {
            minute = 00;
            hour = hour +1;
            if (hour >=24) {
               hour = 00;
            }
         }
      }
   }
   
   public int convertToSeconds() {
      int totalSeconds;
      totalSeconds = hour*3600 + minute*60 + second;
      return totalSeconds;
   }
   
   
}
