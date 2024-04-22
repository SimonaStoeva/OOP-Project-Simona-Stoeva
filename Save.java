package oop1.svg.f22621604;
import java.io.*;

public class Save implements Command{
    @Override
    public void execute(String fileWay) {
        ManageFile fileManager=ManageFile.getInstance();
        File file=fileManager.file;

        if(file==null){
            System.out.println("No open files to save.");
            return;
        }
    }
}
