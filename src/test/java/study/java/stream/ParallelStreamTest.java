package study.java.stream;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class ParallelStreamTest {
    @Test
    public void testSequential() {
        Stream.of(1,2,3,4,5,6,7,8,9,10)
            .forEach(System.out::println);
    }

    @Test
    public void testParallel() {
        Stream.of(1,2,3,4,5,6,7,8,9,10)
            .parallel()
                .forEach(number ->{
                    System.out.println(Thread.currentThread().getName() + ": " + number);
                });
    }
}
