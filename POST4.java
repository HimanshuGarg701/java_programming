/*
Given a non-empty array of ints,
return a new array containing the elements from the original array that come after the last 4 in the original array.
The original array will contain at least one 4. Note that it is valid in java to create an array of length 0.


post4([2, 4, 1, 2]) → [1, 2]
post4([4, 1, 4, 2]) → [2]
post4([4, 4, 1, 2, 3]) → [1, 2, 3]
 */
package school;
import java.util.Arrays;

public class POST4 {
    public static void main(String[] args){
        int[] values = {2,4,1,2};
        int[] answer = post4(values);
        System.out.println(Arrays.toString(answer));
    }
public static int[] post4(int[] nums) {
  
  int len = nums.length;
  int i = len-1;
  while(nums[i]!=4){
    i--;
  }
  int n = len-i-1;
  int[] answer = new int[n];
  for(int j=0; j<n; j++){
    answer[j] = nums[i+j+1];
  }return answer;
}

}
