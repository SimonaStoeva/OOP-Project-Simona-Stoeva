package oop1.svg.f22621604.figures;
import java.util.*;
public class LineProperties extends FigureProperties{

    @Override
    public List<String> extractProperties(String figure) {
        List<String> properties=new ArrayList<>();
        properties.add(extractValue(figure, "x1"));
        properties.add(extractValue(figure,"y1"));
        properties.add(extractValue(figure, "x2"));
        properties.add(extractValue(figure,"y2"));
        properties.add(extractValue(figure, "stroke"));
        properties.add(extractValue(figure, "stroke-width"));
        return properties;
    }

    public String display(String figure){
        List<String> properties=extractProperties(figure);
        StringBuilder displayFigure=new StringBuilder().append("line");

        displayFigure.append(" ").append(String.join(" ", properties));

        return displayFigure.toString();
    }
}
