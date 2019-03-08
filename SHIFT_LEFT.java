/*

Return an array that is "left shifted" by one -- so {6, 2, 5, 3} returns {2, 5, 3, 6}.
You may modify and return the given array, or return a new array.


shiftLeft([6, 2, 5, 3]) → [2, 5, 3, 6]
shiftLeft([1, 2]) → [2, 1]
shiftLeft([1]) → [1]
 */
package school;
import java.util.Arrays;

public class SHIFT_LEFT {
    public static void main(String[] args){
        int[] values = {6,2,5,3};
        int[] answer = shiftLeft(values);
        System.out.println(Arrays.toString(answer));
    }
public static int[] shiftLeft(int[] nums) {
  int len = nums.length;
  int[] answer = new int[len];
  if(len>0){
  answer[len-1] = nums[0];
  for(int i=0; i<len-1; i++){
    answer[i] = nums[i+1];
  }
  }return answer;
}

}
