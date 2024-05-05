package oop1.svg.f22621604.figures;
import oop1.svg.f22621604.contracts.Region;

public class RectangleRegion implements Region {
    private int x;
    private int y;
    private int width;
    private int height;

    public RectangleRegion(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    @Override
    public boolean checkRectangle(int otherX, int otherY, int otherWidth, int otherHeight) {
        return otherX>=x && otherY>=y && otherX+otherWidth<=x+width
                && otherY+otherHeight<y+height;
    }

    @Override
    public boolean checkCircle(int otherCx, int otherCy, int otherRadius) {
        int rectCenterX = x + width / 2;
        int rectCenterY = y + height / 2;

        int circleDistanceX = Math.abs(otherCx - rectCenterX);
        int circleDistanceY = Math.abs(otherCy - rectCenterY);

        if (circleDistanceX > (width / 2 + otherRadius)) {
            return false;
        }
        if (circleDistanceY > (height / 2 + otherRadius)) {
            return false;
        }

        if (circleDistanceX <= (width / 2)) {
            return true;
        }
        if (circleDistanceY <= (height / 2)) {
            return true;
        }

        double cornerDistanceSq = Math.pow(circleDistanceX - width / 2, 2) + Math.pow(circleDistanceY - height / 2, 2);
        return cornerDistanceSq <= Math.pow(otherRadius, 2);
    }
}
