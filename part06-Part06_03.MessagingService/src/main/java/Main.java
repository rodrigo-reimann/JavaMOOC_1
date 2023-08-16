import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {

        // Try out your class here
        Message message = new Message("rodrigo", "it is me");
        MessagingService one = new MessagingService();
        
        one.add(message);
        one.getMessages();
        
        
    }
}
