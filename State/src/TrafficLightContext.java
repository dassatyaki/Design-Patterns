public class TrafficLightContext {

    private TrafficLightState currState;

    public void setState(TrafficLightState state) {
        currState = state;
    }

    public void next() {
        currState.next(this);
    }
}
