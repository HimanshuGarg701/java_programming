/*
Given a string and an int n, return a string made of the first and last n chars from the string.
The string length will be at least n.


nTwice("Hello", 2) → "Helo"
nTwice("Chocolate", 3) → "Choate"
nTwice("Chocolate", 1) → "Ce"
 */
package school;


public class N_TWICE {
    public static void main(String[] args){
        String answer = nTwice("Hello", 2);
        System.out.println(answer);
    }
public static String nTwice(String str, int n) {
  int length = str.length();
  return (str.substring(0,n) + str.substring(length-n,length));
}
}
