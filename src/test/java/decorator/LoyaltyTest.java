package decorator;

import org.junit.jupiter.api.Test;
import static  org.junit.jupiter.api.Assertions.*;


public class LoyaltyTest {
    @Test
    public void testRegularDiscount(){
        LoyaltyStatus customer = new LoyaltyStatus("Regular");
        assertEquals(100.0,customer.applyDiscount(100.0));
    }

    @Test
    public void testSilverDiscount(){
        LoyaltyStatus customer = new LoyaltyStatus("Silver");
        assertEquals(95.0,customer.applyDiscount(100.0));
    }

    @Test
    public void testDiamondDiscount(){
        LoyaltyStatus customer = new LoyaltyStatus("Diamond");
        assertEquals(90.0,customer.applyDiscount(100.0));
    }
}
