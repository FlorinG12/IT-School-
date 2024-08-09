package session_19.challenge;

import java.util.stream.IntStream;

public class Challenge3 {

    public static void main(String[] args) {

        IntStream.range(1, 100)
                .filter(Challenge3::isPrime)
                .forEach(System.out::println);

    }

    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        } else if (n == 1 || n % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}