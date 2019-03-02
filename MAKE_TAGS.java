/*
The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text.
In this example, the "i" tag makes <i> and </i> which surround the word "Yay". Given tag and word strings,
create the HTML string with tags around the word, e.g. "<i>Yay</i>".


makeTags("i", "Yay") → "<i>Yay</i>"
makeTags("i", "Hello") → "<i>Hello</i>"
makeTags("cite", "Yay") → "<cite>Yay</cite>"
 */
package school;


public class MAKE_TAGS {
    public static void main(String[] args){
        String answer = makeTags("i", "yay");
        System.out.println(answer);
    }
public static String makeTags(String tag, String word) {
  return ("<" + tag + ">" + word +"</" + tag + ">");
}

}
