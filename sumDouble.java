/*

Given two int values, return their sum. Unless the two values are the same, then return double their sum.


sumDouble(1, 2) → 3
sumDouble(3, 2) → 5
sumDouble(2, 2) → 8
 */
package CodingBat;


public class sumDouble {
    public static void main(String[] args){
    int result = sumDOUBLE(2,2);
    System.out.println(result);
    }
public static int sumDOUBLE(int a, int b) {
  if(a!=b){
    
    return a+b;
  }else{
    
    return 2*(a+b);
  }
}
  
}
