
public class MainProgram {

    public static void main(String[] args) {
        // Test your counter here
        
        Counter counter = new Counter();
        
        counter.increase();
        counter.increase(5);
        counter.increase();
        counter.decrease(10);
        
        System.out.println(counter);
    }
}
