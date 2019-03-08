/*
Given an array of ints, return true if the sum of all the 2's in the array is exactly 8.


sum28([2, 3, 2, 2, 4, 2]) → true
sum28([2, 3, 2, 2, 4, 2, 2]) → false
sum28([1, 2, 3, 4]) → false
 */
package school;


public class SUM28 {
    public static void main(String[] args){
        int[] value = {2,3,2,2,4,2};
        boolean answer = sum28(value);
        System.out.println(answer);
    }
public static boolean sum28(int[] nums) {
  int sum = 0;
  for(int i:nums){
    if(i==2){
      sum = sum + i;
    }
  }if(sum==8){
    return true;
  }return false;
}

}
