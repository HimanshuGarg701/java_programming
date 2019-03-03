/*

Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.


plusTwo([1, 2], [3, 4]) → [1, 2, 3, 4]
plusTwo([4, 4], [2, 2]) → [4, 4, 2, 2]
plusTwo([9, 2], [3, 4]) → [9, 2, 3, 4]
 */
package school;

import java.util.Arrays;
public class PLUS_TWO {
    public static void main(String[] args){
        int[] nums1 = {1,2};
        int[] nums2 = {3,4};
        int[] answer = plusTwo(nums1, nums2);
        System.out.println(Arrays.toString(answer));
    }
    
public static int[] plusTwo(int[] a, int[] b) {
  int[] answer = new int[4];
  answer[0] = a[0];
  answer[1] = a[1];
  answer[2] = b[0];
  answer[3] = b[1];
  return answer;
}

}
