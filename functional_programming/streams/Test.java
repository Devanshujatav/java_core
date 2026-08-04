import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Test{
    public static void main(String[] args) {
        // Filter and Print Names
        List<String> names = List.of("John" , "Alex" , "Jill" , "Bob");
        names.stream().filter(name -> name.startsWith("J")).forEach(System.out::println);

        // Square Even Numbers
        // List<Integer> numbers = List.of(1,2,3,4,5,6);

        // List<Integer> squares = numbers.stream().filter(n -> n % 2 == 0).map(n -> n*n).collect(Collectors.toList());

        // System.out.println(squares);
    
        // Sum Using Reduce
        List<Integer> numbers = List.of(1,2,3,4);
        int sum = numbers.stream().reduce(0, (a,b) -> a+b);
        System.out.println(sum);    

    
    }
}