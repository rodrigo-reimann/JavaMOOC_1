import java.awt.print.Book;
import java.util.ArrayList;
public class Main {

    public static void main(String[] args) {


        // use this main method to try out your classes!
        
        Gift gift = new Gift("book", 10);
        Gift gift2 = new Gift("rock", 100);
        Package pack = new Package();
        
        pack.addGift(gift);
        pack.addGift(gift2);
        
        System.out.println(pack.totalWeight());
    }
}
