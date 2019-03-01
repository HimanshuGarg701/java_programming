/*
Given an array of ints, return true if the sequence of numbers 1, 2, 3 appears in the array somewhere.


array123([1, 1, 2, 3, 1]) → true
array123([1, 1, 2, 4, 1]) → false
array123([1, 1, 2, 1, 2, 3]) → true
 */
package school;


public class ARRAY123 {
    public static void main(String[] args){
    int[] a = {1,1,2,3,1};
    boolean answer = array123(a);
    System.out.println(answer);
    }
public static boolean array123(int[] nums) {
  int j=0;
  while(j<nums.length-2){
    if(nums[j]==1 && nums[j+1]==2 && nums[j+2]==3){
      return true;
    }j++;
  }return false;
}
}
