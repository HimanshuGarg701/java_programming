/*
Given 2 non-negative ints, a and b, return their sum, so long as the sum has the same number of digits as a.
If the sum has more digits than a, just return a without b.
(Note: one way to compute the number of digits of a non-negative int n is to convert it to a string with String.valueOf(n)
and then check the length of the string.)


sumLimit(2, 3) → 5
sumLimit(8, 3) → 8
sumLimit(8, 1) → 9
 */
package school;


public class SUM_LIMIT {
    public static void main(String[] args){
        int answer = sumLimit(2, 3);
        System.out.println(answer);
    }
public static int sumLimit(int a, int b) {
  
  String a1 = String.valueOf(a);
  
  int len1 = a1.length();
  
  int sum = a + b;
  String sum1 = String.valueOf(sum);
  if(sum1.length() == len1){
    return sum;
  }return a;
}

}
