/*
Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx" contains 2 "xx".


countXX("abcxx") → 1
countXX("xxx") → 2
countXX("xxxx") → 3
 */
package school;


public class COUNT_XX {
    public static void main(String[] args){
        int answer = countXX("xxxx");
        System.out.println(answer);
    }
    public static int countXX(String str) {
    int i=0;
    int j=0;
    while(i<str.length()-1){
        if(str.substring(i,i+2).equals("xx")){
            j++;
    }i++;
    }return j;
    }    
}
