/*
Given a string, return a version where all the "x" have been removed.
Except an "x" at the very start or end should not be removed.


stringX("xxHxix") → "xHix"
stringX("abxxxcd") → "abcd"
stringX("xabxxxcdx") → "xabcdx"
 */
package school;


public class STRING_X {
 public static void main(String[] args){
     String answer = stringX("xxHxix");
     System.out.println(answer);
  } 
public static String stringX(String str) {
  String answer="";
  int length = str.length();
  for(int i=0; i<=length-1; i++){
    if(str.substring(i,i+1).equals("x")){
      if(i==0 || i==length-1){
        answer = answer + "x";
      }
      continue;
    }else{
      answer = answer + str.substring(i,i+1);
    }
  }return answer;
}
}
