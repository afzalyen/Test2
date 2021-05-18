public class Clock{
  private int hours;
  private int minutes;
  private int seconds;
  public Clock (){
    hours=12;
    minutes=0;
    seconds=0;
  }
  public Clock (int h,int m,int s){
    hours=h;
    minutes=m;
    seconds=s;
  }
  public Clock (int s){
    int hours=seconds/3600;
    int minutes=(seconds%3600)/60;
    seconds=(seconds%3600)%60;
  }
  public void setClock(int s){
    int hours=seconds/3600;
    int minutes=(seconds%3600)/60;
    seconds=(seconds%3600)%60;
  }
  public int getHours(){
    return hours;
  }
  public int getMinutes(){
    return minutes;
  }
  public int getSeconds(){
    return seconds;
  }
  public void setHours(int h){
    hours=h;
  }
  public void setMinutes(int m){
    minutes=m;
  }
  public void setSeconds(int s){
    seconds=s;
  }
  public void tick(){
    seconds++;
    if (seconds==60){
      minutes++;
      seconds=0;
    }
  }
  public String toString(){
    return hours+" "+minutes+" "+seconds;
  }
  public void tickDown(){
    seconds--;
    if(seconds==-1){
      minutes--;
      seconds=60;
    }
  } 
  public Clock addClock(Clock temp) {
    hours=temp.hours;
    minutes=temp.minutes;
    seconds=temp.seconds;
    Clock a= new Clock (hours, minutes, seconds);
    return a;
  }
    public Clock subtractClock(Clock temp) {
    hours=hours-temp.hours;
    minutes=minutes-temp.minutes;
    seconds=seconds-temp.seconds;
    Clock a= new Clock (hours, minutes, seconds);
    return a;
  }
}
