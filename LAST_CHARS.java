/*
Given 2 strings, a and b, return a new string made of the first char of a and the last char of b,
so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.


lastChars("last", "chars") → "ls"
lastChars("yo", "java") → "ya"
lastChars("hi", "") → "h@"
 */
package school;


public class LAST_CHARS {
    public static void main(String[] args){
        String answer = lastChars("last", "chars");
        System.out.println(answer);
    }
    public static String lastChars(String a, String b) {
      int len1 = a.length();
      int len2 = b.length();
      if(len1 == 0 && len2!= 0){ return ("@" + b.substring(len2-1, len2));}
      if(len1 !=0 && len2 ==0){ return (a.substring(0,1) + "@");}
      if (len1==0 && len2==0){return "@@";}
      else {
        return (a.substring(0,1) + b.substring(len2-1,len2));
      }
    }
    }
