
import java.util.Scanner;

public class AbsoluteValue {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int v = Integer.valueOf(scanner.nextLine());
        if (v < 0) {
            System.out.println(v*(-1));
        } else {
            System.out.println(v);
        }

    }
}
