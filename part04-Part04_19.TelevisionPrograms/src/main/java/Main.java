import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // implement here your program that uses the TelevisionProgram class

        ArrayList<TelevisionProgram> programs = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        int maxDuration = 0;
        
        while (true) {
            System.out.println("Program?");
            String programName = scanner.nextLine();
            
            if (programName.isEmpty()) {
                System.out.println("Maximum duration?");
                maxDuration = Integer.valueOf(scanner.nextLine());
                break;
            } 
            
            System.out.println("Duration?");
            int duration = Integer.valueOf(scanner.nextLine());                      
            
            TelevisionProgram program = new TelevisionProgram(programName, duration);
            programs.add(program);
            
        }
        
        for (TelevisionProgram program : programs) {
            if (program.getDuration() <= maxDuration) {
                System.out.println(program);
            }
        }
    }
}       
