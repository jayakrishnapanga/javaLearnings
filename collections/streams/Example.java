import java.util.*;
import java.util.function.Function;
import java.util.stream.*;

public class Example {
    public static void main(String[] args) {
        String s = "swiss";

        // Character result =
        //     s.chars() // IntStream
        //      .mapToObj(c -> (char) c)
        //      .collect(Collectors.groupingBy(
        //              Function.identity(),
        //              LinkedHashMap::new,
        //              Collectors.counting()
        //      ))
        //      .entrySet()
        //      .stream()
        //      .filter(e -> e.getValue() == 1)
        //      .map(Map.Entry::getKey)
        //      .findFirst()
        //      .orElse(null);

        // System.out.println(result);

        Character ch = s.chars()
        .mapToObj(c -> (char) c)
        .filter(c -> s.indexOf(c) == s.lastIndexOf(c))
        .findFirst()
        .orElse(null);

       System.out.println(ch);
    }
}
