public class Cheese extends PizzaDecorator{
    public Cheese(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getName() {
        return pizza.getName() + ", cheeze";
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 20;
    }
}
