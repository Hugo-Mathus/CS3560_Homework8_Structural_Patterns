package decorator;

import org.junit.jupiter.api.Test;
import static  org.junit.jupiter.api.Assertions.*;


public class OnionTest {
    @Test
    public void Oniontest() {
        FoodItem HotDog = new HotDog();
        FoodItem HotDogWithOnions = new Onions(HotDog);
        assertEquals(2.0, HotDogWithOnions.getCost());
    }
}
