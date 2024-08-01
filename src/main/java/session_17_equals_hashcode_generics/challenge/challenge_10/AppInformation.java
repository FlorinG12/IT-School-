package session_17_equals_hashcode_generics.challenge.challenge_10;

public class AppInformation {
    private String name;
    private long id;
    private String dateOfLastUpdate;
    private String version;

    public AppInformation(String name, long id, String dateOfLastUpdate, String version) {
        this.name = name;
        this.id = id;
        this.dateOfLastUpdate = dateOfLastUpdate;
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public long getId() {
        return id;
    }

    public String getDateOfLastUpdate() {
        return dateOfLastUpdate;
    }

    public String getVersion() {
        return version;
    }

    @Override
    public String toString() {
        return "Name of the app: '" + name +
                "' Version: '" + version +
                "' Last Update: '" + dateOfLastUpdate +
                "' App id: '" + id+ "'";
    }
}

