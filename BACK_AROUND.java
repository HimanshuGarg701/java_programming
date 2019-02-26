/*
Given a string,
take the last char and return a new string with the last char added at the front and back,
so "cat" yields "tcatt". The original string will be length 1 or more.


backAround("cat") → "tcatt"
backAround("Hello") → "oHelloo"
backAround("a") → "aaa"
 */
package school;


public class BACK_AROUND {
    public static void main(String[] args){
    String result = backAround("Hello");
    System.out.println(result);
    }
public static String backAround(String str) {
  if (str.length()>=2){
    char str_2 = (str.charAt(str.length()-1));
    return(str_2 + str.substring(0,str.length())+str_2);
    
  }else{
    return (str + str + str);
  }
}
    
}
