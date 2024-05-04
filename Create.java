package oop1.svg.f22621604.figureCommands;
import oop1.svg.f22621604.contracts.Figure;
import oop1.svg.f22621604.fileCommands.ManageFile;
import java.io.*;

public class Create {

    public void create(Figure figure, String fileName) {
        String svgContent = figure.generateSVG();
        ManageFile fileManager = ManageFile.getInstance();

        File file = new File(fileName);
        fileManager.setFile(file);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileManager.getFile()))) {
            writer.write(svgContent);
            System.out.println(figure.getClass().getSimpleName() + " SVG file created: " + fileName);
        } catch (IOException e) {
            System.out.println("Error creating SVG file: " + e.getMessage());
        }
    }
}
