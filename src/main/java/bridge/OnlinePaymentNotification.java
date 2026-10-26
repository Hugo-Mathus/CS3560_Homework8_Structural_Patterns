package bridge;

public class OnlinePaymentNotification extends PaymentNotification {
    public OnlinePaymentNotification(NotificationChannel channel) {
        super(channel);
    }

    @Override
    public void NotifyCustomer() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
