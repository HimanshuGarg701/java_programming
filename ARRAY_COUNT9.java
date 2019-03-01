/*
Given an array of ints, return the number of 9's in the array.


arrayCount9([1, 2, 9]) → 1
arrayCount9([1, 9, 9]) → 2
arrayCount9([1, 9, 9, 3, 9]) → 3
 */
package school;


public class ARRAY_COUNT9 {
    public static void main(String[] args){
    int[] b = {1,9,9};
    int answer = arrayCount9(b);
    System.out.println(answer);
    }
public static int arrayCount9(int[] nums) {
  int answer = 0;
  for(int i: nums){
    if(i ==9){
      answer++;
    }else{
      continue;
    }
  }return answer;
}

}
