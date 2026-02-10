import java.util.Arrays;
import java.util.List;

/**
 * Demonstrates Stream transformation.
 *
 * UC2.2 - Transform elements using map().
 *
 * @author Adithya
 * @version 2.0
 */
public class StreamOperations {

    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(1, 2, 3, 4, 5, 6);

        numbers.stream()
                .map(n -> n * 2)
                .forEach(System.out::println);
    }
}
