package session_17_equals_hashcode_generics.challenge.challenge_12;

public class Challenge12<K, V, N> {

    private K key;
    private V value;
    private N number;

    public Challenge12(K key, V value, N number) {
        this.key = key;
        this.value = value;
        this.number = number;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    public N getNumber() {
        return number;
    }

    @Override
    public String toString() {
        return "This element have " + key + " " + value + " and number  " + number;
    }

    public static void main(String[] args) {
        Challenge12<String, String, Integer> pair = new Challenge12<>("key1", "Value1", 0);

        System.out.println(pair);
    }
}