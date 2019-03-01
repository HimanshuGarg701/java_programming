/*
Given a string, return true if the first instance of "x" in the string is immediately followed by another "x".


doubleX("axxbb") → true
doubleX("axaxax") → false
doubleX("xxxxx") → true
 */
package school;


public class DOUBLE_X {
    public static void main(String[] args){
    boolean answer = doubleX("axxbb");
    System.out.println(answer);
    }
public static boolean doubleX(String str){
  
  for(int i=0; i<str.length()-1; i++ ){
    if(str.charAt(i)=='x'){
        if(str.charAt(i+1)=='x'){
          return true;
        }else{
          return false;
        }
      
    }
    
  } return false;
  
}
   
}
