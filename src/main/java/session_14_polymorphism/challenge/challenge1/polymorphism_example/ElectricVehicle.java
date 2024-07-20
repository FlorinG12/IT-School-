package session_14_polymorphism.challenge.challenge1.polymorphism_example;

public class ElectricVehicle extends Vehicle{

    @Override
    public  String name(){
        return "Tesla";
    }
    @Override
    public String fuelType(){
        return "electricity";
    }
    @Override
    public String horsePower(){
        return "570" ;
    }

}
