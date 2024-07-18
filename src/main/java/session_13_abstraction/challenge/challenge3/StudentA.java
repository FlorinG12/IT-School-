package session_13_abstraction.challenge.challenge3;

public class StudentA extends Marks {
    private int geography;
    private int history;
    private int math;

    public StudentA(int geography, int history, int math) {
        this.geography = geography;
        this.history = history;
        this.math = math;
    }

    @Override
    public double getPercentage() {

        double total = geography + history + math;
        return total / 3.0;
    }
}
