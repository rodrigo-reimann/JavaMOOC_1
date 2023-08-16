import java.util.Scanner;
import java.util.ArrayList;

public class UserInterface {
    private Scanner scanner;
    private Points points;
    
    public UserInterface() {
        this.scanner = new Scanner(System.in);
        this.points = new Points();
    }
    
    public void start() {
        System.out.println("Enter point totals, -1 stops:");
        int point;
        
        while ((point = scanner.nextInt()) != -1) {
            //add point to arraylist points in class Points
            points.addPoints(point);                 
        }
        
        System.out.println("Point average (all): " + points.pointAverage());
        if (points.passingGradeAverage() == 0) {
            System.out.println("Point average (passing): - ");
        } else {
            System.out.println("Point average (passing): " + points.passingGradeAverage());
        }
        System.out.println("Pass percentage: " + points.passPercentage());
        System.out.println("Grade distribution: ");
        points.gradeDistribution();
        
        
    }
}
