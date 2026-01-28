public class RedLightState implements TrafficLightState{
    public void next(TrafficLightContext context)
    {
        System.out.println("Light changing from red to green");
        context.setState(new GreenLightState());
    }
}
