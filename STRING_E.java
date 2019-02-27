/*
Return true if the given string contains between 1 and 3 'e' chars.


stringE("Hello") → true
stringE("Heelle") → true
stringE("Heelele") → false
 */
package school;


public class STRING_E {
    public static void main(String[] args){
        boolean answer = stringE("Heelele");
        System.out.println(answer);
    }
public static boolean stringE(String str) {
  int j=0;
  for(int i=0; i<str.length(); i++){
    if(str.charAt(i)=='e'){
      j = j+1;
    }else{
      continue;
    }
  }
    if(j>=1 && j<=3){
      return true;
    }else{
      return false;
    }
  }

}
