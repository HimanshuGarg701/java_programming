/*
Given an array of ints, return true if it contains no 1's or it contains no 4's.


no14([1, 2, 3]) → true
no14([1, 2, 3, 4]) → false
no14([2, 3, 4]) → true
 */
package school;


public class NO14 {
    public static void main(String[] args){
        int[] value = {1,2,3};
        boolean answer = no14(value);
        System.out.println(answer);
    }
public static boolean no14(int[] nums) {
  int j = 0;
  int k = 0;
  for(int i : nums){
    if(i==1){
      j++;
    }
    else if (i==4){
      k++;
    }
  }if(j>0 && k>0){
    return false; 
  }return true;
}

}
