/*
Return the number of even ints in the given array. Note: the % "mod" operator computes the remainder, e.g. 5 % 2 is 1.


countEvens([2, 1, 2, 3, 4]) → 3
countEvens([2, 2, 0]) → 3
countEvens([1, 3, 5]) → 0
 */
package school;


public class COUNT_EVENS {
    public static void main(String[] args){
        int[] answer = {2, 1, 2, 3, 4};
        int reply = countEvens(answer);
        System.out.println(reply);
    }
    
public static int countEvens(int[] nums) {
  int count = 0;
  for(int i:nums){
    if(i%2==0){
      count++;  
    }
  }return count;
}

}
