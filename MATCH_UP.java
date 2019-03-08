/*
Given arrays nums1 and nums2 of the same length, for every element in nums1,
consider the corresponding element in nums2 (at the same index).
Return the count of the number of times that the two elements differ by 2 or less, but are not equal.


matchUp([1, 2, 3], [2, 3, 10]) → 2
matchUp([1, 2, 3], [2, 3, 5]) → 3
matchUp([1, 2, 3], [2, 3, 3]) → 2
 */
package school;


public class MATCH_UP {
    public static void main(String[] args){
        int[] one = {1,2,3};
        int[] two = {2,3,10};
        int answer = matchUp(one, two);
        System.out.println(answer);
    }
public static int matchUp(int[] nums1, int[] nums2) {
  int j = 0;
  for(int i=0; i<nums1.length; i++){
    if(Math.abs(nums1[i]-nums2[i])<=2 && nums1[i] != nums2[i]){
      j++;
    }
  }return j;
}

}
