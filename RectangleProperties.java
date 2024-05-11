package oop1.svg.f22621604.figures;
import java.util.*;

public class RectangleProperties extends FigureProperties{

    @Override
    public List<String> extractProperties(String figure) {
        List<String> properties = new ArrayList<>();
        properties.add(extractValue(figure, "x"));
        properties.add(extractValue(figure, "y"));
        properties.add(extractValue(figure, "width"));
        properties.add(extractValue(figure, "height"));
        properties.add(extractValue(figure, "fill"));
        return properties;
    }

    public String display(String figure){
        List<String> properties=extractProperties(figure);
        StringBuilder displayFigure=new StringBuilder().append("rectangle");

        displayFigure.append(" ").append(String.join(" ", properties));

        return displayFigure.toString();
    }
}
