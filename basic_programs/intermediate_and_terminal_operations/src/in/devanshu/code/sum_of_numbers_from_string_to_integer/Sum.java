package in.devanshu.code.sum_of_numbers_from_string_to_integer;

import java.util.List;

public class Sum {
    public static void main(String[] args) {
        List<String> numbers = List.of("1" , "2" , "3" , "4" , "5");

        numbers.stream().map(Integer::parseInt).map(num -> Math.pow(num , 2)).reduce((a,b)->a+b).ifPresent(System.out::println);
    }
}
