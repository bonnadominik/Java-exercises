import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args)
    {
        FirstClass firstElement = new FirstClass(); //default construtor
        SecondClass secondElement = new SecondClass(421, 422); //constructor with 2 parameters
        SecondClass thirdElement = new SecondClass(); //custom constructor without parameters
        ThirdClass fourthElement = new ThirdClass(", a to jest drugi konstruktor");
        StaticBlocks fifthElement = new StaticBlocks();
    }
}