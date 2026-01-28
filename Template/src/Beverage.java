public abstract class Beverage {

    void boilwater() {
        System.out.println("Boiling water");
    }

    void pour() {
        System.out.println("Pour in cup");
    }

    abstract void brew();

    void prepare() {
        boilwater();
        brew();
        pour();
    }
}
