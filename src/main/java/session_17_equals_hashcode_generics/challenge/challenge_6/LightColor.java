package session_17_equals_hashcode_generics.challenge.challenge_6;

public enum LightColor {
    RED("Stop", 30),
    YELLOW("Caution", 5),
    GREEN("Go", 45);


    private final String action;
    private final int seconds;

    LightColor(String action, int seconds) {
        this.action = action;
        this.seconds = seconds;
    }

    public String getAction() {
        return action;
    }

    public int getSeconds() {
        return seconds;
    }

    @Override
    public String toString() {
        return super.toString() + " " + action + " " + seconds + " sec";
    }
}
