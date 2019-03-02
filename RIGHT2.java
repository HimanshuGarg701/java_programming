/*
Given a string, return a "rotated right 2" version where the last 2 chars are moved to the start.
The string length will be at least 2.


right2("Hello") → "loHel"
right2("java") → "vaja"
right2("Hi") → "Hi"
 */
package school;


public class RIGHT2 {
    public static void main(String[] args){
        String answer = right2("Hello");
        System.out.println(answer);
    }
public static String right2(String str) {
  int length = str.length();
  return (str.substring(length-2, length) + str.substring(0,length-2));
}

}
