package bridge;

import javax.security.auth.callback.CallbackHandler;

public class BridgeDriver {
    public static void main(String[] args) {
        NotificationChannel email = new EmailChannel();
        NotificationChannel SMS = new SmsChannel();

        //Online + email
        OnlinePaymentNotification onlineEmail = new OnlinePaymentNotification(email);
        onlineEmail.NotifyCustomer();
        //Online + SMS
        OnlinePaymentNotification onlineSMS = new OnlinePaymentNotification(SMS);
        onlineSMS.NotifyCustomer();
        //Cash + email
        CashOnDeliveryNotification cashEmail = new CashOnDeliveryNotification(email);
        cashEmail.NotifyCustomer();
        //Cash + SMS
        CashOnDeliveryNotification cashSMS = new CashOnDeliveryNotification(SMS);
        cashSMS.NotifyCustomer();
        //Bitcoin + email
        BitcoinNotification BitcoinEmail = new BitcoinNotification(email);
        BitcoinEmail.NotifyCustomer();
        //Bitcoin + SMS
        BitcoinNotification BitcoinSMS = new BitcoinNotification(SMS);
        BitcoinSMS.NotifyCustomer();
    }
}
