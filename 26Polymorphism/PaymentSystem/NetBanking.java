package PaymentSystem;

public class NetBanking implements PaymentMethod{

    @Override
    public void processPayment(double amount) {
        System.out.println("Processing net banking payment of INR " + amount);
    }   

} 