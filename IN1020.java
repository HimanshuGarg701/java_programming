/*
Given 2 int values, return true if either of them is in the range 10..20 inclusive.


in1020(12, 99) → true
in1020(21, 12) → true
in1020(8, 99) → false
 */
package school;


public class IN1020 {
    public static void main(String[] args){
    boolean answer = in1020(12, 99);
    System.out.println(answer);
    }
public static boolean in1020(int a, int b) {
  if((a<=20&&a>=10) || (b<=20 && b>=10)){
    return true;
  }else{
    return false;
  }
}

}
