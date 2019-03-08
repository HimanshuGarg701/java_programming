/*
Given an array of ints, return true if the number of 1's is greater than the number of 4's


more14([1, 4, 1]) → true
more14([1, 4, 1, 4]) → false
more14([1, 1]) → true
 */
package school;


public class MORE14 {
    public static void main(String[] args){
        int[] value = {1,4,1};
        boolean answer = more14(value);
        System.out.println(answer);
    }
public static boolean more14(int[] nums) {
  int i = 0;
  int j = 0;
  for(int k : nums){
    if(k==1){
      i++;
    }else if(k==4){
      j++;
    }
  }if(i>j){
    return true;
  }return false;
}

}
