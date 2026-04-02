public class PaymentService {
    
    public void pay(String type, int amount) {
        try {
            Payment payment = new Payment(type, amount);

            // Service 단순화
            payment.executePayment();
            
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}