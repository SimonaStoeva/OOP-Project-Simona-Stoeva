package oop1.svg.f22621604;
import java.util.*;

public class Menu {
    private Open openCommand;
    private Save saveCommand;
    private SaveAs saveAsCommand;
    private Close closeCommand;
    private Help helpCommand;
    private Exit exitCommand;

    public Menu(Open openCommand, Save saveCommand, SaveAs saveAsCommand, Close closeCommand,Help helpCommand, Exit exitCommand) {
        this.openCommand = openCommand;
        this.saveCommand = saveCommand;
        this.saveAsCommand = saveAsCommand;
        this.closeCommand = closeCommand;
        this.helpCommand = helpCommand;
        this.exitCommand = exitCommand;
    }

    public void displayMenu(){
        System.out.println("Select an option to execute");
        Scanner scanner=new Scanner(System.in);

        while(true) {
            System.out.println("1. Open <file>");
            System.out.println("2. Save <file>");
            System.out.println("3. Save <file> as");
            System.out.println("4. Close <file>");
            System.out.println("5. Help");
            System.out.println("6. Exit");

            int choice=scanner.nextInt();

            switch(choice){
                case 1:
                    System.out.println("Enter a file path to open: ");
                    String filePath= scanner.nextLine();
                    openCommand.execute(filePath);
                    break;
                case 2:
                    System.out.println("Enter a file path to save: ");
                    String savePath=scanner.nextLine();
                    saveCommand.execute(savePath);
                    break;
                case 3:
                    System.out.println("Enter file path to save as:");
                    String saveAsPath = scanner.nextLine();
                    saveAsCommand.execute(saveAsPath);
                    break;
                case 4:
                    closeCommand.execute();
                    break;
                case 5:
                    helpCommand.printInfo();
                    break;
                case 6:
                    exitCommand.execute();
                    break;
                default:
                    System.out.println("Invalid option. Try again.");
            }

        }
    }
}
