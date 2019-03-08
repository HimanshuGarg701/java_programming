/*
Return the sum of the numbers in the array, returning 0 for an empty array.
Except the number 13 is very unlucky, so it does not count and numbers that come immediately after a 13 also do not count.


sum13([1, 2, 2, 1]) → 6
sum13([1, 1]) → 2
sum13([1, 2, 2, 1, 13]) → 6
 */
package school;


public class SUM_13 {
    public static void main(String[] args){
        int[] values = {1,2,2,1};
        int answer = sum13(values);
        System.out.println(answer);
    }
public static int sum13(int[] nums) {
  int len = nums.length;
  int sum = 0;
  for(int i=0; i<len; i++){
    if(nums[i]==13){
      i = i+1;
    }else{
      sum = sum + nums[i];
    }
  }return sum;
}

}
