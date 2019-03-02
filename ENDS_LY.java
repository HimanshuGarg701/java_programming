/*
Given a string, return true if it ends in "ly".


endsLy("oddly") → true
endsLy("y") → false
endsLy("oddy") → false
 */
package school;


public class ENDS_LY {
    public static void main(String[] args){
        boolean answer = endsLy("oddly");
        System.out.println(answer);
    }
public static boolean endsLy(String str) {
  int length = str.length();
  if(length<2){
    return false;
  }else{
    if(str.substring(length-2, length).equals("ly")){
      return true;
    }else{
      return false;
    }
  }
}
}
