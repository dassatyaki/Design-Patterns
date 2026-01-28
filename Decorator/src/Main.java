public class Main{
    public static void main(String[] args){
        Pizza margharita = new Margharita();
        margharita = new Cheese(margharita);
        margharita = new Mushroom(margharita);

        System.out.println(margharita.getName() + " " + margharita.getCost());

        Pizza pepperoni = new Pepperoni();
        pepperoni = new Cheese(pepperoni);
        pepperoni = new Cheese(pepperoni);

        System.out.println(pepperoni.getName() + " " + pepperoni.getCost());
    }
}
