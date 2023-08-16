/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author rodrigo
 */
public class Counter {
    int startValue;
    
    public Counter() {
        this(0);
    }
    
    public Counter(int startValue) {
        this.startValue = startValue;
    }
    
    public int value() {
        return this.startValue;
    }
    
    public void increase() {
        this.startValue += 1;
    }
    
    public void increase(int increaseBy) {
        if (increaseBy > 0) {
            this.startValue += increaseBy;
        }
    }
    
    public void decrease() {
        this.startValue -= 1;
    }
    
    public void decrease(int decreaseBy) {
        if (decreaseBy > 0){
            this.startValue -= decreaseBy;
        }
    }
    
    public String toString() {
        return String.valueOf(this.startValue);
    }
}
