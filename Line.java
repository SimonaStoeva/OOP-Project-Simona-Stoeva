package oop1.svg.f22621604.figures;
import oop1.svg.f22621604.contracts.Figure;

public class Line implements Figure {
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private String color;

    public Line(int x1, int y1, int x2, int y2, String color) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.color = color;
    }

    @Override
    public String generateSVG() {
        StringBuilder svgBuilder=new StringBuilder();
        svgBuilder.append("<svg xmlns=\"http://www.w3.org/2000/svg\" width=\"200\" height=\"200\">\n");
        svgBuilder.append("<line x1=\"" + x1 + "\" y1=\"" + y1 + "\" x2=\"" + x2 + "\" y2=\"" + y2 + "\" stroke=\"" + color + "\" />\n");
        svgBuilder.append("</svg>");
        return svgBuilder.toString();
    }
}
