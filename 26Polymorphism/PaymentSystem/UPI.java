package PaymentSystem;

public class UPI implements PaymentMethod {
    String upiId;
    String upiProvider;

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing UPI payment of INR " + amount);
    }
    
}
