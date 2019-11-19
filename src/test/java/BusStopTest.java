import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BusStopTest {

    private BusStop busStop;
    private Person person;


    @Before

    public void before(){
        busStop = new BusStop("Fife");
        person = new Person();
    }

    @Test
    public void AddPassengerToQueue(){
        busStop.add(person);
        assertEquals(1, busStop.queueCount());
    }

    @Test
    public void removeFromQueue(){
        busStop.add(person);
        busStop.remove();
        assertEquals(0, busStop.queueCount());
    }
}
