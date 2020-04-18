import java.awt.*;
public class Camera {

    private MeasuringArea area = new MeasuringArea();
    private int areaLeftCornerX = (int) Math.round(area.getLeftCornerX());
    private int getAreaLeftCornerY = (int) Math.round(area.getLeftCornerY());

    private Rectangle cameraPosition = new Rectangle(areaLeftCornerX, getAreaLeftCornerY-40, 40, 40);

    private Point MoveHalfStepDown() {
        Point tempCameraPosition = cameraPosition.getLocation();
        tempCameraPosition.translate(0, -20);
        return tempCameraPosition;
    }

    private Point MoveOneStepDown() {
        Point tempCameraPosition = cameraPosition.getLocation();
        tempCameraPosition.translate(0, -40);
        return tempCameraPosition;
    }

    private Point MoveOneStepRight() {
        Point tempCameraPosition = cameraPosition.getLocation();
        tempCameraPosition.translate(40, 0);
        return tempCameraPosition;
    }

    private Point MoveOneStepLeft() {
        Point tempCameraSize = cameraPosition.getLocation();
        tempCameraSize.translate(-40, 0);
        return tempCameraSize;
    }

    private void DropDown() {
        if (cameraPosition.getY() >= cameraPosition.height) {
            cameraPosition.setLocation(MoveOneStepDown());
        } else if(cameraPosition.getY() >= cameraPosition.height/2) {
            cameraPosition.setLocation(MoveHalfStepDown());
        }
    }

    int TakePictures() {
        int counter = 0;
        while (cameraPosition.getLocation().getY() > area.getEndOfArea().getY() || cameraPosition.getLocation().getX() != area.getWidth()-cameraPosition.getWidth()){
            if(cameraPosition.getLocation().getX() == area.getEndOfArea().getX()){
                while (cameraPosition.getX() < area.getWidth()-cameraPosition.getWidth()) {
                    cameraPosition.setLocation(MoveOneStepRight());
                    counter++;
                }
            } else {
                while (cameraPosition.getX() > area.getEndOfArea().getX()) {
                    cameraPosition.setLocation(MoveOneStepLeft());
                    counter++;
                }
            }
            DropDown();
            counter++;
        }
        return counter;
    }
}

