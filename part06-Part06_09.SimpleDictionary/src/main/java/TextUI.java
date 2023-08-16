
import java.util.Scanner;



public class TextUI {
    private SimpleDictionary dictionary;
    private Scanner scanner;
    
    public TextUI(Scanner scanner, SimpleDictionary dictionary) {
        this.dictionary = dictionary;
        this.scanner = scanner;
    }
    
    public void start() {
        System.out.print("Command: ");
        String command = scanner.nextLine();
        
        if (command.equals("end")) {
            System.out.println("Bye bye!");
        } else if (command.equals("add")) {
            System.out.print("Word: ");
            String word = scanner.nextLine();
            System.out.print("Translation: ");
            String translation = scanner.nextLine();
            dictionary.add(word, translation);            
            start();           
        } else if (command.equals("search")) {
            System.out.println("To be translated: ");
            String toBeTranslated = scanner.nextLine();
            String translation = dictionary.translate(toBeTranslated);
                       
            if (translation == null) {
                System.out.println("Word " + toBeTranslated + " was not found");
            } else {
                System.out.println("Tranlsation: " + translation);
            }
            start();
        } else {
            System.out.println("Unknown command");
            start();
        }
    }
}
