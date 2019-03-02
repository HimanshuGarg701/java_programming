/*
Given 2 strings, a and b, return a string of the form short+long+short,
with the shorter string on the outside and the longer string on the inside.
The strings will not be the same length, but they may be empty (length 0).


comboString("Hello", "hi") → "hiHellohi"
comboString("hi", "Hello") → "hiHellohi"
comboString("aaa", "b") → "baaab"
 */
package school;


public class COMBO_STRING {
    public static void main(String[] args){
        String answer = comboString("Hello", "hi");
        System.out.println(answer);
    }
public static String comboString(String a, String b) {
  int len1 = a.length();
  int len2 = b.length();
  if(len1>len2){
    return (b+a+b);
  }else{
    return (a+b+a);
  }
}
}
