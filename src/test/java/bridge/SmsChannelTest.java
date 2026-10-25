package bridge;

import org.junit.jupiter.api.Test;

public class SmsChannelTest {
    @Test
    public void testSendNotification() {
        SmsChannel sms = new SmsChannel();
        sms.sendNotification("Payment Successful!");
    }
}
