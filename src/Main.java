import java.util.Arrays;
import java.util.Collections;
public class Main {

    public static void Timer(int numberOne, int numberTwo, int numberThree, int numberFour){
        Integer[] array = {numberOne,numberTwo,numberThree,numberFour};
        Arrays.sort(array, Collections.reverseOrder());
        int[] resultArray = new int[4];
        for (int i=0;i<array.length;i++){
            if (array[i]<=2){
                resultArray[0]=array[i];
            } else if(array[i]<=9){
                resultArray[1]=array[i];
            } else if(array[i]<=5){
                resultArray[2]=array[i];
            } else if(array[i]<=9){
                resultArray[3]=array[i];
            }
        }
        for(int i=0;i<resultArray.length;i++){
            System.out.println(resultArray[i]);
        }
    }
    public static void main(String[] args)
    {
        Timer(1,2,3,4);
        //z podanych liczb ma się utworzyć najwyższa możliwa godzina
    }
}
