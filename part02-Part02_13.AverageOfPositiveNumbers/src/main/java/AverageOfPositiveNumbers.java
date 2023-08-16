
import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int positiveNumbersCount = 0;
        double averageOfPositives = 0;
        double sum = 0;
        
        while (true) {
            System.out.println("Give a number: ");
            int userNumber = Integer.valueOf(scanner.nextLine());
            
            if (userNumber == 0) {
                if (positiveNumbersCount <= 0) {
                    System.out.println("Cannot calculate the average");
                    break;
                } else {
                    System.out.println(averageOfPositives);
                    break;
                }
            } else if (userNumber > 0) {
                positiveNumbersCount= positiveNumbersCount + 1;
                sum = sum + userNumber;
                averageOfPositives = sum / positiveNumbersCount;
            }
        }
    }
}
