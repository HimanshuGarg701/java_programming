/*
Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2.


double23([2, 2]) → true
double23([3, 3]) → true
double23([2, 3]) → false
 */
package school;


public class DOUBLE23 {
    public static void main(String[] args){
        int[] nums = {2,2};
        boolean ans = double23(nums);
        System.out.println(ans);
    }
    
public static boolean double23(int[] nums) {
  if(nums.length==2){
    
      if(nums[0]==2 && nums[1]==2){return true;}
      else if(nums[0]==3 && nums[1]==3){return true;}
    
  }return false;
}

}
