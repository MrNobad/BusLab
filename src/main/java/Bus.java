import java.util.ArrayList;

public class Bus {

    private String destination;
    private int capacity;
    private ArrayList<Person> passengers;

    public Bus(String destination, int capacity) {
        this.destination = destination;
        this.capacity = capacity;
        this.passengers = new ArrayList<Person>();
    }


    public int passengerCount() {
        return this.passengers.size();
    }

    public void addPassenger(Person person) {
        if(this.passengers.size() < this.capacity) {
            this.passengers.add(person);
        }
    }

    public void removePassenger(Person person) {
        this.passengers.remove(person);
    }

    public void pickUpPassengersFromStop(BusStop busStop){
        Person person = busStop.remove();
        this.passengers.add(person);
    }
}
