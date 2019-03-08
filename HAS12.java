/*
Given an array of ints, return true if there is a 1 in the array with a 2 somewhere later in the array.


has12([1, 3, 2]) → true
has12([3, 1, 2]) → true
has12([3, 1, 4, 5, 2]) → true
 */
package school;


public class HAS12 {
    public static void main(String[] args){
        int[] values = {1,3,2};
        boolean answer = has12(values);
        System.out.println(answer);
    }
public static boolean has12(int[] nums) {
  boolean a = false;
  for (int i : nums){
    if(i==1){
      a = true;
    }else if(i==2 && a==true){
      return true;
    }
  }return false;
}

}
