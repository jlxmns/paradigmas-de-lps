import classes.PaypalAdapter;
import classes.PaypalPayment;
import classes.StripePayment;
import classes.StripePaymentImpl;

public class Main {
    public static void main(String[] args) {
        StripePayment stripePayment = new StripePaymentImpl();
        PaypalPayment paypal = new PaypalPayment();
        StripePayment paypalAdapter = new PaypalAdapter(paypal);

        processPayment(stripePayment, 100);
        processPayment(paypalAdapter, 200);
    }

    public static void processPayment(StripePayment paymentSystem, int amount) {
        paymentSystem.pay(amount);
    }
}