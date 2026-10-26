package bridge;

public class OnlinePaymentNotification extends PaymentNotification {
    public OnlinePaymentNotification(NotificationChannel channel) {
        super(channel);
    }

    @Override
    public void NotifyCustomer() {
        channel.sendNotification("Payment was successful!");
    }
}
