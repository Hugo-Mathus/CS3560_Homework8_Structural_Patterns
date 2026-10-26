package decorator;
import org.junit.jupiter.api.Test;
import static  org.junit.jupiter.api.Assertions.*;

public class KetchupTest {
    @Test
    public void testKetchup() {
        FoodItem Fries = new Fries();
        FoodItem FriesandKetchup = new Ketchup(Fries);

        assertEquals(3.5,FriesandKetchup.getCost());
    }
}
