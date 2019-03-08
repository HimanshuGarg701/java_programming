/*
Given an array of ints, return true if every element is a 1 or a 4.


only14([1, 4, 1, 4]) → true
only14([1, 4, 2, 4]) → false
only14([1, 1]) → true
 */
package school;


public class ONLY14 {
    public static void main(String[] args){
        int[] values = {1,4,1,4};
        boolean answer = only14(values);
        System.out.println(answer);
    }
public static boolean only14(int[] nums) {
  for(int i : nums){
    if(i==4 || i==1){
      continue;
    }else{
      return false;
    }
  }return true;
}

}
