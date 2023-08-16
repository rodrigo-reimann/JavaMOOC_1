
import java.util.Scanner;


public class UserInterface {
    private TodoList list;
    private Scanner scanner;
    
    public UserInterface(TodoList list, Scanner scanner) {
        this.list = list;
        this.scanner = scanner;
    }
    
    public void start() {
        while (true) {
            System.out.print("Command: ");
            String command = scanner.nextLine();        

            if (command.equals("add")) {
                System.out.print("To add: ");
                String task = scanner.nextLine();
                list.add(task);            
                start();           
            } else if (command.equals("list")) {
                list.print();
                start();
            } else if (command.equals("remove")) {
                System.out.println("Which one is removed? ");
                int removeIndex = Integer.valueOf(scanner.nextLine());
                list.remove(removeIndex);
                start();
            } else if (command.trim().equals("stop")) {
                System.out.println("Bye bye!");
                break;
            }
            break;
        }
    }
}
