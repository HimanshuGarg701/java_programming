/*

Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the absolute value of a number.


nearHundred(93) → true
nearHundred(90) → true
nearHundred(89) → false
 */
package school;


public class NEAR_HUNDRED {
    public static void main(String[] args){
    boolean result = nearHundred(89);
    System.out.println(result);
    }
 public static boolean nearHundred(int n) {
  if((n>=90 && n<=110) || (n>=190 && n<=210)){
    
    return true;
  }else{
    return false;
  }
}
   
}
