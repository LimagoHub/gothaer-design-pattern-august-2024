package trafficlight;

public class GreenState extends AbstractTrafficLightState {
    public GreenState(final TrafficLight trafficLight) {
        super(trafficLight);
    }

    @Override
    public String getColor() {
        return "GREEN";
    }

    @Override
    public void nextColor() {
        getTrafficLight().current = getTrafficLight().red;
    }
}
