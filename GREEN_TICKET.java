/*

You have a green lottery ticket, with ints a, b, and c on it.
If the numbers are all different from each other, the result is 0.
If all of the numbers are the same, the result is 20. If two of the numbers are the same, the result is 10.


greenTicket(1, 2, 3) → 0
greenTicket(2, 2, 2) → 20
greenTicket(1, 1, 2) → 10
 */
package school;


public class GREEN_TICKET {
    public static void main(String[] args){
        int answer = greenTicket(1,2,3);
        System.out.println(answer);
    }
public static int greenTicket(int a, int b, int c) {
  if((a!=b && b!=c) && a!=c){
    return 0;
  }else if(a==b && b==c){
    return 20;
  }return 10;
}

}
