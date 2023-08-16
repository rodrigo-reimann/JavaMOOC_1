
import java.util.Scanner;
public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int containerOne = 0;
        int containerTwo = 0;

        while (true) {
            System.out.println("First: " + containerOne + "/" + "100");
            System.out.println("Second: "+ containerTwo + "/" + "100");

            String input = scan.nextLine();
//            String[] parts = input.split(" ");
//            String command = parts[0];
//            int amount = Integer.valueOf(parts[1]);
            
            
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
                
                if (amount < 0 ) {
                    continue;
                }
                
                if (command.equalsIgnoreCase("add")) {
                    containerOne += amount;
                
                    if (containerOne > 100) {
                        containerOne = 100;
                    }
                } else if (command.equalsIgnoreCase("move")) {
                    if (containerOne <= 0) {
                        continue;
                    } else if (containerOne < amount) {
                        if (containerTwo + amount > 100) {
                            containerTwo = 100;
                            containerOne = 0;
                        } else { 
                            containerTwo += containerOne;
                            containerOne = 0;
                        }
                    } else {  
                        if (containerTwo + amount > 100) {
                            containerTwo = 100;
                            containerOne -= amount;
                        } else {
                            containerTwo += amount;
                            containerOne -= amount;
                        }
                    }           
                } else if (command.equalsIgnoreCase("remove")) {
                    if (containerTwo < amount) {
                        containerTwo = 0;
                    } else {
                        containerTwo -= amount;
                    }
                }       
            }
        }                
    }
}
