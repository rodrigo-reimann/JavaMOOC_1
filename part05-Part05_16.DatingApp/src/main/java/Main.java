
public class Main {

    public static void main(String[] args) {
        // test your program here!
        
        SimpleDate date = new SimpleDate(19, 03, 1990);
        SimpleDate date2 = new SimpleDate(30, 12, 1990);
        
        //date.advance();
        //date2.advance();
        date.afterNumberOfDays(100);
        
        System.out.println(date);
        System.out.println(date2);
    }
}
