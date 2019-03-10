/*
Given an array of strings, return the count of the number of strings with the given length.


wordsCount(["a", "bb", "b", "ccc"], 1) → 2
wordsCount(["a", "bb", "b", "ccc"], 3) → 1
wordsCount(["a", "bb", "b", "ccc"], 4) → 0
 */
package school;


public class WORDS_COUNT {
    public static void main(String[] args){
        String[] vars = {"a","bb","b","ccc"};
        int answer = wordsCount(vars,1);
        System.out.println(answer);
    }
public static int wordsCount(String[] words, int len) {
  int j = 0;
  for(int i=0; i<words.length; i++){
    int len1 = words[i].length();
    if(len1==len){
      j++;
    }
  }return j;
}

}
