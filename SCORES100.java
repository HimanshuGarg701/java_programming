/*
Given an array of scores, return true if there are scores of 100 next to each other in the array.
The array length will be at least 2.


scores100([1, 100, 100]) → true
scores100([1, 100, 99, 100]) → false
scores100([100, 1, 100, 100]) → true
 */
package school;

public class SCORES100 {
    public static void main(String[] args){
        int[] nums = {1, 100, 100};
        boolean answer = scores100(nums);
        System.out.println(answer);
    }
public static boolean scores100(int[] scores) {
  int len = scores.length;
  if(len==2 && scores[0]==scores[1]){
    return true;
  }
  for(int i=1; i<len-1; i++){
    if(scores[i-1]==scores[i] && scores[i]==100){
      return true;
    }else if(scores[i+1]==scores[i] && scores[i]==100){
      return true;
    }
  }return false;
}

}
