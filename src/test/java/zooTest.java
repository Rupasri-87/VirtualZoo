import org.junit.jupiter.api.Test;
import zoo.Duck;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class zooTest {

    Duck duck = new Duck();

    @Test
    public void duckEatTest(){

        assertEquals(duck.eat(), "Duck eating");

    }
    @Test
    public void duckSwimAndFlyTest(){

        assertEquals(duck.swim(), "Duck can swim");
        assertEquals(duck.fly(), "Duck can fly");
    }


}
