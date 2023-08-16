
import java.util.Scanner;

public class NameOfTheOldest {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int oldest = Integer.MIN_VALUE;
        String oldestnm = "";
        
        while (true) {
            String info = scanner.nextLine();
            
            if (info.equals("")) {
                break;
            }
            
            String[] pieces = info.split(",");
            
            if (Integer.valueOf(pieces[1]) > oldest) {
                oldest = Integer.valueOf(pieces[1]);
                oldestnm = pieces[0];
            }                                  
        }
        
        System.out.println("Name of the oldest: " + oldestnm);

    }
}
