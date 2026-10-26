package decorator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HotDogTest {
    @Test
    public void testHotDog() {
        FoodItem HotDog = new HotDog();
        assertEquals(1.50, HotDog.getCost());
    }

}
