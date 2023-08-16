
public class MainProgram {

    public static void main(String[] args) {
        // test your class here

        Money money = new Money(10,10);
        Money money2 = new Money(20,10);
        
        money2 = money2.minus(money);
        System.out.println(money2);
    }
}
