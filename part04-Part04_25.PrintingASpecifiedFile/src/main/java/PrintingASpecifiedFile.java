
import java.nio.file.Paths;
import java.util.Scanner;

public class PrintingASpecifiedFile {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("File name? ");
        String input = scanner.nextLine();
        
        try (Scanner fileScan = new Scanner(Paths.get(input))) {
            while (fileScan.hasNextLine()) {
                String row = fileScan.nextLine();
                System.out.println(row);
            }
            
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
