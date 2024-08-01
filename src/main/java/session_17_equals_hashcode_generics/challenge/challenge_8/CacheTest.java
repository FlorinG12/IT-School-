package session_17_equals_hashcode_generics.challenge.challenge_8;

public class CacheTest {

    public static void main(String[] args) {
        CacheObject cache1 = new CacheObject("obj1", "Version 1.52");
        CacheObject cache2 = new CacheObject("obj1", "Version 1.53");

        if (cache1.hashCode() == cache2.hashCode()) {
            System.out.println(cache2.getValue() + " Override " + cache1.getValue());
        } else {
            System.out.println("Cannot override ");
        }
    }
}