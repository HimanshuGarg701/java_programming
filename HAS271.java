/*
Given an array of ints, return true if it contains a 2, 7, 1 pattern: a value,
followed by the value plus 5, followed by the value minus 1.
Additionally the 271 counts even if the "1" differs by 2 or less from the correct value.


has271([1, 2, 7, 1]) → true
has271([1, 2, 8, 1]) → false
has271([2, 7, 1]) → true
 */
package school;


public class HAS271 {
    public static void main(String[] args){
        int[] a = {1,2,7,1};
        boolean answer = has271(a);
        System.out.println(answer);
    }
public static boolean has271(int[] nums) {
  for(int i=0; i<nums.length-2; i++){
    int a = nums[i];
    if((nums[i+1]==a+5) && (Math.abs(nums[i+2]-(a-1))<=2)){
      return true;
    }
  }return false;
}
}
