
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Give points:");
        int value = Integer.valueOf(scan.nextLine());
        if (value < 0) {
            System.out.println("Grade: impossible!");
        } else if (value >= 0 && value <=49) {
            System.out.println("Grade: failed");
        } else if (value >= 50 && value <=59) {
            System.out.println("Grade: 1");
        } else if (value >= 60 && value <=69) {
            System.out.println("Grade: 2");
        } else if (value >= 70 && value <=79) {
            System.out.println("Grade: 3");
        } else if (value >= 80 && value <=89) {
            System.out.println("Grade: 4");
        } else if (value >= 90 && value <=100) {
            System.out.println("Grade: 5");
        } else {
            System.out.println("Grade: incredible!");
        }
    }
}
