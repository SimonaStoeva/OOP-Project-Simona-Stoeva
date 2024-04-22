package oop1.svg.f22621604;
import java.io.*;

public class SaveAs implements Command{
    @Override
    public void execute(String fileWay) {
        ManageFile fileManager=ManageFile.getInstance();

        if(fileManager.file==null){
            System.out.println("No file can be saved now.");
            return;
        }

        File newFile=new File(fileWay);

        try (BufferedReader reader = new BufferedReader(new FileReader(fileManager.file));
             BufferedWriter writer = new BufferedWriter(new FileWriter(newFile))) {
            String line;
            while ((line=reader.readLine())!=null){
                writer.write(line);
                writer.newLine();
            }
            System.out.println("Successfully saved another "+newFile.getName());
        }
        catch(IOException e){
            System.out.println("Can not save the file: "+e.getMessage());
        }
    }
}
