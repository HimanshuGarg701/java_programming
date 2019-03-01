/*
Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens" yields "kien".


altPairs("kitten") → "kien"
altPairs("Chocolate") → "Chole"
altPairs("CodingHorror") → "Congrr"
 */
package school;


public class ALT_PAIRS {
    public static void main(String[] args){
        String answer = altPairs("Kitten");
        System.out.println(answer);
    }
public static String altPairs(String str) {
  String answer="";
  if(str.length()>1){
  for(int i=0; i<str.length(); i=i+4){
    int ending = i+2;
    if (i+2>str.length()){
      ending = str.length();
    }
    answer = answer + str.substring(i,ending);
  }return answer;
  }else{
    return str;
  }
}
}
