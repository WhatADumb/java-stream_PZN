package study.java.stream;

import java.util.List;

import org.junit.jupiter.api.Test;

public class CheckOperationTest {
    @Test
    public void testAnyMatch() {
        boolean result = List.of(1,2,3,4,5,6,7).stream()
            .anyMatch(val -> val > 9);
        System.out.println(result);
    }

    @Test
    public void testAllMatch() {
        boolean result = List.of(1,2,3,4,5,6,7,8,9,10).stream()
            .allMatch(val -> val > 0);
        System.out.println(result);
    }

    @Test
    public void testNoneMatch() {
        boolean result = List.of(1,2,3,4,5,6,7).stream()
            .noneMatch(val -> val > 9);
        System.out.println(result);
    }
}
