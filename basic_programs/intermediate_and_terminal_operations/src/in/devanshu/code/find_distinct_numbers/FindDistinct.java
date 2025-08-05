package in.devanshu.code.find_distinct_numbers;

import java.util.List;
import java.util.stream.Collectors;

public class FindDistinct {
    public static void main(String[] args) {
        List<Integer> numbers = List.of(1,2,3,2,3,4,5,6,4);
        List<Integer> distinctNumbers = numbers.stream().distinct().collect(Collectors.toList());

        System.out.println("Origional List : " + numbers);
        System.out.println("Distinct List : " + distinctNumbers);
    }
}
