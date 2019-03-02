/*
Given a string of even length, return a string made of the middle two chars,
so the string "string" yields "ri". The string length will be at least 2.


middleTwo("string") → "ri"
middleTwo("code") → "od"
middleTwo("Practice") → "ct"
 */
package school;


public class MIDDLE_TWO {
    public static void main(String[] args){
        String answer = middleTwo("string");
        System.out.println(answer);
    }
public static String middleTwo(String str) {
  int half = str.length()/2;
  return (str.substring(half-1, half+1));

}

}
