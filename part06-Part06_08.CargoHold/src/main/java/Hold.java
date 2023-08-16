import java.util.ArrayList;  

public class Hold {
    private int maxWeight;
    private ArrayList<Suitcase> hold;
    
    public Hold(int maxWeight) {
        this.maxWeight = maxWeight;
        this.hold = new ArrayList<>();
    }
    
    public int holdTotalWeight() {
        int sumWeight = 0;

        for (int i = 0; i < this.hold.size(); i++) {
            Suitcase currentSuitcase = this.hold.get(i);           
            sumWeight += currentSuitcase.totalWeight();;            
        }
        return sumWeight;
    }
    
    public void addSuitcase(Suitcase suitcase) {
        int holdWeight = holdTotalWeight();
        if (suitcase.totalWeight() + holdWeight <= this.maxWeight) {
            hold.add(suitcase);
        }
    }
    
    public void printItems() {
        for (Suitcase suitcase : hold) {
            for (Item item : suitcase.getItems()) {
                System.out.println(item);
            }
        }
    }
    
    public String toString() {
        if (this.hold.size() == 0) {
            return "no suitcases (" +  holdTotalWeight() + " kg)";
        } else if (this.hold.size() == 1 ) {
            return this.hold.size() + " suicase (" +  holdTotalWeight() + " kg)";
        } else {
        return this.hold.size() + " suitcases (" +  holdTotalWeight() + " kg)";
        }
    }
}
