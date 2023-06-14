package study.java.stream;

import java.util.Comparator;
import java.util.List;

import org.junit.jupiter.api.Test;

public class AgregateOperationTest {
    @Test
    public void testAgregate() {
        List<String> data = List.of("alpha", "beta", "celeron", "delta");

        data.stream().max(Comparator.naturalOrder())
            .ifPresent(System.out::println);

        data.stream().min(Comparator.naturalOrder())
            .ifPresent(System.out::println);

        var maxData = data.stream().count();
        System.out.println(maxData);
    }

    @Test
    public void testAgregateReduce() {
        List<Integer> value = List.of(1,2,3,4,5);

        var sum = value.stream().reduce(0, (val, item) -> val + item);
        System.out.println(sum);

        var factorial = value.stream().reduce(1, (val, item) -> val * item);
        System.out.println(factorial);
    }
}
