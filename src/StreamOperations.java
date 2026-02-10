import java.util.Arrays;
import java.util.List;

/**
 * Demonstrates Java Stream creation and iteration.
 *
 * UC2.1 - Iterate stream using forEach.
 *
 * @author Adithya
 * @version 1.0
 */
public class StreamOperations {

    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(1, 2, 3, 4, 5, 6);

        numbers.stream()
                .forEach(System.out::println);
    }
}
