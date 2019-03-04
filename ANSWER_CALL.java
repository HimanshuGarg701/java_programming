/*
Your cell phone rings. Return true if you should answer it.
Normally you answer, except in the morning you only answer if it is your mom calling.
In all cases, if you are asleep, you do not answer.


answerCell(false, false, false) → true
answerCell(false, false, true) → false
answerCell(true, false, false) → false
 */
package school;


public class ANSWER_CALL {
    public static void main(String[] args){
        boolean answer = answerCell(false, false, false);
        System.out.println(answer);
    }
public static boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
  if(isAsleep==true){
    return false;
  }else if(isMorning==true && isMom==true){
    return true;
  }
  else if(isMorning == false){
    return true;
  
  }return false;
}

}
