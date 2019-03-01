/*
Given a string, return a new string made of every other char starting with the first, so "Hello" yields "Hlo".


stringBits("Hello") → "Hlo"
stringBits("Hi") → "H"
stringBits("Heeololeo") → "Hello"
 */
package school;


public class STRING_BITS {
    public static void main(String[] args){
    String answer = stringBits("Hello");
    System.out.println(answer);
    }
public static String stringBits(String str) {
  String answer = "";
    for(int i=0; i<str.length();i=i+2){
      answer = answer + str.substring(i, i+1);
    }
  return answer;
}

}
