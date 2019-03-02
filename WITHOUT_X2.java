/*

Given a string, if one or both of the first 2 chars is 'x',
return the string without those 'x' chars, and otherwise return the string unchanged.


withoutX2("xHi") → "Hi"
withoutX2("Hxi") → "Hi"
withoutX2("Hi") → "Hi"
 */
package school;


public class WITHOUT_X2 {
    public static void main(String[] args){
        String answer = withoutX2("xHi");
        System.out.println(answer);
    }
    public static String withoutX2(String str) {
        int length = str.length();
        if(length>=2){
            if(str.substring(0,2).equals("xx")){ return (str.substring(2,length));}
            else if(str.substring(0,1).equals("x")){ return (str.substring(1,length));}
            else if(str.substring(1,2).equals("x")){ return(str.substring(0,1) + str.substring(2,length));}
  
         }else{
               if(length == 1 && str.substring(0,1).equals("x")){return ("");}
               else{return (str);}
        }return str;
}

 
    }

