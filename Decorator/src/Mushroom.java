public class Mushroom extends PizzaDecorator{
    public Mushroom(Pizza pizza) {
        super(pizza);
    }

    @Override
    public String getName() {
        return pizza.getName() + ", mushroom";
    }

    @Override
    public int getCost() {
        return pizza.getCost() + 10;
    }
}
