package oop1.svg.f22621604.figures;
import java.util.*;

public class CircleProperties extends FigureProperties{

    @Override
    public List<String> extractProperties(String figure) {
        List<String> properties = new ArrayList<>();
        properties.add(extractValue(figure, "cx"));
        properties.add(extractValue(figure, "cy"));
        properties.add(extractValue(figure, "r"));
        properties.add(extractValue(figure, "fill"));

        return properties;
    }

    public String display(String figure){
    List<String> properties=extractProperties(figure);
    StringBuilder displayFigure=new StringBuilder().append("circle");

    displayFigure.append(" ").append(String.join(" ", properties));

    return displayFigure.toString();
    }

}
