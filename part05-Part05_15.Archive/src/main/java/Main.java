
import java.nio.file.Files;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Archive> archives = new ArrayList<>();
        
        
        while (true) {
            System.out.println("Identifier? (empty will stop)");
            String id = scanner.nextLine();
                if(id.isBlank()) {
                    break;
                }
            System.out.println("Name? (empty will stop)");
            String nm = scanner.nextLine();
                if (nm.isBlank()) {
                    break;
                }
                
            Archive archive = new Archive(id, nm);
            
            if (archives.contains(archive)) {
                System.out.println("Archive already on list");
            } else {
                archives.add(archive);
            }
        }
        for (Archive archive : archives) {
            System.out.println(archive);   
        }
    }
}
