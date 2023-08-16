
import java.util.Scanner;

public class AgeOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = Integer.MIN_VALUE;
        
        while (true) {
            String info = scanner.nextLine();
            
            if (info.equals("")) {
                break;
            }
            
            String[] pieces = info.split(",");
            
            if (Integer.valueOf(pieces[1]) > oldest) {
                oldest = Integer.valueOf(pieces[1]);
            }                                  
        }
        
        System.out.println("Age of the oldest: " + oldest);

    }
}
