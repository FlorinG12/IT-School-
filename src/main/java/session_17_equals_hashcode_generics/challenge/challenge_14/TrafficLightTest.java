package session_17_equals_hashcode_generics.challenge.challenge_14;

public class TrafficLightTest {

    private TrafficLight trafficLight;

    public TrafficLightTest(TrafficLight trafficLight) {
        this.trafficLight = trafficLight;
    }

    @Override
    public String toString() {
        String light;
        switch (trafficLight) {
            case RED -> light = "You need to Wait";
            case YELLOW -> light = "Be ready";
            case GREEN -> light = "You can cross";
            default -> light = "Unknown light";
        }
        return "Traffic Light is : " + trafficLight + " " + light;
    }

    public static void main(String[] args) {
        TrafficLightTest light = new TrafficLightTest(TrafficLight.RED);
        TrafficLightTest light1 = new TrafficLightTest(TrafficLight.YELLOW);
        TrafficLightTest light2 = new TrafficLightTest(TrafficLight.GREEN);

        System.out.println(light);
        System.out.println(light1);
        System.out.println(light2);
    }
}