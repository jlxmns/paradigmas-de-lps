package classes;

public class PaypalAdapter implements StripePayment {
    private PaypalPayment paypalPayment;
    public PaypalAdapter(PaypalPayment paypalPayment) {
        this.paypalPayment = paypalPayment;
    }

    public void pay(int amount) {
        paypalPayment.sendPayment(amount);
    }
}
