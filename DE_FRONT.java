/*
Given a string, return a version without the first 2 chars.
Except keep the first char if it is 'a' and keep the second char if it is 'b'.
The string may be any length. Harder than it looks.


deFront("Hello") → "llo"
deFront("java") → "va"
deFront("away") → "aay"
 */
package school;


public class DE_FRONT {
    public static void main(String[] args){
        String answer = deFront("Hello");
        System.out.println(answer);
    }
public static String deFront(String str) {    
  if(str.charAt(0)=='a' && str.charAt(1)!='b'){
    return ("a" + str.substring(2,str.length()));
  }else if(str.charAt(0)!='a' && str.charAt(1)=='b'){
    return (str.substring(1,str.length()));
  }else if(str.charAt(0)=='a' && str.charAt(1)=='b'){
    return str;
  }else{
    return (str.substring(2, str.length()));
  }
}
}
