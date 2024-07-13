package lesson9.labs.prob10c;

import java.util.IntSummaryStatistics;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Stream<Integer> myIntStream = Stream.of(3, 5, 7, 2, 8);

        IntSummaryStatistics stats = myIntStream.collect(Collectors.summarizingInt(Integer::intValue));

        int max = stats.getMax();
        int min = stats.getMin();

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
