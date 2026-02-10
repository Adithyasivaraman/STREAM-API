import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Demonstrates finding elements in streams.
 *
 * UC2.5 - Find first even number using findFirst().
 *
 * @author Adithya
 * @version 5.0
 */
public class StreamOperations {

    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(1, 2, 3, 4, 5, 6);

        Optional<Integer> firstEven =
                numbers.stream()
                        .filter(n -> n % 2 == 0)
                        .findFirst();

        firstEven.ifPresent(System.out::println);
    }
}
