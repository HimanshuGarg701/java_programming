/*
 Given a string, return a version without both the first and last char of the string.
 The string may be any length, including 0.


withouEnd2("Hello") → "ell"
withouEnd2("abc") → "b"
withouEnd2("ab") → ""
 */
package school;


public class WITHOUT_END2 {
    public static void main(String[] args){
        String answer = withouEnd2("Hello");
        System.out.println(answer);
    }
public static String withouEnd2(String str) {
  if(str.length()<3){
    return "";
  }else{
    return (str.substring(1,str.length()-1));
  }
}

}
