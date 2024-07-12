package session_11_inheritance_encapsulation.challenge.vehicle.single_inheritance;

public class BikeTest {

    public static void main(String[] args) {

        Bicycle bicycle = new Bicycle();
        bicycle.setSpeed(50);
        System.out.println("Current speed " + bicycle.getSpeed());
        System.out.println("Gear after change " + bicycle.changeGear());

        bicycle.applyBreak( 40);
        System.out.println("Current speed " + bicycle.getSpeed());
        System.out.println("Gear after change " + bicycle.changeGear());

           bicycle.speedUp( 10);
        System.out.println("Current speed " + bicycle.getSpeed());
        System.out.println("Gear after change " + bicycle.changeGear());

        MountainBike mountainBike = new MountainBike();
        mountainBike.setSpeed(15);
        mountainBike.setSuspension("Off Road") ;
        System.out.println("Current speed " + mountainBike.getSpeed());
        System.out.println("Gear after change " + mountainBike.changeGear());
        System.out.println("On this type of road: "+mountainBike.getSuspension()+ " You have " + mountainBike.adjustSuspension(mountainBike.getSuspension()));
    }
}
