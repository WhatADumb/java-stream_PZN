package study.java.stream;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class CreateStreamTest {
    @Test
    public void testCreateStreamData() {
        Stream<String> insertOn = Stream.of("cable");
        Stream<String> insertEmpty = Stream.empty();
        Stream<String> insertNull = Stream.ofNullable(null);
    }

    @Test
    public void testStreamFromArray() {
        Stream<String> arrStreamStr = Stream.of("alpha", "beta", "celeron");
        arrStreamStr.forEach(System.out::println);

        Stream<Integer> arrStreamInt = Stream.of(1,2,3,4,5,6,7,8,9);
        arrStreamInt.forEach(System.out::println);

        String[] sampleArr = {"data-1", "data-2", "data-3"};
        Stream<String> dataStreamArr = Arrays.stream(sampleArr);
        dataStreamArr.forEach(System.out::println);
    }

    @Test
    public void testStreamFromCollection() {
        Collection<String> coll = List.of("sample1", "sample2", "sample3");
        Stream<String> collStream = coll.stream();
        collStream.forEach(System.out::println);
    }

    @Test
    public void testCreateInfiniteStream() {
        Stream<String> inf1 = Stream.generate(() -> "sample dummy");
        // inf1.forEach(System.out::println);

        Stream<Integer> inf2 = Stream.iterate(1, data -> data + 2);
        // inf2.forEach(System.out::println);
    }
}