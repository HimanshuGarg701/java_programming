/*

Given an array of ints, return a new array length 2 containing the first and last elements from the original array.
The original array will be length 1 or more.


makeEnds([1, 2, 3]) → [1, 3]
makeEnds([1, 2, 3, 4]) → [1, 4]
makeEnds([7, 4, 6, 2]) → [7, 2]
 */
package school;

import java.util.Arrays;


public class MAKE_ENDS {
    public static void main(String[] args){
        int[] nums = {1,2,3};
        int[] answer = makeEnds(nums);
        System.out.println(Arrays.toString(answer));
    }
    
public static int[] makeEnds(int[] nums) {
  int[] answer = {nums[0], nums[nums.length-1]};
  return answer;
}

}
