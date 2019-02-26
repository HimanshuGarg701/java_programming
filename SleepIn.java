

package CodingBat;

/* Question:
 The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are on vacation.
 We sleep in if it is not a weekday or we're on vacation. Return true if we sleep in.


sleepIn(false, false) → true
sleepIn(true, false) → false
sleepIn(false, true) → true
 */



public class SleepIn {
    
  public static void main(String[] args) {
        boolean result = sleepIn(false, false);
        System.out.println(result);
        
    }
    
  public static boolean sleepIn(boolean weekday, boolean vacation) {
  if (weekday == false && vacation == true){
    return true;
    }
    else if(weekday ==false && vacation ==false){
      return true;
      
    }else if(weekday==true && vacation==false){
      
      return false;
    }else if(weekday==true && vacation== true){
      
      return true;
    }
    
    else{
      
      return false;
    }
  
}
    
}

