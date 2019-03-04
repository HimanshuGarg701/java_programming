/*
Given two ints, each in the range 10..99, return true if there is a digit that appears in both numbers,
such as the 2 in 12 and 23. (Note: division, e.g. n/10, gives the left digit while the % "mod" n%10 gives the right digit.)


shareDigit(12, 23) → true
shareDigit(12, 43) → false
shareDigit(12, 44) → false
 */
package school;


public class SHARE_DIGIT {
    public static void main(String[] args){
        boolean answer = shareDigit(12,23);
        System.out.println(answer);
    }
public static boolean shareDigit(int a, int b) {
  int last_a = a%10;
  int first_a = a/10;
  
  int last_b = b%10;
  int first_b = b/10;
  
  if(last_a==last_b || first_a==last_b){
    return true;
  }else if(last_a == first_b || first_a==first_b){
    return true;
  }return false;
  
}

}
