/*
 Given three ints, a b c, return true if two or more of them have the same rightmost digit.
The ints are non-negative. Note: the % "mod" operator computes the remainder, e.g. 17 % 10 is 7.


lastDigit(23, 19, 13) → true
lastDigit(23, 19, 12) → false
lastDigit(23, 19, 3) → true
 */
package school;

public class LASTT_DIGIT {
    public static void main(String[] args){
        boolean answer = lastDigit(23, 19, 13);
        System.out.println(answer);
        
    }
public static boolean lastDigit(int a, int b, int c) {
  int first = a%10;
  int second = b%10;
  int third = c%10;
 
  if(((first == second) || (second == third)) || (first ==third)){
    return true;
  }return false;
}

}
