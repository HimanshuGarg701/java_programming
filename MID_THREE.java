/*
Given an array of ints of odd length, return a new array length 3 containing the elements from the middle of the array.
The array length will be at least 3.


midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
midThree([1, 2, 3]) → [1, 2, 3]
 */
package school;

import java.util.Arrays;
public class MID_THREE {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5};
        int[] answer = midThree(nums);
        System.out.println(Arrays.toString(answer));
    }
    
public static int[] midThree(int[] nums) {
  int half = nums.length/2;
  int[] answer = new int[3];
  answer[0] = nums[half-1];
  answer[1] = nums[half];
  answer[2] = nums[half+1];
  return answer;
}

}
