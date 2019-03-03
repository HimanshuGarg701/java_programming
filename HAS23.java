/*
Given an int array length 2, return true if it contains a 2 or a 3.


has23([2, 5]) → true
has23([4, 3]) → true
has23([4, 5]) → false
 */
package school;

public class HAS23 {
    public static void main(String[] args){
        int[] nums = {2,5};
        boolean answer = has23(nums);
        System.out.println(answer);
    }
public static boolean has23(int[] nums) {
  for(int i: nums){
    if(i==2 || i==3){ return (true);}
  }return false;
}

}
