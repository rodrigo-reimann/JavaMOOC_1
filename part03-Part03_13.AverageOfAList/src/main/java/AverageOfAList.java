
import java.util.ArrayList;
import java.util.Scanner;

public class AverageOfAList {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        // implement here a program, that first reads user input
        // adding them on a list until user gives -1.
        // Then it computes the average of the numbers on the list
        // and prints it.
        
        int sum = 0;
        
        while (true) {
            int number = Integer.valueOf(scanner.nextLine());
            if (number == -1) {
                double average = (double)sum / list.size();
                System.out.println("Average: " + average);
                break;
            }
            list.add(number);
            sum += number;
        }
        
    }
}
