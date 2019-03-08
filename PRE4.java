/*
Given a non-empty array of ints,
return a new array containing the elements from the original array that come before the first 4 in the original array.
The original array will contain at least one 4. Note that it is valid in java to create an array of length 0.


pre4([1, 2, 4, 1]) → [1, 2]
pre4([3, 1, 4]) → [3, 1]
pre4([1, 4, 4]) → [1]
 */
package school;
import java.util.Arrays;

public class PRE4 {
    public static void main(String[] args){
        int[] values = {1,2,4,1};
        int[] answer = pre4(values);
        System.out.println(Arrays.toString(answer));
    }
public static int[] pre4(int[] nums) {
  int i = 0;
  while(nums[i]!=4){
    i++;
  }
  int[] answer = new int[i];
  for(int j=0; j<i; j++){
    answer[j] = nums[j];
  }return answer;
}

}
