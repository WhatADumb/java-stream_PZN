package study.java.stream;

import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class CreateStreamBuilderTest {
    @Test
    public void testStreamBuilder() {
        Stream.Builder<String> str = Stream.builder();
        str.accept("Sample-1");
        str.add("sample-2").add("sample-3");

        Stream<String> build = str.build();
        build.forEach(System.out::println);
    }

    @Test
    public void testSimplify() {
        Stream<Object> str = Stream.builder().add("data-1").add("data-2").build();
        str.forEach(System.out::println);
    }
}
