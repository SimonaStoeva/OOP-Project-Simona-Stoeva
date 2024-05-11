package oop1.svg.f22621604.figures;

import java.util.*;

public abstract class CheckRegion {
  private CircleProperties circleProp=new CircleProperties();
  private RectangleProperties rectangleProp=new RectangleProperties();
  private LineProperties lineProp=new LineProperties();

  public boolean checkRegion(String figure){
      String token=figure.trim().split(" ")[0];
      List<String> properties;

      if(token.equalsIgnoreCase("<circle")){
          properties=circleProp.extractProperties(figure);

          int cx=Integer.parseInt(properties.get(0));
          int cy=Integer.parseInt(properties.get(1));
          int radius=Integer.parseInt(properties.get(2));

          return this.checkCircle(cx,cy,radius);
      } else if(token.equalsIgnoreCase("<rect")){
          properties=rectangleProp.extractProperties(figure);

          int x=Integer.parseInt(properties.get(0));
          int y=Integer.parseInt(properties.get(1));
          int width=Integer.parseInt(properties.get(2));
          int height=Integer.parseInt(properties.get(3));

          return this.checkRectangle(x,y,width,height);

      } else{
          properties=lineProp.extractProperties(figure);

          int x1=Integer.parseInt(properties.get(0));
          int y1=Integer.parseInt(properties.get(1));
          int x2=Integer.parseInt(properties.get(2));
          int y2=Integer.parseInt(properties.get(3));

          return this.checkLine(x1,y1,x2,y2);
      }
  }
  public abstract boolean checkCircle(int cx,int cy, int radius);
  public abstract boolean checkRectangle(int x,int y, int width, int height);
  public abstract boolean checkLine(int x1,int y1, int x2, int y2);
}