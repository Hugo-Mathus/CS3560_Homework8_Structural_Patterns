package bridge;

public class CashOnDeliveryNotification extends PaymentNotification {
    public CashOnDeliveryNotification(NotificationChannel channel) {
        super(channel);
    }

    @Override
    public void NotifyCustomer() {
        channel.sendNotification("Order is confirmed! Payment will be collected upon delivery. ");
    }
}
