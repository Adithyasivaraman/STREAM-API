import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Demonstrates filtering stream elements.
 *
 * UC2.4 - Filter even numbers using filter().
 *
 * @author Adithya
 * @version 4.0
 */
public class StreamOperations {

    public static void main(String[] args) {

        List<Integer> numbers =
                Arrays.asList(1, 2, 3, 4, 5, 6);

        List<Integer> evenNumbers =
                numbers.stream()
                        .filter(n -> n % 2 == 0)
                        .collect(Collectors.toList());

        evenNumbers.forEach(System.out::println);
    }
}
