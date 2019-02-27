/*
Given three int values, a b c, return the largest.


intMax(1, 2, 3) → 3
intMax(1, 3, 2) → 3
intMax(3, 2, 1) → 3
 */
package school;

public class INT_MAX {
    public static void main(String[] args){
        int answer = intMax(1,2,3);
        System.out.println(answer);
    }
public static int intMax(int a, int b, int c) {
  
  if(a>b && a> c){
    return a;
  }else if(b>a && b>c){
    return b;
  }else{
    return c;
  }
}
}
