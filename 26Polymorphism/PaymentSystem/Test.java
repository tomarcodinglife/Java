package PaymentSystem;

public class Test {

    public static void main(String[] args) {
        PaymentMethod payment;

        payment = new CreditCard();
        payment.processPayment(1500.00);

        payment = new NetBanking();
        payment.processPayment(2500.00);

        payment = new UPI();
        payment.processPayment(500.00);




    }

    
}
