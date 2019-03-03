/*
Given 2 int arrays, a and b, of any length, return a new array with the first element of each array.
If either array is length 0, ignore that array.


front11([1, 2, 3], [7, 9, 8]) → [1, 7]
front11([1], [2]) → [1, 2]
front11([1, 7], []) → [1]
 */
package school;

import java.util.Arrays;

public class FRONT11 {
    public static void main(String[] args){
        int[] nums = {1,2,3};
        int[] nums1 = {7,9,8};
        int[] answer = front11(nums, nums1);
        System.out.println(Arrays.toString(answer));
    }
public static int[] front11(int[] a, int[] b) {
  int[] answer = new int[2];
  int [] answer1 = new int[1];
  int[] answer2 =new int[0];
  int len1 = a.length;
  int len2 = b.length;
  if(len1>=1 && len2>=1){
      answer[0] = a[0];
      answer[1] = b[0];
      return answer;
  }else if(len1>1 && len2<1){
    answer1[0] = a[0];
    return answer1;
  }else if(len1<1 && len2>1){
    answer1[0] = b[0];
    return answer1;
  }return answer2;
}

}
