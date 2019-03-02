/*
Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".


firstHalf("WooHoo") → "Woo"
firstHalf("HelloThere") → "Hello"
firstHalf("abcdef") → "abc"
 */
package school;


public class FIRST_HALF {
    public static void main(String[] args){
        String answer = firstHalf("WooHoo");
        System.out.println(answer);
    }
public static String firstHalf(String str) {
  int half = str.length()/2;
  return(str.substring(0,half));
}

}
