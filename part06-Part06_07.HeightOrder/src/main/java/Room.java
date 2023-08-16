import java.util.ArrayList;

public class Room {
    ArrayList<Person> room = new ArrayList<>();
    
    public Room() {
    }
    
    public void add(Person person) {
        this.room.add(person);
    }
    
    public boolean isEmpty() {
        return room.isEmpty();
    }
    
    public ArrayList<Person> getPersons() {
        return room;
    }
    
    public Person shortest() {
        if (this.room.isEmpty()) {
            return null;
        }
        Person shortest = new Person("", Integer.MAX_VALUE);
        
        for (Person p : this.room) {
            if (p.getHeight() < shortest.getHeight()) {
                shortest = p;
            }
        }
        return shortest;
    }
    
    public Person take() {
        if (this.room.isEmpty()) {
            return null;
        }       
        Person shortestPerson = shortest();
        this.room.remove(shortestPerson);
        return shortestPerson;
    }
}
