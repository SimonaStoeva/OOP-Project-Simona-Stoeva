package oop1.svg.f22621604;
import java.io.*;

public class ManageFile {
    private static ManageFile instance;
    protected File file;

    public static ManageFile getInstance(){
        if(instance==null){
            instance=new ManageFile();
        }
        return instance;
    }
}
