/*
Given 2 strings, a and b, return the number of the positions where they contain the same length 2 substring.
So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings appear in the same place in both strings.


stringMatch("xxcaazz", "xxbaaz") → 3
stringMatch("abc", "abc") → 2
stringMatch("abc", "axc") → 0
 */
package school;


public class STRING_MATCH {
    public static void main(String[] args){
    int answer = stringMatch("xxcaazz", "xxbaaz");
    System.out.println(answer);
    }
public static int stringMatch(String a, String b) {
  String c;
  String d;
  int small = Math.min(a.length(), b.length());
  int j = 0;
  for(int i=0; i<small-1;i++){
    c = a.substring(i,i+2);
    d = b.substring(i,i+2);
    if(c.equals(d)){
      j++;
    }
  }return j;
}
}
