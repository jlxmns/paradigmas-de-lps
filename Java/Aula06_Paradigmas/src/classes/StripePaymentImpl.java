package classes;

public class StripePaymentImpl implements StripePayment {
    public void pay(int amount) {
        System.out.println("Pagamento de $" + amount + " via Stripe processado.");
    }
}
