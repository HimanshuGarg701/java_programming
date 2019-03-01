/*
 Given a string, return the count of the number of times that a substring length 2
appears in the string and also as the last 2 chars of the string,
so "hixxxhi" yields 1 (we won't count the end substring).


last2("hixxhi") → 1
last2("xaxxaxaxx") → 1
last2("axxxaaxx") → 2
 */
package school;


public class LAST_2 {
    public static void main(String[] args){
    int answer = last2("hixxhi");
    System.out.println(answer);
    }
public static int last2(String str) {
  int i = 0;
  int k =0;
  int length = str.length();
  String answer;
  
  if(length<=2){
    return 0;
  }else{
  for(int j=0; j<length-2;j++){
    String ending = str.substring(length-2, length);
    answer = str.substring(j,j+2);
    if(answer.equals(ending)){
      k++;
    }
  }return k;
    
  } 
}

}
