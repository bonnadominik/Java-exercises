import java.util.Arrays;
import java.util.Collections;
import java.awt.*;

public class Main {
    public static void main(String[] args)
    {
        Camera myCamera = new Camera();
        MeasuringArea myArea = new MeasuringArea();

        System.out.println(myCamera.TakePictures());
    }
}