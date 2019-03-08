/*
Given an array of ints, return true if the array contains a 2 next to a 2 or a 4 next to a 4, but not both.


either24([1, 2, 2]) → true
either24([4, 4, 1]) → true
either24([4, 4, 1, 2, 2]) → false
 */
package school;


public class EITHER24 {
    public static void main(String[] args){
        int[] values = {1,2,2};
        boolean answer = either24(values);
        System.out.println(answer);
    }
public static boolean either24(int[] nums) {
  boolean a = false;
  boolean b = false;
  for(int i = 0; i<nums.length-1; i++){
    
    
    if(nums[i] == 2 && nums[i+1]==2){
      a =  true;
    }
    else if (nums[i] ==4 && nums[i+1] ==4){
      
      b = true;
      
    }
  }if(a==true && b==true){
    return false;
  }else if(a==true || b==true){
    return true;
  }return false;
}

}
