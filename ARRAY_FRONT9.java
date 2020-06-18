/*
Given an array of ints, return true if one of the first 4 elements in the array is a 9.
The array length may be less than 4.


arrayFront9([1, 2, 9, 3, 4]) → true
arrayFront9([1, 2, 3, 4, 9]) → false
arrayFront9([1, 2, 3, 4, 5]) → false
 */
package school;


public class ARRAY_FRONT9 {
    public static void main(String[] args){
        int[] a = {1,2,9,3,4};
        boolean answer = arrayFront9(a);
        System.out.println(answer);
    }
    
    
public static boolean arrayFront9(int[] nums) {
  int length = nums.length;
  if(length>4){
    length =4;
  }
    for(int i=0; i<length; i++){
      if(nums[i]==9){
        return true;
      }
      }
    
  return false;
}
}
