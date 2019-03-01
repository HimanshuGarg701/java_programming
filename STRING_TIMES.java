/*
Given a string and a non-negative int n, return a larger string that is n copies of the original string.


stringTimes("Hi", 2) → "HiHi"
stringTimes("Hi", 3) → "HiHiHi"
stringTimes("Hi", 1) → "Hi"
 */
package school;


public class STRING_TIMES {
    public static void main(String[] args){
    String answer = stringTimes("Hi", 2);
    System.out.println(answer);
    }
    public static String stringTimes(String str, int n) {
  int i = 0;
  String answer = "";
  while(i<n){
    answer = answer + str;
    i++;
  }
  return answer;
}

}
