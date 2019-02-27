/*
Given a string, return a new string where the last 3 chars are now in upper case.
If the string has less than 3 chars, uppercase whatever is there.
Note that str.toUpperCase() returns the uppercase version of a string.


endUp("Hello") → "HeLLO"
endUp("hi there") → "hi thERE"
endUp("hi") → "HI"
 */
package school;


public class END_UP {
    public static void main(String[] args){
        String answer = endUp("Hello");
        System.out.println(answer);
    }
public static String endUp(String str) {
  if(str.length()<=3){
    return str.toUpperCase();
  }else{
    return ((str.substring(0,str.length()-3)) + (str.substring(str.length()-3, str.length()).toUpperCase()));
  }
}
}
