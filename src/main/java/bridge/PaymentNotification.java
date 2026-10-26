package bridge;

public class PaymentNotification {
    protected NotificationChannel channel;
    public PaymentNotification(NotificationChannel channel) {
        this.channel = channel;
    }

    public void NotifyCustomer(){
        channel.sendNotification("Payment Notification");
    }
}
