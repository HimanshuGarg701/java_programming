/*
Given a string of any length, return a new string where the last 2 chars,
if present, are swapped, so "coding" yields "codign".


lastTwo("coding") → "codign"
lastTwo("cat") → "cta"
lastTwo("ab") → "ba"
 */
package home;


public class LAST_TWO {
    public static void main(String[] args){
        String answer = lastTwo("coding");
        System.out.println(answer);
    }
    public static String lastTwo(String str) {
    int len = str.length();
        if (str.length()<2){
            return str;
        }else{
            String a = str.substring(len-1,len);
            String b = str.substring(len-2, len-1);
            return (str.substring(0, len-2) + a + b);
  }
}

}
