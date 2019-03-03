/*
Given an array of ints of odd length, look at the first, last, and middle values in the array and return the largest.
The array length will be a least 1.


maxTriple([1, 2, 3]) → 3
maxTriple([1, 5, 3]) → 5
maxTriple([5, 2, 3]) → 5
 */
package school;

import java.util.Arrays;
public class MAX_TRIPLE {
    public static void main(String[] args){
        int[] nums = {1,2,3};
        int answer = maxTriple(nums);
        System.out.println(answer);
    }
public static int maxTriple(int[] nums) {
  int len = nums.length;
  int half = len/2;
  int a=0;
  
    
    if(nums[0]>nums[len-1] && nums[0]>nums[half]){
        return(nums[0]);
  } else if(nums[len-1]>nums[0] && nums[len-1]>nums[half]){
        return(nums[len-1]);
  }  else {
    return nums[half];
  }
}

}
