package session_17_equals_hashcode_generics.challenge.challenge_5;

public class TestProduct {

    public static void main(String[] args) {
        Product product = new Product(12415511L);
        Product anotherProduct = new Product(12415511L);

        if (product.equals(anotherProduct) || product.hashCode() == anotherProduct.hashCode()) {
            System.out.println("Products are equal and have the same hashcode");
        } else {
            System.out.println("Products are not equal");
        }
    }
}