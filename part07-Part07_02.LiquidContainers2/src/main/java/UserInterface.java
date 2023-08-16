
import java.util.Scanner;


public class UserInterface {
    private Scanner scan;
    private Container first;
    private Container second;
    
    public UserInterface () {
        scan = new Scanner(System.in);
        first = new Container();
        second = new Container();
    }
    public void start() {
        while (true) {
            System.out.println("First: " + first);
            System.out.println("Second: "+ second);

            String input = scan.nextLine();
        
            if (input.equalsIgnoreCase("quit")) {
                break;
            } else {
                String[] parts = input.split(" ");
                if (parts.length != 2) {
                    System.out.println("Invalid input. Please enter a command followed by an amount.");
                    continue;
                }
                String command = parts[0];
                int amount = Integer.valueOf(parts[1]);
                
                if (command.equalsIgnoreCase("add")) {
                    first.add(amount);
                } else if (command.equalsIgnoreCase("move") && amount > 0) {
                    if (amount > first.contains()) {
                        amount = first.contains();
                    }
                    first.remove(amount);
                    second.add(amount);
                    
                } else if (command.equalsIgnoreCase("remove")) {
                    second.remove(amount);
                }
            }
        }
    }
}
