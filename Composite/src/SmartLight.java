public class SmartLight implements SmartComponent{
    @Override
    public void turnOn() {
        System.out.println("Light is on");
    }

    @Override
    public void turnOff() {
        System.out.println("Light is off");
    }
}
