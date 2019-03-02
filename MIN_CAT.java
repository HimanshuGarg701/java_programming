/*
Given two strings, append them together (known as "concatenation") and return the result.
However, if the strings are different lengths,
omit chars from the longer string so it is the same length as the shorter string.
So "Hello" and "Hi" yield "loHi". The strings may be any length.


minCat("Hello", "Hi") → "loHi"
minCat("Hello", "java") → "ellojava"
minCat("java", "Hello") → "javaello"
 */
package home;


public class MIN_CAT {
    public static void main(String[] args){
        String answer = minCat("Hello", "Hi");
        System.out.println(answer);
    }
public static String minCat(String a, String b) {
  int len1 = a.length();
  int len2 = b.length();
  if(len1 > len2){
    return (a.substring(len1-len2,len1) + b );
  }else if(len1 == len2){
    return (a+b);
  }else{
    return( a + b.substring(len2-len1,len2));
  }
}
}
