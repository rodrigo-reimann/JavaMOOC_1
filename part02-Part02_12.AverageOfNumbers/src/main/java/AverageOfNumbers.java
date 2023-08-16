
import java.lang.invoke.MethodHandles;
import java.util.Scanner;

public class AverageOfNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double average = 0;
        double sum = 0;
        int count = 0;
        
        while (true) {
            System.out.println("Give a number:");
            int userNumber = Integer.valueOf(scanner.nextLine());
            
            if (userNumber == 0) {
                System.out.println("Average of the numbers: " + average);
                break;                
            } else {
                sum = sum + userNumber;
                count = count +1;
                average = sum / count;
            }
        }
    }
}
