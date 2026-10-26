package bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CashOnDeliveryTest {
    @Test
    public void testCashOnDelivery() {
        CashOnDeliveryNotification payment = new CashOnDeliveryNotification(new SmsChannel());

        assertDoesNotThrow(() -> payment.NotifyCustomer());
    }
}
