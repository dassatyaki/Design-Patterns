public class YellowLightState implements TrafficLightState{
    public void next(TrafficLightContext context)
    {
        System.out.println("Light changing from yellow to red");
        context.setState(new RedLightState());
    }
}
