package trafficlight;

public abstract class AbstractTrafficLightState implements TrafficLightState {

    private final TrafficLight trafficLight;

    public AbstractTrafficLightState(final TrafficLight trafficLight) {
        this.trafficLight = trafficLight;
    }

    public final TrafficLight getTrafficLight() {
        return trafficLight;
    }

    @Override
    public String getColor() {
        throw new UnsupportedOperationException("Diese Operation macht in diesem Zustand keinnen Sinn!");
    }

    @Override
    public void nextColor() {
        throw new UnsupportedOperationException("Diese Operation macht in diesem Zustand keinnen Sinn!");
    }
}
