import java.util.Arrays;
import java.util.Collections;

public class Main {

    static void getLength(String line){
        System.out.println(line.length());
    }

    public static void main(String[] args) throws Exception {
        try{
            getLength(null);
        } catch(NullPointerException e) {
            //e.printStackTrace(System.out);
            //e.fillInStackTrace();
            //throw e;
            //throw new Exception();
            throw new Exception(e);
            //ślady stosu są takie same
        }
    }
}