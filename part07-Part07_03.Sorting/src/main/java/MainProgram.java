
import java.util.Arrays;


public class MainProgram {

    public static void main(String[] args) {
        int[] numbers = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(numbers);
    }
        
    public static int smallest (int [] array) {
        int smallestNumber = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < smallestNumber) {
                smallestNumber = array[i];
            }
        }
        return smallestNumber;
    }
    
    public static int indexOfSmallest(int [] array) {
        int smallestIndex = smallest(array);
        for (int i = 0; i < array.length; i++) {
            if (array[i] == smallestIndex) {
                return i;
            }
        }
        return -1;
    }
    
    public static int indexOfSmallestFrom(int [] table, int startIndex) {
        int minIndex = startIndex;
        for (int i = startIndex; i < table.length; i++) {
            if (table[i] < table[minIndex]) {
                minIndex = i;
            }
        }
        return minIndex;
    }
    
    public static void swap(int[] array, int index1, int index2) {
        int c = array[index2];
        array[index2] = array[index1];
        array[index1] = c; 
    }
    
    public static void sort(int [] array) {
        for (int i = 0; i < array.length; i++) {
            int smallestFromIndex = MainProgram.indexOfSmallestFrom(array, i);
            MainProgram.swap(array, i, smallestFromIndex);
            System.out.println(Arrays.toString(array));
        }
    }
}


