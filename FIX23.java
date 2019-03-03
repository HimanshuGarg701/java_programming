/*

Given an int array length 3, if there is a 2 in the array immediately followed by a 3,
set the 3 element to 0. Return the changed array.


fix23([1, 2, 3]) → [1, 2, 0]
fix23([2, 3, 5]) → [2, 0, 5]
fix23([1, 2, 1]) → [1, 2, 1]
 */
package school;

import java.util.Arrays;
public class FIX23 {
    public static void main(String[] args){
    int[] nums = {1,2,3};
    int[] answer = fix23(nums);
    System.out.println(Arrays.toString(answer));
    }
    
public static int[] fix23(int[] nums) {
  for(int i =0; i<2; i++){
    if(nums[i]==2 && nums[i+1]==3){
      nums[i+1] = 0;
    }
  }return nums;
}

}
