/*
Given an int array of any length, return a new array of its first 2 elements.
If the array is smaller than length 2, use whatever elements are present.


frontPiece([1, 2, 3]) → [1, 2]
frontPiece([1, 2]) → [1, 2]
frontPiece([1]) → [1]
 */
package school;
import java.util.Arrays;

public class FRONT_PIECE {
    public static void main(String[] args){
        int[] nums = {1,2,3};
        int[] answer = frontPiece(nums);
        System.out.println(Arrays.toString(answer));
    }
public static int[] frontPiece(int[] nums) {
  int[] answer = new int[2];
  if(nums.length>=2){
    answer[0] = nums[0];
    answer[1] = nums[1];
    return answer;
  }return nums;
}

}
