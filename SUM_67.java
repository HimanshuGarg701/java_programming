/*
Return the sum of the numbers in the array,
except ignore sections of numbers starting with a 6 and extending to the next 7 (every 6 will be followed by at least one 7).
Return 0 for no numbers.


sum67([1, 2, 2]) → 5
sum67([1, 2, 2, 6, 99, 99, 7]) → 5
sum67([1, 1, 6, 7, 2]) → 4
 */
package school;


public class SUM_67 {
    public static void main(String[] args){
        int[] values = {1,2,2};
        int answer = sum67(values);
        System.out.println(answer);
    }
public static int sum67(int[] nums) {
  int sum = 0;
  boolean stop = true;
  for(int i=0; i<nums.length; i++){
    if(nums[i] == 6){
      stop = false;
    }else if(stop==true){
      sum = sum + nums[i];
    }else if(stop==false && nums[i]==7){
      stop = true;
    }
  }return sum;
}

}
