/*
Given a number n, create and return a new int array of length n, containing the numbers 0, 1, 2, ... n-1.
The given n may be 0, in which case just return a length 0 array.
You do not need a separate if-statement for the length-0 case;
the for-loop should naturally execute 0 times in that case, so it just works.


fizzArray(4) → [0, 1, 2, 3]
fizzArray(1) → [0]
fizzArray(10) → [0, 1, 2, 3, 4, 5, 6, 7, 8, 9]
 */
package school;
import java.util.Arrays;

import java.util.Arrays;


public class FIZZ_ARRAY {
    public static void main(String[] args){
        int[] answer = fizzArray(4);
        System.out.println(Arrays.toString(answer));
        
    }
public static int[] fizzArray(int n) {
  int[] answer = new int[n];
  for(int i=0; i<n; i++){
    answer[i] = i;
  }return(answer);
}

}
