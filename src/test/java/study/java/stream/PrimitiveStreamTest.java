package study.java.stream;

import java.util.stream.DoubleStream;
import java.util.stream.IntStream;

import org.junit.jupiter.api.Test;

public class PrimitiveStreamTest {
    @Test
    public void testCreate() {
        IntStream intStream = IntStream.rangeClosed(1, 100);
        intStream.forEach(System.out::println);

        DoubleStream doubleStream = DoubleStream.of(1,2,3,4,5);
        doubleStream.forEach(System.out::println);
    }

    @Test
    public void testAvg() {
        IntStream intStream = IntStream.rangeClosed(1, 100);
        intStream.average().ifPresent(System.out::println);
    }
}
