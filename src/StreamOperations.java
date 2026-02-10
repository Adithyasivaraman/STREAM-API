import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Demonstrates finding min and max values in streams.
 *
 * UC2.6 - Find min and max even numbers.
 *
 * @author Adithya
 * @version 6.0
 */
public class StreamOperations {

    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(1, 2, 3, 4, 5, 6);

        Optional<Integer> minEven =
                numbers.stream()
                        .filter(n -> n % 2 == 0)
                        .min(Integer::compareTo);

        Optional<Integer> maxEven =
                numbers.stream()
                        .filter(n -> n % 2 == 0)
                        .max(Integer::compareTo);

        minEven.ifPresent(min ->
                System.out.println("Min Even: " + min));

        maxEven.ifPresent(max ->
                System.out.println("Max Even: " + max));
    }
}
