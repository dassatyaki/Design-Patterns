public class Main {
    public static void main(String[] args)
    {
        CreditCardPayment cardPayment = new CreditCardPayment();
        CashPayment cashPayment = new CashPayment();
        PaymentController controller = new PaymentController(cardPayment);
        controller.process();
        controller.setStrategy(cashPayment);
        controller.process();
    }
}
