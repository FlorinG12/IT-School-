package session_17_equals_hashcode_generics.challenge.challenge_8;

import java.util.Objects;

public class CacheObject {

    private  String key;
    private  String value;

    public CacheObject(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public String getValue() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CacheObject that = (CacheObject) o;
        return Objects.equals(key, that.key) && Objects.equals(value, that.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key);
    }

    @Override
    public String toString() {
        return "CacheObject{" +
                "key='" + key + '\'' +
                ", value='" + value + '\'' +
                '}';
    }
}