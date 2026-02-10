import java.util.Arrays;
import java.util.List;

/**
 * Demonstrates match operations in streams.
 *
 * UC2.8 - allMatch and anyMatch usage.
 */
public class StreamOperations {

    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(1, 2, 3, 4, 5, 6);

        boolean allEven =
                numbers.stream()
                        .allMatch(n -> n % 2 == 0);

        boolean anyEven =
                numbers.stream()
                        .anyMatch(n -> n % 2 == 0);

        System.out.println("All numbers even? " + allEven);
        System.out.println("Any number even? " + anyEven);
    }
}
