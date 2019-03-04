/*
Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive,
are forbidden, so in that case just return 20.


sortaSum(3, 4) → 7
sortaSum(9, 4) → 20
sortaSum(10, 11) → 21
 */
package school;


public class SORTA_SUM {
    public static void main(String[] args){
        int answer = sortaSum(3, 4);
        System.out.println(answer);
    }
public static int sortaSum(int a, int b) {
  if(a+b >=10 && a+b<=19){
    return 20;
  }return(a+b);
}

}
