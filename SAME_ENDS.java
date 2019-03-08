/*

Return true if the group of N numbers at the start and end of the array are the same.
For example, with {5, 6, 45, 99, 13, 5, 6}, the ends are the same for n=0 and n=2,
and false for n=1 and n=3. You may assume that n is in the range 0..nums.length inclusive.


sameEnds([5, 6, 45, 99, 13, 5, 6], 1) → false
sameEnds([5, 6, 45, 99, 13, 5, 6], 2) → true
sameEnds([5, 6, 45, 99, 13, 5, 6], 3) → false
 */
package school;


public class SAME_ENDS {
    public static void main(String[] args){
        int[] values = {5,6,45,99,13,5,6};
        boolean answer = sameEnds(values,1);
        System.out.println(answer);
    }
public static boolean sameEnds(int[] nums, int len) {
  String one = "";
  String two = "";
  
  for(int i=0; i<len ; i++){
    int a = len-i;
    one = one + String.valueOf(nums[i]);
    two = two + String.valueOf(nums[nums.length-a]);
  }if(one.equals(two)){
    return true;
  }return false;
}

    
}
