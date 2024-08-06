package session_17_equals_hashcode_generics.challenge.challenge_15;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class MyRepository<K, V> {

    private Map<K, V> repo;

    public MyRepository() {
        this.repo = new HashMap<>();
    }

    public void add(K key, V value) {
        repo.put(key, value);
    }

    public V remove(K key) {
        return repo.remove(key);
    }

    public V get(K key) {
        return repo.get(key);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyRepository<?, ?> that = (MyRepository<?, ?>) o;
        return Objects.equals(repo, that.repo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(repo);
    }

    @Override
    public String toString() {
        return "My repo is : " + repo;
    }
}