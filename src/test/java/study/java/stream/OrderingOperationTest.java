package study.java.stream;

import java.util.Comparator;
import java.util.List;

import org.junit.jupiter.api.Test;

public class OrderingOperationTest {
    @Test
    public void testSorted() {
        List.of("joker", "penguin", "riddler", "two face", "catwoman").stream()
            .sorted()
                .forEach(System.out::println);
    }

    @Test
    public void testSortedWithComparator() {
        Comparator<String> reverse = Comparator.reverseOrder();

        List.of("joker", "penguin", "riddler", "two face", "catwoman").stream()
            .sorted(reverse)
                .forEach(System.out::println);
    }
}
