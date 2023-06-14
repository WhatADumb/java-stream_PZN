package study.java.stream;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class TransformationOperationsTest {
    @Test
    public void testMap() {
        List<String> names = List.of("killua", "naruto", "deku");
        names.stream()
            .map(name -> name.toUpperCase())
                .map(upper -> upper.length())
                    .forEach(System.out::println);
    }

    @Test
    public void testFlatMap() {
        List<String> names = List.of("killua", "naruto", "deku");
        names.stream()
            .map(name -> name.toUpperCase())
                .flatMap(upper -> Stream.of(upper, upper.length()))
                    .forEach(System.out::println);
    }
}
