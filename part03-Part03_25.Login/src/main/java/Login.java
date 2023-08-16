
import java.util.Scanner;

public class Login {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a username: ");
        String uname = scanner.nextLine();
        
        System.out.println("Enter a password: ");
        String pwd = scanner.nextLine();
        
        if (uname.equals("alex") && pwd.equals("sunshine")) {
            System.out.println("You have successfully logged in!");
        } else if (uname.equals("emma") && pwd.equals("haskell")) {
            System.out.println("You have successfully logged in!");
        } else {
            System.out.println("Incorrect username of password!");
        }
        

    }
}
