/*
Given two strings, append them together (known as "concatenation") and return the result.
However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and "cat" yields "abcat".


conCat("abc", "cat") → "abcat"
conCat("dog", "cat") → "dogcat"
conCat("abc", "") → "abc"
 */
package home;


public class CONCAT {
    public static void main(String[] args){
        String answer = conCat("abc", "cat");
        System.out.println(answer);
    }
    
public static String conCat(String a, String b) {
  int len1 = a.length();
  int len2 = b.length();
  if(len1 == 0 && len2!=0){return(b);}
  if(len2 == 0 && len1 !=0){return (a);}
  String last_a = a.substring(len1-1, len1);
  String first_b = b.substring(0,1);
  
  if(last_a.equals(first_b)){
    return (a.substring(0,len1-1) + b.substring(0,len2));
  }else{
    return (a + b);
  }
}
}
