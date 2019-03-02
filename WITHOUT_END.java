/*
Given a string, return a version without the first and last char, so "Hello" yields "ell". The string length will be at least 2.


withoutEnd("Hello") → "ell"
withoutEnd("java") → "av"
withoutEnd("coding") → "odin"
 */
package school;


public class WITHOUT_END {
    public static void main(String[] args){
        String answer = withoutEnd("Hello");
        System.out.println(answer);
    }
public static String withoutEnd(String str) {
  return (str.substring(1, str.length()-1));
}
}
