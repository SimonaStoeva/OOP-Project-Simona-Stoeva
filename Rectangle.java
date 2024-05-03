package oop1.svg.f22621604.figures;
import oop1.svg.f22621604.contracts.Figure;
import java.util.*;

public class Rectangle implements Figure {
    private int x;
    private int y;
    private int width;
    private int height;
    private String color;

    public Rectangle(int x, int y, int width, int height, String color) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
        this.color = color;
    }

    @Override
    public String generateSVG() {
        StringBuilder svgBuilder=new StringBuilder();
        svgBuilder.append("<svg xmlns=\"http://www.w3.org/2000/svg\" width=\"200\" height=\"200\">\n");
        svgBuilder.append("<rect x=\"" + x + "\" y=\"" + y + "\" width=\"" + width + "\" height=\"" + height + "\" fill=\"" + color + "\" />\n");
        svgBuilder.append("</svg>");
        return svgBuilder.toString();
    }
}

