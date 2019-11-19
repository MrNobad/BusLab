import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusTest {

    private Bus bus;
    private Person person;

    @Before
    public void before(){
        bus = new Bus("Fife", 20);
        person = new Person();
    }

    @Test
    public void numberOfPassengers(){
        assertEquals(0, bus.passengerCount());
    }

    @Test
    public void addPassengerToBus(){
        bus.addPassenger(person);
        assertEquals(1, bus.passengerCount());
    }

    @Test
    public void removePassengerFromBus(){
        bus.addPassenger(person);
        bus.removePassenger(person);
        assertEquals(0, bus.passengerCount());
    }
}
