
public class Container {
    int containerVolume;
    
    public Container() {
        containerVolume = 0;
    }
    
    public int contains() {
        return containerVolume;
    }
    
    public void add(int amount) {
        if (amount > 0) {
            containerVolume += amount;
            if (containerVolume > 100) {
                containerVolume = 100;
            }
        }
    }
    
    public void remove (int amount) {
        if (amount > 0) {
            containerVolume -= amount;
            if (containerVolume < 0) {
                containerVolume = 0;
            }
        }
    }
    
    @Override
    public String toString () {
        return containerVolume + "/100";
    }
}
