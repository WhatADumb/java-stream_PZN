package study.java.stream;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.junit.jupiter.api.Test;

public class CollectOperationTest {
    public Stream<String> getStream(){
        return Stream.of("Aatrox", "Vayne", "Lucian");
    }
    
    @Test
    public void testCollectListAndSet() {
        List<String> list = getStream().collect(Collectors.toList());
        System.out.println(list);
        List<String> immutableList = getStream().collect(Collectors.toUnmodifiableList());
        System.out.println(immutableList);

        Set<String> set = getStream().collect(Collectors.toSet());
        System.out.println(set);
        Set<String> immutableSet = getStream().collect(Collectors.toUnmodifiableSet());
        System.out.println(immutableSet);
    }

    @Test
    public void testCollectMap() {
        Map<String, String> map = getStream().collect(Collectors.toMap(
            name -> name,
            name -> name
        ));

        System.out.println(map);
    }
}
