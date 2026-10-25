package bridge;

import org.junit.jupiter.api.Test;

public class EmailChannelTest {
    @Test
    public void testSendNotification(){
        EmailChannel email = new EmailChannel();
        email.sendNotification("PaymentSuccessful");
    }
}
