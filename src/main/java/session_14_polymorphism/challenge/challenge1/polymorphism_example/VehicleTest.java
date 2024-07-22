package session_14_polymorphism.challenge.challenge1.polymorphism_example;

public class VehicleTest {

    public static void main(String[] args) {
        printCar(new ElectricVehicle());
        printCar(new DieselVehicle());
        printCar(new GasolineVehicle());
    }

    public static void printCar(Vehicle vehicle) {
        System.out.println("My " + vehicle.name() + " with " + vehicle.horsePower() + "hp is using " + vehicle.fuelType() + " fuel type");
    }
}
