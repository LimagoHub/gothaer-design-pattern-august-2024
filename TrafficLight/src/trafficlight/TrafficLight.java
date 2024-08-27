package trafficlight;

public class TrafficLight {

    final TrafficLightState red = new RedState(this) ;
    final TrafficLightState green = new GreenState(this) ;
    TrafficLightState current = red;

    public String getColor() {
        return current.getColor();
    }

    public void nextColor() {
        current.nextColor();
    }
}
