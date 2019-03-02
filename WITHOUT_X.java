/*
Given a string, if the first or last chars are 'x', return the string without those 'x' chars,
and otherwise return the string unchanged.


withoutX("xHix") → "Hi"
withoutX("xHi") → "Hi"
withoutX("Hxix") → "Hxi"
 */
package school;


public class WITHOUT_X {
    public static void main(String[] args){
        String answer = withoutX("xHix");
        System.out.println(answer);
    }
public static String withoutX(String str) {
  int length = str.length();
  if(length>2){
  if(str.substring(0,1).equals("x") && str.substring(length-1,length).equals("x")){
    return(str.substring(1,length-1));
  }
  else if(str.substring(0,1).equals("x")){
    return (str.substring(1,length));
  }else if(str.substring(length-1,length).equals("x")){
    return (str.substring(0,length-1));
  }
  }else if(length<=2){
    if(length ==2 && str.substring(0,2).equals("xx")){
      return ("");
    }else if(length == 1 && str.substring(0,1).equals("x")){
      return ("");
    }
    else{
      return str;
    }
  }return str;
}
}
