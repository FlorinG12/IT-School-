package session_14_polymorphism.challenge.challenge1.reference_vs_object;

public class TestVehicle {

    public static void main(String[] args) {
        Vehicle car = new Car();
        Vehicle electricCar = new ElectricCar();
        Vehicle tractor = new Tractor();

        System.out.println(car.getFuel());
        System.out.println(electricCar.getFuel());
        System.out.println(tractor.getFuel());
    }
}
