import java.awt.*;
import java.awt.geom.Point2D;

public class MeasuringArea {
    private Rectangle measuringAreaSize = new Rectangle(0, 0,600,500);

    public double getLeftCornerX() {
        return this.measuringAreaSize.getMinX();
    }

    public double getLeftCornerY() {
        return this.measuringAreaSize.getMaxY();
    }

    public double getWidth(){
        return this.measuringAreaSize.getWidth();
    }

    Point getEndOfArea(){
        Point tempPoint = new Point();
        tempPoint.setLocation(measuringAreaSize.getMinX(),measuringAreaSize.getMinY());
        return tempPoint;
    }
}
