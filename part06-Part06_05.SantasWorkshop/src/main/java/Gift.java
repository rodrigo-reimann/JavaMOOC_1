import java.util.ArrayList;

public class Gift {
    private int weight;
    private String name;
    
    public Gift(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getWeight() {
        return this.weight;
    }
    
    public String toString() {
        return this.name + " (" + this.weight + " kg)";
    }
    
    
}
