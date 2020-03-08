import java.util.Arrays;
import java.util.Collections;

public class Main {

    public static int NumbersInsideStringCalculator(String someString){
        char[] tempCharsArray = someString.toCharArray();
        int counter = 0;
        for (char tempChar: tempCharsArray) {
            if (Character.isDigit(tempChar)){
                counter += tempChar - '0';
            }
            else continue;
        }
        return counter;
    }
    public static void main(String[] args)
    {
        System.out.println(NumbersInsideStringCalculator("Ala ma 2 koty i 8 psów, a Dawid ma 20 psów."));
    }
}