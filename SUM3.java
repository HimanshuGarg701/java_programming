/*
Given an array of ints length 3, return the sum of all the elements.


sum3([1, 2, 3]) → 6
sum3([5, 11, 2]) → 18
sum3([7, 0, 0]) → 7
 */
package school;


public class SUM3 {
    public static void main(String[] args){
        int[] nums = {1,2,3};
        int answer = sum3(nums);
        System.out.println(answer);
    }
    
public static int sum3(int[] nums) {
  int sum = 0;
  for (int i=0; i<nums.length; i++){
    sum = sum + nums[i];
  }return sum;
}

}
