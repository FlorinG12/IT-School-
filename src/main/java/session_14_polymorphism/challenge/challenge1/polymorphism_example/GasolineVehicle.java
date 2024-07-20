package session_14_polymorphism.challenge.challenge1.polymorphism_example;

public class GasolineVehicle  extends Vehicle{

    @Override
    public String name() {
        return "Mustang";
    }

    @Override
    public String fuelType() {
        return "Gasoline";
    }

    @Override
    public String horsePower() {
        return "900";
    }
}
