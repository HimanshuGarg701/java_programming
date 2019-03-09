/*
We want to make a row of bricks that is goal inches long.
We have a number of small bricks (1 inch each) and big bricks (5 inches each).
Return true if it is possible to make the goal by choosing from the given bricks.
This is a little harder than it looks and can be done without any loops.


makeBricks(3, 1, 8) → true
makeBricks(3, 1, 9) → false
makeBricks(3, 2, 10) → true
 */
package school;


public class MAKE_BRICKS {
    public static void main(String[] args){
        boolean answer = makeBricks(3,1,8);
        System.out.println(answer);
    }
public static boolean makeBricks(int small, int big, int goal) {
  int answer = 0;
  if(goal>5*big){
    answer = goal-5*big;
  }else{
    answer = goal%5;
  }if(answer<=small){
    return true;
  }else{
    return false;
  }
}

}
