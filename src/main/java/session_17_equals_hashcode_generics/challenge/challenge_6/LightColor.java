package session_17_equals_hashcode_generics.challenge.challenge_6;

public enum LightColor {

    RED("Stop", 30),
    YELLOW("Caution", 5),
    GREEN("Go", 45);

    private final String warning;
    private final int seconds;

    LightColor(String warning, int seconds) {
        this.warning = warning;
        this.seconds = seconds;
    }

    public String getWarning() {
        return warning;
    }

    public int getSeconds() {
        return seconds;
    }

    @Override
    public String toString() {
        return super.toString() + " " + warning + " " + seconds + " sec";
    }
}