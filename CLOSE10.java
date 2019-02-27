/*
Given 2 int values, return whichever value is nearest to the value 10,
or return 0 in the event of a tie. Note that Math.abs(n) returns the absolute value of a number.


close10(8, 13) → 8
close10(13, 8) → 8
close10(13, 7) → 0
 */
package school;


public class CLOSE10 {
    public static void main(String[] args){
        int answer = close10(8, 13);
        System.out.println(answer);
    }
public static int close10(int a, int b) {
  int x = Math.abs(10 - a);
  int y = Math.abs(10 - b);
  if(x>y){
    return b;
  }else if(x == y){
    return 0;
  }else{
    return a;
  }
}
}
