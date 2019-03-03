/*
Given an array of ints of even length, return a new array length 2 containing the middle two elements from the original array.
The original array will be length 2 or more.


makeMiddle([1, 2, 3, 4]) → [2, 3]
makeMiddle([7, 1, 2, 3, 4, 9]) → [2, 3]
makeMiddle([1, 2]) → [1, 2]
 */
package school;

import java.util.Arrays;
public class MAKE_MIDDLE {
    public static void main(String[] args){
        int[] nums = {1,2,3,4};
        int[] answer = makeMiddle(nums);
        System.out.println(Arrays.toString(answer));
    }
public static int[] makeMiddle(int[] nums) {
  int[] answer = new int[2];
  int half = nums.length/2;
  answer[0] = nums[half-1];
  answer[1] = nums[half];
  return answer;
}

}
