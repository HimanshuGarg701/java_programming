/*
Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.


rotateLeft3([1, 2, 3]) → [2, 3, 1]
rotateLeft3([5, 11, 9]) → [11, 9, 5]
rotateLeft3([7, 0, 0]) → [0, 0, 7]
 */
package school;

import java.util.Arrays;


public class ROTATE_LEFT3 {
    public static void main(String[] args){
        int[] nums1 = {1,2,3};
        int[] answer1;
        answer1 = rotateLeft3(nums1);
        System.out.println(Arrays.toString(answer1));
    }
    
public static int[] rotateLeft3(int[] nums) {
  int [] answer = {nums[1], nums[2], nums[0]};
  return answer;
}

}
