package session_10_oop_concepts.practice;

public class AnimalMain {
    public static void main(String[] args) {
        Animal dog = new Animal("Rex", 12.5, 10);

        System.out.println(dog.name);
        System.out.println(dog.age);
        System.out.println(dog.weight);

        Human man = new Human();
        man.sum(22, 41);
        System.out.println(man.sum(12, 41));
    }
}

class Human {

    static String name;

    public int sum(int num1, int num2) {
        return num1 + num2;
    }
}
