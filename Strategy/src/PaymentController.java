public class PaymentController {
    PaymentStrategy strategy;

    PaymentController(PaymentStrategy strategy)
    {
        this.strategy = strategy;
    }

    public void setStrategy(PaymentStrategy strategy)
    {
        this.strategy = strategy;
    }

    public void process()
    {
        strategy.process();
    }
}
