package lesson9.labs.prob10b;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        String result = Stream.of("Bill", "Thomas", "Mary")
                .collect(Collectors.joining(", "));

        System.out.println(result);
    }
}
