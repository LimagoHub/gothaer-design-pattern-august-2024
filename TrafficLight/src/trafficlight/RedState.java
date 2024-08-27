package trafficlight;

public class RedState extends AbstractTrafficLightState{
    public RedState(final TrafficLight trafficLight) {
        super(trafficLight);
    }

    @Override
    public String getColor() {
        return "RED";
    }

    @Override
    public void nextColor() {
        getTrafficLight().current = getTrafficLight().green;
    }
}
