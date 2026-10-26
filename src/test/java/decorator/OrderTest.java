package decorator;

import org.junit.jupiter.api.Test;
import static  org.junit.jupiter.api.Assertions.*;


public class OrderTest  {
    @Test
    public void testAddItem(){
        Order order = new Order();
        order.addItem(new Burger());
        assertEquals(5.0,order.getTotal());

    }
}
