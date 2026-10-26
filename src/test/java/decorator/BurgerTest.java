package decorator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


public class BurgerTest {
    @Test
    public void testBurger() {
        Burger burger = new Burger();
        assertEquals(5.0, burger.getCost());

    }
}
