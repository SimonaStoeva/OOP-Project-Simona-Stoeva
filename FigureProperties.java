package oop1.svg.f22621604.figures;
import java.util.*;

public abstract class FigureProperties {
    protected String extractValue(String figure, String attrName){
        int start=figure.indexOf(attrName+"\"")+attrName.length()+2;
        int end=figure.indexOf("\"", start);
        String value=figure.substring(start,end);
        return value;
    }

    public abstract List<String> extractProperties(String figure);

    public abstract String display(String figure);
}
