public class CreditCardPayment implements PaymentStrategy{
    @Override
    public void process()
    {
        System.out.println("Processing card");
    }
}
