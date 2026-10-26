package bridge;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BitcoinTest {
    @Test
    public void testBitcoin() {
        BitcoinNotification payment = new BitcoinNotification(new SmsChannel());
        assertDoesNotThrow(() -> payment.NotifyCustomer());
    }
}
