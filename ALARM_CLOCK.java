/*
Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a boolean indicating if we are on vacation,
return a string of the form "7:00" indicating when the alarm clock should ring.
Weekdays, the alarm should be "7:00" and on the weekend it should be "10:00".
Unless we are on vacation -- then on weekdays it should be "10:00" and weekends it should be "off".


alarmClock(1, false) → "7:00"
alarmClock(5, false) → "7:00"
alarmClock(0, false) → "10:00"

 */
package school;

public class ALARM_CLOCK {
    public static void main(String[] args){
        String answer = alarmClock(1, false);
        System.out.println(answer);
    }
public static String alarmClock(int day, boolean vacation) {
  if(vacation ==true){
    if(day==0 || day==6){return ("off");}
    else if(day>=1 && day<=5){return ("10:00");}
  }else{
    if(day==0 || day==6){return ("10:00");}
    else if(day>=1 && day<=5){return ("7:00");}
  }return "";
}

}
