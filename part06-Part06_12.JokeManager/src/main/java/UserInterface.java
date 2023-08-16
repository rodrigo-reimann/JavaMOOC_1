
import java.util.Scanner;


public class UserInterface {
    private JokeManager jokes;
    private Scanner scanner;
    
    public UserInterface(JokeManager jokes, Scanner scanner) {
        this.jokes = jokes;
        this.scanner = scanner;
    }
    
    public void start() {
        while (true) {
            System.out.println("Commands:");
            System.out.println("1 - add a joke");
            System.out.println("2 - draw a joke");
            System.out.println("3 - list jokes"); 
            System.out.println("X - stop");
            String input = scanner.nextLine();
            
            if (input.equalsIgnoreCase("x")) {
                break;
            }
            else if (input.equals("1")) {
                System.out.println("Write the joke to be added");
                String joke = scanner.nextLine();
                jokes.addJoke(joke);
            } else if (input.equals("2")) {
                System.out.println(jokes.drawJoke());
            } else if (input.equals("3")) {
                jokes.printJokes();
            }
        }
    }
    
}
