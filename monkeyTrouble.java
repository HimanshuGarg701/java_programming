/*
We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
We are in trouble if they are both smiling or if neither of them is smiling. Return true if we are in trouble.


monkeyTrouble(true, true) → true
monkeyTrouble(false, false) → true
monkeyTrouble(true, false) → false
*/
package CodingBat;

public class monkeyTrouble {
    public static void main(String[] args){
    boolean result = monkeyTrouble(true,true);
    System.out.println(result);
    }
public static boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
  if(aSmile==true && bSmile== true){
    
    return true;
  }else if(aSmile==false && bSmile==false){
    
    return true;
  }else if(aSmile== true && bSmile==false){
    
    return false;
  }else{
    
    return false;
  }
  
} 
}
