package decorator;

import org.junit.jupiter.api.Test;
import static  org.junit.jupiter.api.Assertions.*;

public class cheeseTest {
    @Test
    public void testCheese() {
        FoodItem burger = new Burger();
        FoodItem cheeseBurger = new Cheese(burger);

        assertEquals(6.0,cheeseBurger.getCost());
    }
}
