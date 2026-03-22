package PaymentSystem;

public class CreditCard implements PaymentMethod {
    String cardNumber;
    String cardHolderName;
    String expiryDate;

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing credit card payment of INR " + amount);
    }

    
}
