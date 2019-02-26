/*
Given a string, return a new string where the first and last chars have been exchanged.


frontBack("code") → "eodc"
frontBack("a") → "a"
frontBack("ab") → "ba"
 */
package school;


public class FRONT_BACK {
    public static void main(String[] args){
    String result = frontBack("code");
    System.out.println(result);
    }
public static String frontBack(String str) {
  if (str.length()<=1){
    return str;
  }else{
  return (str.charAt(str.length()-1) + str.substring(1, str.length() -1) + str.charAt(0));
}
}
  
}
