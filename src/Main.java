import java.util.Arrays;
import java.util.Collections;
public class Main {

    public static void LetterCounter(String someString){
        int finder = someString.length() - 1;
        int counter = 0;
        for (int i=0; i<someString.length();i++) {
            if (someString.charAt(i)==someString.charAt(finder)){
                counter++;
            }
        }
        System.out.println(counter);
    }
    public static void main(String[] args)
    {
        LetterCounter("blablablabla");
    }
}