import java.util.Arrays;
import java.util.Collections;
public class Main {

    public static void PalindromsChecker(String someString){
        someString = someString.replaceAll("\\s+","" ).toLowerCase();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i=someString.length()-1;i>=0;i--) {
            stringBuilder.append(someString.charAt(i));
        }
        if (someString.equals(stringBuilder.toString())){
            System.out.println("Podany ciąg znaków jest palindromem!");
        } else{
            System.out.println("Podany ciąg znaków NIE jest palindromem.");
        }
    }
    public static void main(String[] args)
    {
        PalindromsChecker("kajak");
        PalindromsChecker("Ada bzy zbada");
    }
}