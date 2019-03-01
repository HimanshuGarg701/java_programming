/*
Given a string and a non-negative int n,
we'll say that the front of the string is the first 3 chars,
or whatever is there if the string is less than length 3. Return n copies of the front;


frontTimes("Chocolate", 2) → "ChoCho"
frontTimes("Chocolate", 3) → "ChoChoCho"
frontTimes("Abc", 3) → "AbcAbcAbc
 */
package school;

public class FRONT_TIMES {
    public static void main(String [] args){
    String answer = frontTimes("Chocolate", 2);
    System.out.println(answer);
    }
    public static String frontTimes(String str, int n) {
        int i = 0;
        String answer = "";
        if(str.length()<=3){
            while(i<n){
                answer = answer + str;
                i++;
            }
    
        }else{
            while(i<n){
                String result = str.substring(0,3);
                answer = answer + result;
                i++;
            }
        }
    return answer;
    }
}
