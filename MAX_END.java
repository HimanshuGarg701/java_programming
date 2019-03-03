/*
Given an array of ints length 3, figure out which is larger, the first or last element in the array,
and set all the other elements to be that value. Return the changed array.


maxEnd3([1, 2, 3]) → [3, 3, 3]
maxEnd3([11, 5, 9]) → [11, 11, 11]
maxEnd3([2, 11, 3]) → [3, 3, 3]
 */
package school;
import java.util.Arrays;

public class MAX_END {
    public static void main(String [] args){
        int[] nums = {1,2,3};
        int[] answer = maxEnd3(nums);
        System.out.println(Arrays.toString(answer));
    
    }
public static int[] maxEnd3(int[] nums) {
  int[] answer = new int[3];
  int num1 = nums[0];
  int num2 = nums[2];
  if(num1>num2){
    nums[2] = nums[0];
    nums[1] = nums[0];
    return nums;
  }else if(num2>num1){
    nums[0] = nums[2];
    nums[1] = nums[2];
    return nums;
  }else{
    nums[1] = nums[0];
    return nums;
  }
}

}
