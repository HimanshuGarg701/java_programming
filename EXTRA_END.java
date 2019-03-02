/*
Given a string, return a new string made of 3 copies of the last 2 chars of the original string.
The string length will be at least 2.


extraEnd("Hello") → "lololo"
extraEnd("ab") → "ababab"
extraEnd("Hi") → "HiHiHi"
 */
package school;


public class EXTRA_END {
    public static void main(String[] args){
        String answer = extraEnd("Hello");
        System.out.println(answer);
    }
public static String extraEnd(String str) {
  int length = str.length();
  String answer = str.substring(length-2, length);
  return (answer + answer + answer);
}

}
