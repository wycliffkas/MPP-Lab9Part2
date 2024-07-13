package lesson9.labs.prob9;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        printSquares(4);
    }

    public static void printSquares(int num) {
        Stream.iterate(1, n -> n + 1) // Start from 1 and increment by 1
                .limit(num)              // Limit to the first 'num' elements
                .forEach(n -> System.out.println(n * n));
    }
}
