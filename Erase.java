package oop1.svg.f22621604.figureCommands;
import oop1.svg.f22621604.fileCommands.ManageFile;
import java.io.*;

public class Erase {
    public void erase(String fileName, int index) {
        ManageFile fileManager=ManageFile.getInstance();
        File svgFile = fileManager.getFile();

        try(BufferedReader reader=new BufferedReader(new FileReader(svgFile))){
            StringBuilder svgContent=new StringBuilder();
            String line;
            int currIndex=0;

            while((line= reader.readLine())!=null){
                if(line.contains("<circle")||line.contains("<rect")|| line.contains("<line")){
                    if(currIndex!=index){
                        svgContent.append(line).append("\n");
                    }
                    currIndex++;
                }else{
                    svgContent.append(line).append("\n");
                }
            }

            try(BufferedWriter writer=new BufferedWriter(new FileWriter(svgFile))){
                writer.write(svgContent.toString());
                System.out.println("Figure at index "+index+" removed from SVG file: "+fileName);
            } catch(IOException e){
                System.out.println("Error writing to SVG file: "+e.getMessage());
            }
        }catch (IOException e){
            System.out.println("Error reading SVG file: "+e.getMessage());
        }
    }
}
