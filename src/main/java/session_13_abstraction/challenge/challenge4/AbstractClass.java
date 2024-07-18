package session_13_abstraction.challenge.challenge4;

public abstract class AbstractClass {

    AbstractClass() {
        System.out.println("This is constructor of abstract class");
    }

    public abstract void a_method();

    public void nonAbstractMethod() {
        System.out.println("This is a normal method");
    }
}
