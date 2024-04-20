package oop1.svg.f22621604;
import java.io.*;

public class Open implements Command{
    @Override
    public void execute(String fileWay) {
        ManageFile fileManager=ManageFile.getInstance();

        fileManager.file=new File(fileWay);

        if (fileManager.file.exists()) {
            System.out.println("Successfully opened " + fileWay);
        } else {
            System.out.println("Can not open file.");
        }
        if (fileManager.file != null) {
            fileManager.file = null;
            System.out.println("File closed.");
        }
    }
}
