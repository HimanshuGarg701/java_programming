/*

Given a string str, if the string starts with "f" return "Fizz".
If the string ends with "b" return "Buzz". If both the "f" and "b" conditions are true,
return "FizzBuzz". In all other cases, return the string unchanged. (See also: FizzBuzz Code)


fizzString("fig") → "Fizz"
fizzString("dib") → "Buzz"
fizzString("fib") → "FizzBuzz"
 */
package school;


public class FIZZ_STRING {
    public static void main(String[] args){
        String answer = fizzString("fig");
        System.out.println(answer);
    }
public static String fizzString(String str) {
  char start = str.charAt(0);
  char end = str.charAt(str.length()-1);
  if(start =='f' && end=='b'){return ("FizzBuzz");}
  else if(start=='f'){return ("Fizz");}
  else if(end=='b'){return ("Buzz");}
  
  return str;
}

}
