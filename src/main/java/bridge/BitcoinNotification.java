package bridge;

public class BitcoinNotification extends PaymentNotification {
    public BitcoinNotification(NotificationChannel channel) {
        super(channel);
    }

    @Override
    public void NotifyCustomer() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
