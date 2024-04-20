package oop1.svg.f22621604;


public class Close implements CommandLine{
    @Override
    public void execute() {
        ManageFile fileManager=ManageFile.getInstance();

        if(fileManager.file!=null){
            String filePath=fileManager.file.getPath();
            System.out.println("Successfully closed "+filePath);

            fileManager.file=null;
        }
        else{
            System.out.println("There's no open file to close.");
        }
    }
}
