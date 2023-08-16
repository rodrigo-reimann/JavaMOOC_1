
public class AdvancedAstrology {

    public static void printStars(int number) {
        // part 1 of the exercise
        for (int i = 0; i < number; i++) {
            System.out.print("*");
        }
        
        System.out.println("");
    }

    public static void printSpaces(int number) {
        // part 1 of the exercise
        for (int i = 0; i < number; i++ ) {
            System.out.print(" ");
        }
    }

    public static void printTriangle(int size) {
        // part 2 of the exercise
        int numSpaces = size - 1;
        
        for (int i = 0; i < size; i++) {
            printSpaces(numSpaces);
            printStars(i + 1);
            numSpaces--;
        }
    }

    public static void christmasTree(int height) {
        // part 3 of the exercise
        // print the top of the tree
        int numSpaces = 1;
        int numStars = 1;
        
        for (int i = 0; i < height; i++) {
            printSpaces(height - numSpaces);
            printStars(i + numStars);
            numSpaces++;
            numStars++;
        }
        
        //print the bottom of the tree
        for (int i = 0; i < 2; i++) {
            printSpaces(height - 2);
            printStars(3);
        }
    }

    public static void main(String[] args) {
        // The tests are not checking the main, so you can modify it freely.

        printTriangle(4);
        System.out.println("---");
        christmasTree(4);
        System.out.println("---");
        christmasTree(10);
    }
}
