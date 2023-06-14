package study.java.stream;

import java.util.List;

import org.junit.jupiter.api.Test;

public class FilteringOperationsTest {
    @Test
    public void testFilter() {
        List.of("Corsair", "Lenovo", "ASUS", "LogiTech", "V-GEN").stream()
            .filter(result -> result.length() < 5)
                .forEach(System.out::println);
        
        List.of(1,2,3,4,5,6,7,8,9,10).stream()
            .filter(val -> val % 2 == 1)
                .forEach(System.out::println);
    }

    @Test
    public void testDistinct() {
        List.of("Corsair", "V-GEN", "Corsair", "LogiTech", "V-GEN").stream()
            .distinct()
                .forEach(System.out::println);
    }
}
