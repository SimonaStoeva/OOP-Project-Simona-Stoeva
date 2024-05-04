package oop1.svg.f22621604.figureCommands;
import java.io.*;

public class Print {

    public void print(String fileName) {
       try(BufferedReader reader=new BufferedReader(new FileReader(fileName))) {
           StringBuilder svgContent = new StringBuilder();
           String line;

           while ((line = reader.readLine()) != null) {
               svgContent.append(line);
           }

           String[] parts = svgContent.toString().split("<svg>|</svg>");

           if (parts.length >= 2) {
               String figureContent = parts[1];

               String[] figures = figureContent.split("<circle|<rect|<line");

               System.out.println("Figures in the SVG file: ");
               for (String figure : figures) {
                   if (!figure.trim().isEmpty()) {
                       System.out.println(figure.trim());
                   }
               }
           }
       } catch(IOException e){
           System.out.println("Error reading the SVG file: "+e.getMessage());
       }
    }

}
