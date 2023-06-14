package study.java.stream;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;

public class RetriveingOperationsTest {
    @Test
    public void testLimit() {
        List.of("alpha", "beta", "celeron", "delta").stream()
            .limit(3)
                .forEach(System.out::println);
    }

    @Test
    public void testSkip() {
        List.of("alpha", "beta", "celeron", "delta").stream()
            .skip(3)
                .forEach(System.out::println);
    }

    @Test
    public void testTakeWhile() {
        List.of("alpha", "beta", "celeron", "delta").stream()
            .takeWhile(data -> data.length() <= 5)
                .forEach(System.out::println);
    }

    @Test
    public void testDropWhile() {
        List.of("alpha", "beta", "celeron", "delta").stream()
            .dropWhile(data -> data.length() <= 6)
                .forEach(System.out::println);
    }

    @Test
    public void testFindAny() {
        Optional<String> names = List.of("alpha", "beta", "celeron", "delta").stream()
            .findAny();

        names.ifPresent(name -> {
            System.out.println(name);
        });
    }

    @Test
    public void testFindFirst() {
        Optional<String> names = List.of("alpha", "beta", "celeron", "delta").stream()
            .findFirst();

        names.ifPresent(name -> {
            System.out.println(name);
        });
    }
}
