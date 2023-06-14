package study.java.stream;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class GroupingOperationsTest {
    @Test
    public void testGroup() {
        Map<String, List<Integer>> data = Stream.of(1,2,3,4,5,6,7,8,9,10)
            .collect(Collectors.groupingBy(key -> key % 2 == 0 ? "Genap" : "Ganjil"));
        
        System.out.println(data);
    }

    @Test
    public void testPartition() {
        Map<Boolean, List<String>> data = Stream.of("AAA", "bbb", "CCC", "ddd")
            .collect(Collectors.partitioningBy(key -> key.toUpperCase().equals(key)));
        
        System.out.println(data);
    }
}
