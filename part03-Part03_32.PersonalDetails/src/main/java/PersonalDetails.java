
import java.util.ArrayList;
import java.util.Scanner;

public class PersonalDetails {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double birthAvg = 0;
        int sum = 0;
        int count = 0;
        String name = "";
        
        while(true) {
            String data = scanner.nextLine();
            
            if (data.equals("")) {
                break;
            }
            String[] parts = data.split(",");
            
            if (parts[0].length() > name.length()) {
                name = parts[0];
            }
            
            sum += Integer.valueOf(parts[1]);
            count++;            
        }
        
        birthAvg = (double)sum / count;
        
        System.out.println("Longest name: " + name);
        System.out.println("Average of birth years: " + birthAvg);


    }
}
