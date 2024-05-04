package oop1.svg.f22621604.figures;

public class CircleRegion extends Circle{

    public CircleRegion(int cx, int cy, int radius, String color) {
        super(cx, cy, radius, color);
    }

    public boolean contains(Circle circle){
        double circleCx=circle.getCx();
        double circleCy=circle.getCy();
        double circleRadius=circle.getRadius();

        double distance=Math.sqrt(Math.pow(circleCx - getCx(), 2) + Math.pow(circleCy - getCy(), 2));
         return distance+circleRadius <= getRadius();

    }
}
