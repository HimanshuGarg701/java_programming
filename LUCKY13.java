/*
Given an array of ints, return true if the array contains no 1's and no 3's.


lucky13([0, 2, 4]) → true
lucky13([1, 2, 3]) → false
lucky13([1, 2, 4]) → false
 */
package school;


public class LUCKY13 {
    public static void main(String[] args){
        int[] value = {0,2,4};
        boolean answer = lucky13(value);
        System.out.println(answer);
    }
public static boolean lucky13(int[] nums) {
  int i = 0;
  for(int j: nums){
    if (j==1 || j==3){
      return false;
    }
  }return true;
}

}
