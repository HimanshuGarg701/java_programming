/*
Given an int array length 2, return true if it does not contain a 2 or 3.


no23([4, 5]) → true
no23([4, 2]) → false
no23([3, 5]) → false
 */
package school;


public class NO23 {
    public static void main(String[] args){
        int[] nums = {4,5};
        boolean ans = no23(nums);
        System.out.println(ans);
    }
public static boolean no23(int[] nums) {
  for(int i: nums){
    if(i==2 || i==3){return false;}
  }return true;
}

}
