/*
Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.


sameFirstLast([1, 2, 3]) → false
sameFirstLast([1, 2, 3, 1]) → true
sameFirstLast([1, 2, 1]) → true
 */
package school;


public class SAME_FIRSTLAST {
    public static void main(String[] args){
        int[] nums = {1,2,3};
        boolean answer = sameFirstLast(nums);
        System.out.println(answer);
    
    }
public static boolean sameFirstLast(int[] nums) {
  int len = nums.length;
  if(len>=1){
    if(nums[0] == nums[len-1]){
      return true;
    }
  }return false;
}

}
