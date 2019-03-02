/*
Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".


helloName("Bob") → "Hello Bob!"
helloName("Alice") → "Hello Alice!"
helloName("X") → "Hello X!"
 */
package school;


public class HELLO_NAME {
    public static void main(String[] args){
        String answer = helloName("Bob");
        System.out.println(answer);
    }
public static String helloName(String name) {
  return ("Hello "+ name + "!");
}

}
