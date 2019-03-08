/*
Given an array of ints, return true if the value 3 appears in the array exactly 3 times, and no 3's are next to each other.


haveThree([3, 1, 3, 1, 3]) → true
haveThree([3, 1, 3, 3]) → false
haveThree([3, 4, 3, 3, 4]) → false
 */
package school;


public class HAVE_THREE {
    public static void main(String[] args){
        int[] values = {3,1,3,1,3};
        boolean answer = haveThree(values);
        System.out.println(answer);
    }
public static boolean haveThree(int[] nums) {
  int j = 0;
  int len = nums.length;
  if(len>0 && nums[len-1]==3){
    j++;
  }
  for(int i = 0; i<len-1; i++){
    if(nums[i]==3 && nums[i+1]==3){
      return false;
    }
    else if(nums[i]==3){
      j++;
    }
    
  }if(j==3){
    return true;
  }return false;
}

}
