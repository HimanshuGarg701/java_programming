/*
Start with 2 int arrays, a and b, of any length. Return how many of the arrays have 1 as their first element.


start1([1, 2, 3], [1, 3]) → 2
start1([7, 2, 3], [1]) → 1
start1([1, 2], []) → 1
 */
package school;

import java.util.Arrays;
public class START1 {
    public static void main(String[] args){
    int[] nums = {1,2,3};
    int[] nums1 = {1,3}; 
    int answer = start1(nums, nums1);
    System.out.println(answer);
    }
public static int start1(int[] a, int[] b) {
  int i =0;
  if(a.length>0 && a[0]==1){
    i++;
  }if(b.length>0 && b[0]==1){
    i++;
  }return i;
}

}
