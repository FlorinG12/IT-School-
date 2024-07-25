package session_16_collections_framework.practice;

import java.util.HashSet;
import java.util.Set;

public class SetPractice {

    public static void main(String[] args) {
        Set<String> products = initializeSet();

        Set<String> product2 = new HashSet<>();
        product2.add("P500");
        product2.add("P501");
        product2.add("P502");

        displayProducts(mergeProducts(products,product2));
    }

    public static Set<String> mergeProducts(Set<String> firstSet, Set<String> secondSet) {
        Set<String> result = new HashSet<>(firstSet);
        result.addAll(secondSet);
        return result;
    }

    public static void displayProducts(Set<String> products) {
        for (String product : products) {
            System.out.print(product+ " ");
        }
    }

    public static Set<String> initializeSet() {
        Set<String> products = new HashSet<>();
        products.add("P100");
        products.add("P101");
        products.add("P102");
        products.add("P103");

        return products;
    }
}