/*
Return true if the given non-negative number is 1 or 2 more than a multiple of 20. See also: Introduction to Mod


more20(20) → false
more20(21) → true
more20(22) → true
 */
package school;


public class MORE20 {
    public static void main(String[] args){
        boolean answer = more20(20);
        System.out.println(answer);
    }
public static boolean more20(int n) {
  if(n%20==1 || n%20==2){
    return true;
  }return false;
}

}
