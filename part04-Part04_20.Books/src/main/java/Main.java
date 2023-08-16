import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        // implement here the program that allows the user to enter 
        // book information and to examine them
        
        ArrayList<Book> books = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        String info = "";
        
        
        while(true) {
            System.out.println("Title: ");
            String title = scanner.nextLine();
            
            if(title.isEmpty()) {
                System.out.println("What information will be printed? ");
                info = scanner.nextLine();
                break;
            }
            
            System.out.println("Pages: ");
            int pages = Integer.valueOf(scanner.nextLine());
            System.out.println("Publication year: ");
            int year = Integer.valueOf(scanner.nextLine());
            
            Book collection = new Book(title, pages, year);
            books.add(collection);
        }
        
        for (Book element : books) {
            if (info.equalsIgnoreCase("everything")) {
                System.out.println(element);
            } else if (info.equalsIgnoreCase("name")) {
                System.out.println(element.getTitle());
            }
        }
    }
}
