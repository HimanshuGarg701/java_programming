/*
 Given a string, if a length 2 substring appears at both its beginning and end,
return a string without the substring at the beginning, so "HelloHe" yields "lloHe".
The substring may overlap with itself, so "Hi" yields "". Otherwise, return the original string unchanged.


without2("HelloHe") → "lloHe"
without2("HelloHi") → "HelloHi"
without2("Hi") → ""
 */
package school;


public class WITHOUT2 {
    public static void main(String[] args){
        String answer = without2("HelloHe");
        System.out.println(answer);
    }
public static String without2(String str) {
  if(str.length()<2){
    return str;
  }else{
    int len = str.length();
      if(str.substring(0,2).equals(str.substring((len-2), len))){
        return(str.substring(2,len));
      }else{
        return (str);
      }
}
}

}
