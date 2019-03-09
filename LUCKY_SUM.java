/*
Given 3 int values, a b c, return their sum.
However, if one of the values is 13 then it does not count towards the sum and values to its right do not count.
So for example, if b is 13, then both b and c do not count.


luckySum(1, 2, 3) → 6
luckySum(1, 2, 13) → 3
luckySum(1, 13, 3) → 1
 */
package school;


public class LUCKY_SUM {
    public static void main(String[] args){
        int answer = luckySum(1,2,3);
        System.out.println(answer);
    }
public static int luckySum(int a, int b, int c) {
  if(a==13){
    return 0;
  }else if(b==13){
    return a;
  }else if(c==13){
    return a+b;
  }return a+b+c;
}

}
