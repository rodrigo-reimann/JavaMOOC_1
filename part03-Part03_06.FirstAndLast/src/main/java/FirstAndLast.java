
import java.util.ArrayList;
import java.util.Scanner;

public class FirstAndLast {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ArrayList<String> list = new ArrayList<>();
        
        int index = list.size() - 1;
        while (true) {
            String input = scanner.nextLine();
            if (input.equals("")) {
                System.out.println(list.get(0));
                System.out.println(list.get(index));
                break;
            }

            list.add(input);
            index++;
        }

    }
}
