package bridge;

import org.junit.jupiter.api.Test;

public class PushChannelTest {
        @Test
        public void testSendNotification() {
            PushChannel push = new PushChannel();
            push.sendNotification("Payment Successful!");
        }
}
