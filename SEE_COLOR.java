/*
Given a string, if the string begins with "red" or "blue" return that color string, otherwise return the empty string.


seeColor("redxx") → "red"
seeColor("xxred") → ""
seeColor("blueTimes") → "blue"
 */
package school;


public class SEE_COLOR {
    public static void main(String[] args){
        String answer = seeColor("redxx");
        System.out.println(answer);
    }
public static String seeColor(String str) {
  int len = str.length();
  if(len >=3 && str.substring(0,3).equals("red")){
    return ("red");
  }if(len >=4 && str.substring(0,4).equals("blue")){
    return ("blue");
  }else{
    return("");
  }
}
}
