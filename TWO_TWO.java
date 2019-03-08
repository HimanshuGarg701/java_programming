/*
Given an array of ints, return true if every 2 that appears in the array is next to another 2.


twoTwo([4, 2, 2, 3]) → true
twoTwo([2, 2, 4]) → true
twoTwo([2, 2, 4, 2]) → false
 */
package school;


public class TWO_TWO {
    public static void main(String[] args){
        int[] values = {4,2,2,3};
        boolean answer = twoTwo(values);
        System.out.println(answer);
    }
public static boolean twoTwo(int[] nums) {
  boolean a = false;
  boolean b = true;
  int len = nums.length;
  if(len>=2){
  if(nums[len-1]==2 && nums[len-2]!=2){
    b = false;
  }
  for(int i =0; i<nums.length-1; i++){
    if(nums[i]==2 && nums[i+1]==2){
      a =  true;
      i++;
    }else if(nums[i]==2 && nums[i+1]!=2){
      b = false;
    }
  }if(a==true && b == true){
    return true;
  }else if(b==false){
    return false;
  }
  }if(len==1 && nums[0]==2){
    return false;
  }return true;
}

}
