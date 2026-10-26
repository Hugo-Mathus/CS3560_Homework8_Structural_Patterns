package bridge;

public class CashOnDeliveryNotification extends PaymentNotification {
    public CashOnDeliveryNotification(NotificationChannel channel) {
        super(channel);
    }

    @Override
    public void NotifyCustomer() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
