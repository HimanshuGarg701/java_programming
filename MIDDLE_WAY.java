/*
Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.


middleWay([1, 2, 3], [4, 5, 6]) → [2, 5]
middleWay([7, 7, 7], [3, 8, 0]) → [7, 8]
middleWay([5, 2, 9], [1, 4, 5]) → [2, 4].
 */
package school;

import java.util.Arrays;

public class MIDDLE_WAY {
    public static void main(String[] args){
        int[] nums1 = {1,2,3};
        int[] nums2 = {4,5,6};
        int[] answer = middleWay(nums1, nums2);
        System.out.println(Arrays.toString(answer));
    }
public static int[] middleWay(int[] a, int[] b) {
  
  int first = a[1];
  int second = b[1];
  int[] answer  = {first, second};
  return answer;
}

}
