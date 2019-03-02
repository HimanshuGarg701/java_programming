/*
Given a string, return true if the first 2 chars in the string also appear at the end of the string, such as with "edited".


frontAgain("edited") → true
frontAgain("edit") → false
frontAgain("ed") → true
 */
package home;


public class FRONT_AGAIN {
    public static void main(String[] args){
        boolean answer = frontAgain("edited");
        System.out.println(answer);
    }
public static boolean frontAgain(String str) {
  if(str.length()<2){
    return false;
  }else{
    int len = str.length();
    String a = str.substring(0,2);
    String b = str.substring(len-2, len);
    if(a.equals(b)){
      return true;
    }else{
      return false;
    }
  }
}
}
