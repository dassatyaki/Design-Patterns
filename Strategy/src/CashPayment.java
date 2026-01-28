public class CashPayment implements PaymentStrategy{
    @Override
    public void process()
    {
        System.out.println("Processing cash");
    }
}
