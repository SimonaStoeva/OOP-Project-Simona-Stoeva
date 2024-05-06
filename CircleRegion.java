package oop1.svg.f22621604.figures;
import oop1.svg.f22621604.contracts.Region;

public class CircleRegion implements Region {
    private int cx;
    private int cy;
    private int radius;

    public CircleRegion(int cx, int cy, int radius) {
        this.cx = cx;
        this.cy = cy;
        this.radius = radius;
    }

    @Override
    public boolean checkRectangle(int otherX, int otherY, int otherWidth, int otherHeight) {
        int distanceX=Math.abs(cx-(otherX+otherWidth/2));
        int distanceY = Math.abs(cy-(otherY+otherHeight / 2));

        if(distanceX>(otherWidth/2+radius)){
            return false;
        }

        if(distanceY>(otherHeight/2+radius)){
            return false;
        }

        if(distanceX<=(otherWidth/2)){
            return true;
        }

        if(distanceY<=(otherHeight/2)){
            return true;
        }

        double cornerDistance=Math.pow(distanceX-otherWidth/2,2)+Math.pow(distanceY-otherHeight/2,2);
        return cornerDistance<=Math.pow(radius,2);
    }

    @Override
    public boolean checkCircle(int otherCx, int otherCy, int otherRadius) {
        double distance = Math.sqrt(Math.pow(otherCx - cx, 2) + Math.pow(otherCy - cy, 2));
        return distance+otherRadius<=radius;
    }
}
