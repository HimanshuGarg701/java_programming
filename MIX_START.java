/*
Return true if the given string begins with "mix", except the 'm' can be anything, so "pix", "9ix" .. all count.


mixStart("mix snacks") → true
mixStart("pix snacks") → true
mixStart("piz snacks") → false
 */
package school;


public class MIX_START {
    public static void main(String[] args){
        boolean answer = mixStart("piz snacks");
        System.out.println(answer);
    }
public static boolean mixStart(String str) {
  if((str.length() >=3) && (str.substring(1,3).equals("ix"))){
    return (true);
  }else{
    return false;
  }
}
    
}
