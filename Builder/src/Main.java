public class Main {

    public static void main(String[] args) {
        Car.Builder builder = new Car.Builder();

        Car car1 = builder.setEngine("v8").setColor("Yellow").setReg("KA51").build();
        Car car2 = builder.setEngine("v6").setColor("Red").setReg("WB").build();

        System.out.println(car1);
        System.out.println(car2);
    }
}
