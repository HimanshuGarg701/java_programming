/*
Given a non-negative number "num", return true if num is within 2 of a multiple of 10
. Note: (a % b) is the remainder of dividing a by b, so (7 % 5) is 2. See also: Introduction to Mod


nearTen(12) → true
nearTen(17) → false
nearTen(19) → true
 */
package school;


public class NEAR10 {
    public static void main(String[] args){
        boolean answer = nearTen(12);
        System.out.println(answer);
    }
public static boolean nearTen(int num) {
  int answer = num%10;
  if((answer ==1 || answer==2) || answer==0){
    return true;
  }
  else if(answer ==8 || answer==9){
    return true;
  
  }return false;
}

}
