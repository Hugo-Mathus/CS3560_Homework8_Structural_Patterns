package bridge;

import javax.security.auth.callback.CallbackHandler;

public class BridgeDriver {
    public static void main(String[] args) {
        NotificationChannel email = new EmailChannel();
        NotificationChannel SMS = new SmsChannel();

        OnlinePaymentNotification onlineEmail = new OnlinePaymentNotification(email);
        onlineEmail.NotifyCustomer();

        OnlinePaymentNotification onlineSMS = new OnlinePaymentNotification(SMS);
        onlineSMS.NotifyCustomer();

        CashOnDeliveryNotification cashEmail = new CashOnDeliveryNotification(email);
        cashEmail.NotifyCustomer();

        CashOnDeliveryNotification cashSMS = new CashOnDeliveryNotification(SMS);
        cashSMS.NotifyCustomer();


    }
}
