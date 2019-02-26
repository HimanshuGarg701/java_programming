/*
Given an int n, return the absolute difference between n and 21,
except return double the absolute difference if n is over 21.


diff21(19) → 2
diff21(10) → 11
diff21(21) → 0
 */
package CodingBat;


public class DIFF21 {
    public static void main(String[] args){
    int result = diff21(10);
    System.out.println(result);
    }
 public static int diff21(int n) {
  if (n<=21){
    
    return (Math.abs(n-21));
    
  }else{
    
    return (2*(n-21));
  }
}

    
}
