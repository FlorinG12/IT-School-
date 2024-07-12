package session_11_inheritance_encapsulation.practice;

public class Appliance {

    String brand = "Generic";

    Appliance() {
        System.out.println("Appliance is created");
    }

    void function() {
        System.out.println("Appliance is functioning");
    }
}

class Refrigerator extends Appliance {

    String brand = "Arctic";

    Refrigerator() {
        super();
        System.out.println("Refrigerator is created");
    }

    void displayBrand() {
        System.out.println("Refrigerator brand: " + brand);
        System.out.println("Appliance brand: " + super.brand);

    }

    void function() {
        System.out.println("Refrigerator is cooling");
    }

    void work() {
        function();
        super.function();
    }
}

class TextRefrigerator {

    public static void main(String[] args) {

        Refrigerator fridge = new Refrigerator();
        fridge.displayBrand();
        fridge.work();

    }
}