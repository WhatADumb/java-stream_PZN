package study.java.stream;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class CreateStreamMap {
    @Test
    public void testStreamMapUpper() {
        List<String> names = List.of("frea", "saphire", "robin");

        Stream<String> nameStream = names.stream();
        Stream<String> namesUpper = nameStream.map(val -> val.toUpperCase());

        namesUpper.forEach(System.out::println);
        names.forEach(System.out::println);
    }
}
