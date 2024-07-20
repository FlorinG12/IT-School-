package session_14_polymorphism.challenge.challenge1.polymorphism_example;

public class DieselVehicle extends  Vehicle{

    @Override
    public String name() {
        return "BMW M3";
    }

    @Override
    public String fuelType() {
        return "Diesel";
    }

    @Override
    public String horsePower() {
return  "800";
    }
}
