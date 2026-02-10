import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;

/**
 * Demonstrates sum and average operations.
 *
 * UC2.7 - Find sum and average of even numbers.
 */
public class StreamOperations {

    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(1, 2, 3, 4, 5, 6);

        int sum =
                numbers.stream()
                        .filter(n -> n % 2 == 0)
                        .mapToInt(Integer::intValue)
                        .sum();

        OptionalDouble average =
                numbers.stream()
                        .filter(n -> n % 2 == 0)
                        .mapToInt(Integer::intValue)
                        .average();

        System.out.println("Sum of even numbers: " + sum);
        average.ifPresent(avg ->
                System.out.println("Average of even numbers: " + avg));
    }
}
