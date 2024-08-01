package session_17_equals_hashcode_generics.challenge.challenge_5;

import java.util.Objects;

public class Product {

    private String name;
    private double price;
    private long id;

    public Product(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return id == product.id;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}