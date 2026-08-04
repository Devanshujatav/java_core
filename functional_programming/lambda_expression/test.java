import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Consumer;

public class test {
    public static void main(String[] args) {
        // Predicate (Filter values)
        Predicate<Integer> isEven = (n) -> n % 2 == 0;
        System.out.println(isEven.test(4)); // true
        System.out.println(isEven.test(5)); // false

        // Function (Convert String to Integer length)
        Function<String, Integer> stringLength = (s) -> s.length();
        System.out.println(stringLength.apply("Hello")); // 5

        // Function (Convert Integer to String)
        Function<Integer, String> intToString = (n) -> Integer.toString(n);
        System.out.println(intToString.apply(123)); // "123"\

        // Consumer (Print message)
        Consumer<String> printMessage = (message) -> System.out.println(message);
        printMessage.accept("Hello, World!"); // Prints "Hello, World!"




    }    
}


