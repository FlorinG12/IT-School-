package session_13_abstraction.challenge.challenge3;

public class StudentB extends Marks {
    private int geography;
    private int history;
    private int math;
    private int biology;

    public StudentB(int geography, int history, int math, int biology) {
        this.geography = geography;
        this.history = history;
        this.math = math;
        this.biology = biology;
    }

    @Override
    public double getPercentage() {

        double total = geography + history + math + biology;
        return total / 4.0;
    }
}
