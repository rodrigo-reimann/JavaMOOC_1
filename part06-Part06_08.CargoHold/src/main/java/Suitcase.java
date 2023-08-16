import java.util.ArrayList;

public class Suitcase {
    private Item item;
    private int maxWeight;
    private ArrayList<Item> suitcase;
    
    public Suitcase(int maxWeight) {
        this.maxWeight = maxWeight;
        this.suitcase = new ArrayList<>();
    }
    
    public int totalWeight() {
        int sumWeight = 0;
        
        for (int i = 0; i < this.suitcase.size(); i++) {
            Item currentItem = this.suitcase.get(i);           
            sumWeight += currentItem.getWeight();;            
        }
        
        return sumWeight;
    }
    
    public ArrayList<Item> getItems() {
        return suitcase;
    }
    
    public void addItem(Item item) {
        int sumWeight = totalWeight();
        
        if (item.getWeight() + sumWeight <= this.maxWeight) {
            this.suitcase.add(item);
        }
    }
    
    public void printItems() {
        for (Item item : this.suitcase) {
            System.out.println(item);
        }
    }
    
    public Item heaviestItem() {
        Item heaviestItem = new Item("",0);
        
        if (this.suitcase.size() > 0) {
            for (int i = 0; i < this.suitcase.size(); i++) {
                Item currentItem = this.suitcase.get(i);
                if (currentItem.getWeight() > heaviestItem.getWeight()) {
                    heaviestItem = currentItem;
                }
            }
            return heaviestItem;
        }
        return null;       
    }
    
    
    @Override
    public String toString() {
        if (this.suitcase.size() == 0) {
            return "no items (" +  totalWeight() + " kg)";
        } else if (this.suitcase.size() == 1 ) {
            return this.suitcase.size() + " item (" +  totalWeight() + " kg)";
        } else {
        return this.suitcase.size() + " items (" +  totalWeight() + " kg)";
        }
    }
}
