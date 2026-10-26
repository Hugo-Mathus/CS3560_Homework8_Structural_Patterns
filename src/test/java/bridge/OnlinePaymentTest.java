package bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OnlinePaymentTest {

    @Test
    public void testNotifyCustomer() {

        OnlinePaymentNotification payment = new OnlinePaymentNotification(new EmailChannel());

        assertDoesNotThrow(() -> payment.NotifyCustomer());
    }
}
