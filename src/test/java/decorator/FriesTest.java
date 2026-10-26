package decorator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FriesTest {
    @Test
    public void testFries() {
        FoodItem fries = new Fries();
        assertEquals(1.0, fries.getCost());
    }

}
