/*
Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element.
Both arrays will be length 1 or more.


commonEnd([1, 2, 3], [7, 3]) → true
commonEnd([1, 2, 3], [7, 3, 2]) → false
commonEnd([1, 2, 3], [1, 3]) → true
 */
package school;


public class COMMON_END {
    public static void main(String[] args){
    int[] nums1 = {1,2,3};
    int[] nums2 = {7,3};
    boolean answer = commonEnd(nums1, nums2);
    System.out.println(answer);
    }
public static boolean commonEnd(int[] a, int[] b) {
  int len1 = a.length;
  int len2 = b.length;
  if(a==b){return true;}
  else if(a[len1-1] == b[len2-1] || a[0]==b[0]){
      return true;
    
  }return false;
}

}
