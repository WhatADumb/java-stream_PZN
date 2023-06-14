package study.java.stream;

import java.util.List;

import org.junit.jupiter.api.Test;

public class CreateStreamPipeline {
    @Test
    public void testPipeline() {
        List<String> names = List.of("Aatrox", "Vayne", "Kai'sa");

        names.stream()
            .map(upper -> upper.toUpperCase())
                .map(prefix -> "Hello " + prefix)
                    .forEach(System.out::println);
    }
}
