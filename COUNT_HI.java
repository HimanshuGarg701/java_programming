/*
Return the number of times that the string "hi" appears anywhere in the given string.


countHi("abc hi ho") → 1
countHi("ABChi hi") → 2
countHi("hihi") → 2
 */
package school;


public class COUNT_HI {
    public static void main(String[] args){
        int answer = countHi("abc hi ho");
        System.out.println(answer);
    }
public static int countHi(String str) {
  int count=0;
  for(int i=0; i<str.length()-1; i++){
    if(str.substring(i, i+2).equals("hi")){
      count++;
    }
  }return count;
}

}
