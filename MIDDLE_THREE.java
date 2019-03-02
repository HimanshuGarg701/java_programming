/*

Given a string of odd length, return the string length 3 from its middle,
so "Candy" yields "and". The string length will be at least 3.


middleThree("Candy") → "and"
middleThree("and") → "and"
middleThree("solving") → "lvi"
 */
package home;


public class MIDDLE_THREE {
    public static void main(String[] args){
        String answer = middleThree("Candy");
        System.out.println(answer);
    }
public static String middleThree(String str) {
  int half = str.length()/2;
  return (str.substring(half-1, half+2));
}
}
