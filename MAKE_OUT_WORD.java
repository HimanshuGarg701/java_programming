/*
Given an "out" string length 4, such as "<<>>", and a word,
return a new string where the word is in the middle of the out string,
e.g. "<<word>>". Note: use str.substring(i, j) to extract the String starting at index i and going up to but not including index j.


makeOutWord("<<>>", "Yay") → "<<Yay>>"
makeOutWord("<<>>", "WooHoo") → "<<WooHoo>>"
makeOutWord("[[]]", "word") → "[[word]]"
 */
package school;


public class MAKE_OUT_WORD {
    public static void main(String[] args){
        String answer = makeOutWord("<<>>", "Yay");
        System.out.println(answer);
    }
public static String makeOutWord(String out, String word) {
  return (out.substring(0,2) + word + out.substring(2,4));
}

}
