public class Main {
    public static void main(String[] args)
    {
        TrafficLightContext context = new TrafficLightContext();
        context.setState(new RedLightState());
        context.next();
        context.next();
        context.next();
        context.next();
    }
}
