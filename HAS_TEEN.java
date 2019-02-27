/*
We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values, return true if 1 or more of them are teen.


hasTeen(13, 20, 10) → true
hasTeen(20, 19, 10) → true
hasTeen(20, 10, 13) → true
 */
package school;


public class HAS_TEEN {
    public static void main(String[] args){
    boolean answer = hasTeen(13, 20, 10);
    System.out.println(answer);
    }
public static boolean hasTeen(int a, int b, int c) {
  if((a>12 && a<20) ||(b>12 && b<20) ||(c>=13 && c<=19)){
    return true;
  }else{
    return false;
  }
}

}
