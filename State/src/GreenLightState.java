public class GreenLightState implements TrafficLightState{
    public void next(TrafficLightContext context)
    {
        System.out.println("Light changing from green to red");
        context.setState(new YellowLightState());
    }
}
