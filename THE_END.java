/*
 Given a string, return a string length 1 from its front, unless front is false,
in which case return a string length 1 from its back. The string will be non-empty.


theEnd("Hello", true) → "H"
theEnd("Hello", false) → "o"
theEnd("oh", true) → "o"
 */
package school;


public class THE_END {
    public static void main(String[] args){
        String answer = theEnd("Hello", true);
        System.out.println(answer);
    }
public static String theEnd(String str, boolean front) {
  if(front == true){
    return(str.substring(0,1));
  }else{
    return (str.substring(str.length()-1, str.length()));
  }
}

}
