/*
Given an array of scores, compute the int average of the first half and the second half,
and return whichever is larger. We'll say that the second half begins at index length/2.
The array length will be at least 2. To practice decomposition,
write a separate helper method int average(int[] scores, int start, int end)
{ which computes the average of the elements between indexes start..end. 
Call your helper method twice to implement scoresAverage(). 
Write your helper method after your scoresAverage() method in the JavaBat text area.
Normally you would compute averages with doubles, but here we use ints so the expected results are exact.


scoresAverage([2, 2, 4, 4]) → 4
scoresAverage([4, 4, 4, 2, 2, 2]) → 4
scoresAverage([3, 4, 5, 1, 2, 3]) → 4
 */
package school;


public class SCORES_AVERAGE {
    public static void main(String[] args){
        int[] nums = {2,2,4,4};
        int answer = scoresAverage(nums);
        System.out.println(answer);
    }
public static int scoresAverage(int[] scores) {
  int start1 = 0;
  int end1 = (scores.length/2);
  int sum1 = average(scores, start1, end1);
  int start2 = (scores.length/2);
  int end2 = scores.length;
  int sum2 = average(scores, start2, end2);
  if(sum1>=sum2){
    return sum1;
  }return sum2;
}
public static int average(int[] scores, int start, int end){
  int sum = 0;
  for(int i=start; i<end; i++){
    sum = sum + scores[i];
  }return (sum/(end-start));
}
}
