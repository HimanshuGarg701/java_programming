/*
Given three ints, a b c, return true if one of them is 10 or more less than one of the others.


lessBy10(1, 7, 11) → true
lessBy10(1, 7, 10) → false
lessBy10(11, 1, 7) → true
 */
package school;


public class LESS_BY10 {
    public static void main(String[] args){
        boolean answer = lessBy10(1, 7, 11);
        System.out.println(answer);
    }
public static boolean lessBy10(int a, int b, int c) {
  int diff1 = Math.abs(a-b);
  int diff2 = Math.abs(b-c);
  int diff3 = Math.abs(a-c);
  if(((diff1>=10) || (diff2>=10)) || (diff3>=10)){
    return true;
  }return false;
}

}
