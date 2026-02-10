import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Demonstrates collecting stream results.
 *
 * UC2.3 - Store transformed values using collect().
 *
 * @author Adithya
 * @version 3.0
 */
public class StreamOperations {

    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> doubledNumbers =
                numbers.stream()
                        .map(n -> n * 2)
                        .collect(Collectors.toList());

        doubledNumbers.forEach(System.out::println);
    }
}
