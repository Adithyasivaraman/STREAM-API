import java.util.Arrays;
import java.util.List;

/**
 * Demonstrates sorting using streams.
 *
 * UC2.9 - Sort numbers in ascending order.
 */
public class StreamOperations {

    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(6, 3, 1, 5, 2, 4);

        numbers.stream()
                .sorted()
                .forEach(System.out::println);
    }
}
