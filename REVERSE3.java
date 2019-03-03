/*
Given an array of ints length 3, return a new array with the elements in reverse order, so {1, 2, 3} becomes {3, 2, 1}.


reverse3([1, 2, 3]) → [3, 2, 1]
reverse3([5, 11, 9]) → [9, 11, 5]
reverse3([7, 0, 0]) → [0, 0, 7]
 */
package school;
import java.util.Arrays;

public class REVERSE3 {
    public static void main(String[] args){
        int[] nums = {1,2,3};
        int[] answer = reverse3(nums);
        System.out.println(Arrays.toString(answer));
    }
public static int[] reverse3(int[] nums) {
  int[] answer;
  answer = new int[3];
  answer[0] = nums[2];
  answer[1] = nums[1];
  answer[2] = nums[0];
  return answer;
}

}
