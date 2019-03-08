/*
Given a string, return a string where for every char in the original, there are two chars.


doubleChar("The") → "TThhee"
doubleChar("AAbb") → "AAAAbbbb"
doubleChar("Hi-There") → "HHii--TThheerree"
 */
package school;


public class DOUBLE_CHAR {
    public static void main(String[] args){
        String answer = doubleChar("The");
        System.out.println(answer);
    }
public static String doubleChar(String str) {
  String answer = "";
  for(int i =0; i<str.length(); i++){
    answer = answer + str.substring(i,i+1) + str.substring(i,i+1);
  }return answer;
}

}
