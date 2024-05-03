package oop1.svg.f22621604.figures;

import oop1.svg.f22621604.contracts.Figure;

public class Circle implements Figure {
    private int cx;
    private int cy;
    private int radius;
    private String color;

    public Circle(int cx, int cy, int radius, String color) {
        this.cx = cx;
        this.cy = cy;
        this.radius = radius;
        this.color = color;
    }

    @Override
    public String generateSVG() {
        StringBuilder svgBuilder=new StringBuilder();
        svgBuilder.append("<svg xmlns=\"http://www.w3.org/2000/svg\" width=\"200\" height=\"200\">\n");
        svgBuilder.append("<circle cx=\""+cx+ "\" cy=\"" + cy + "\" r=\"" + radius + "\" fill=\"" + color + "\" />\n");
        svgBuilder.append("</svg>");
        return svgBuilder.toString();
    }
}
