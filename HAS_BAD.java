/*
Given a string, return true if "bad" appears starting at index 0 or 1 in the string,
such as with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0.
Note: use .equals() to compare 2 strings.


hasBad("badxx") → true
hasBad("xbadxx") → true
hasBad("xxbadxx") → false
 */
package home;


public class HAS_BAD {
    public static void main(String[] args){
        boolean answer = hasBad("badxx");
        System.out.println(answer);
    }
public static boolean hasBad(String str) {
  if(str.length()<=3){
    if(str.equals("bad"))
    { return true;}
    return false;
  }else
  {
  if(str.substring(0,3).equals("bad") || str.substring(1,4).equals("bad") ){
    return true;
  }
  }return false;
}

}
