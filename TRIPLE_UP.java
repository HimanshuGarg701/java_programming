/*
Return true if the array contains, somewhere, three increasing adjacent numbers like .... 4, 5, 6, ... or 23, 24, 25.


tripleUp([1, 4, 5, 6, 2]) → true
tripleUp([1, 2, 3]) → true
tripleUp([1, 2, 4]) → false
 */
package school;


public class TRIPLE_UP {
    public static void main(String[] args){
        int[] values = {1,4,5,6,2};
        boolean answer = tripleUp(values);
        System.out.println(answer);
    }
public static boolean tripleUp(int[] nums) {
  if(nums.length>=3){
    for(int i = 0; i<nums.length-2; i++){
      if(Math.abs(nums[i]-nums[i+1])==1 && nums[i+1]>nums[i]){
        if(Math.abs(nums[i+1]-nums[i+2])==1 && nums[i+2]>nums[i+1]){
          return true;
        }
      }
    } 
  }return false;
}

}
