/*
Given an array length 1 or more of ints, return the difference between the largest and smallest values in the array.
Note: the built-in Math.min(v1, v2) and Math.max(v1, v2) methods return the smaller or larger of two values.


bigDiff([10, 3, 5, 6]) → 7
bigDiff([7, 2, 10, 9]) → 8
bigDiff([2, 10, 7, 2]) → 8
 */
package school;


public class BIG_DIFF {
    public static void main(String[] args){
        int[] values = {10, 3, 5, 6};
        int answer = bigDiff(values);
        System.out.println(answer);
    }
public static int bigDiff(int[] nums) {
  int a = nums[0];
  int b= nums[0];
  for(int i : nums){
    a = Math.max(a, i);
    b = Math.min(b, i);
  }return (a-b);
  
}

}
