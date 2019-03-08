/*
Given start and end numbers, return a new array containing the sequence of integers from start up to but not including end,
so start=5 and end=10 yields {5, 6, 7, 8, 9}. The end number will be greater or equal to the start number.



fizzArray3(5, 10) → [5, 6, 7, 8, 9]
fizzArray3(11, 18) → [11, 12, 13, 14, 15, 16, 17]
fizzArray3(1, 3) → [1, 2]
 */
package school;

import java.util.Arrays;

public class FIZZ_ARRAY3 {
    public static void main(String[] args){
        int[] answer = fizzArray3(5,10);
        System.out.println(Arrays.toString(answer));
    }
public static int[] fizzArray3(int start, int end) {
  int len = end-start;
  int[] answer = new int[len];
  for(int i=0; i<len; i++){
    answer[i] = start + i;
  }return answer;
}

}
