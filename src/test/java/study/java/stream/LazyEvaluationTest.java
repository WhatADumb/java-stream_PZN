package study.java.stream;

import java.util.List;

import org.junit.jupiter.api.Test;

public class LazyEvaluationTest {
    @Test
    public void testIntermediateOperations() {
        List<String> names = List.of("piko", "poro", "mino");

        names.stream().
        map(name -> {
            System.out.println("Change " + name + " into uppercase");
            return name.toUpperCase();
        }).map(upper -> {
            System.out.println("Adding prefix hello into " + upper);
            return "Hello " + upper;
        });
    }

    @Test
    public void testTerminalOperations() {
        List<String> names = List.of("piko", "poro", "mino");

        names.stream().
        map(name -> {
            System.out.println("Change " + name + " into uppercase");
            return name.toUpperCase();
        }).map(upper -> {
            System.out.println("Adding prefix hello into " + upper);
            return "Hello " + upper;
        }).forEach(System.out::println);
    }
}
