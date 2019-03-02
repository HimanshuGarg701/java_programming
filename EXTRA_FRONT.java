/*
Given a string, return a new string made of 3 copies of the first 2 chars of the original string.
The string may be any length. If there are fewer than 2 chars, use whatever is there.


extraFront("Hello") → "HeHeHe"
extraFront("ab") → "ababab"
extraFront("H") → "HHH"
 */
package school;


public class EXTRA_FRONT {
    public static void main(String[] args){
        String answer = extraFront("Hello");
        System.out.println(answer);
    }
public static String extraFront(String str) {
  if(str.length()<2){
    return (str+str+str);
  }else{
    String a = str.substring(0,2);
    return (a+a+a);
  }
}

}
