public class Main {
    public static void main(String[] args) {
        CompositeSmartComponent house = new CompositeSmartComponent();

        CompositeSmartComponent room1 = new CompositeSmartComponent();
        CompositeSmartComponent room2 = new CompositeSmartComponent();

        SmartComponent light1 = new SmartLight();
        SmartComponent light2 = new SmartLight();

        SmartComponent fan1 = new SmartFan();
        SmartComponent fan2 = new SmartFan();
        SmartComponent fan3 = new SmartFan();

        room1.addComponent(light1);
        room1.addComponent(fan1);
        room1.addComponent(fan2);

        room2.addComponent(light2);
        room2.addComponent(fan3);

        house.addComponent(room1);
        house.addComponent(room2);

        System.out.println("Turn on room1\n");
        room1.turnOn();

        System.out.println("Turn on room2\n");
        room2.turnOn();

        System.out.println("Turn off house\n");
        house.turnOff();
    }
}
