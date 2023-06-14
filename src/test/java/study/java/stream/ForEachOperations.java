package study.java.stream;

import java.util.List;

import org.junit.jupiter.api.Test;

public class ForEachOperations {
    @Test
    public void testUsingForEachWithoutIntermediate() {
        List.of("joker", "penguin", "riddler", "two face", "catwoman").stream()
            .map(name -> {
                System.out.println("Names Before Upper: " + name);
                var upper = name.toUpperCase();
                System.out.println("Names After Upper: " + upper);
                return upper;
            }).forEach(System.out::println);
    }

    @Test
    public void testUsingForEachWithIntermediate() {
        List.of("joker", "penguin", "riddler", "two face", "catwoman").stream()
            .peek(data -> System.out.println("Before Upper: " + data))
            .map(String::toUpperCase)
            .peek(data -> System.out.println("After Upper: " + data))
            .forEach(System.out::println);
    }
}
