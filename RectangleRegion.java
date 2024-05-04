package oop1.svg.f22621604.figures;

public class RectangleRegion extends Rectangle {
    public RectangleRegion(int x, int y, int width, int height, String color) {
        super(x, y, width, height, color);
    }

    public boolean contains(Rectangle rectangle){
        int rectX= rectangle.getX();
        int rectY=rectangle.getY();
        int rectWidth=rectangle.getWidth();
        int rectHeight=rectangle.getHeight();

        return rectX >= getX() && rectY >= getY() &&
                rectX+rectWidth <= getX()+getWidth() &&
                rectY+rectHeight <= getY()+getHeight();
    }
}
