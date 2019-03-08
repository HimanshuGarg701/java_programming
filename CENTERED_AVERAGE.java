/*
Return the "centered" average of an array of ints, which we'll say is the mean average of the values,
except ignoring the largest and smallest values in the array. If there are multiple copies of the smallest value,
ignore just one copy, and likewise for the largest value. Use int division to produce the final average.
You may assume that the array is length 3 or more.


centeredAverage([1, 2, 3, 4, 100]) → 3
centeredAverage([1, 1, 5, 5, 10, 8, 7]) → 5
centeredAverage([-10, -4, -2, -4, -2, 0]) → -3
 */
package school;


public class CENTERED_AVERAGE {
    public static void main(String[] args){
        int[] value = {1,2,3,4,100};
        int answer = centeredAverage(value);
        System.out.println(answer);
    }
public static int centeredAverage(int[] nums) {
  int sum = 0;
  int max = nums[0];
  int min = nums[0];
  int count = nums.length - 2;
  for(int i: nums){
    sum = sum + i;
    max = Math.max(max, i);
    min = Math.min(min, i);
  }sum = sum - max - min;
  return (sum/count);
}

}
