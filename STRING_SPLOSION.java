/*
Given a non-empty string like "Code" return a string like "CCoCodCode".


stringSplosion("Code") → "CCoCodCode"
stringSplosion("abc") → "aababc"
stringSplosion("ab") → "aab"
 */
package school;


public class STRING_SPLOSION {
    public static void main(String [] args){
    String answer = stringSplosion("Code");
    System.out.println(answer);
    }
public static String stringSplosion(String str) {
  String answer = "";
  for(int i=0; i<str.length(); i++){
    answer = answer + str.substring(0,i+1);
  }return answer;
}

}
