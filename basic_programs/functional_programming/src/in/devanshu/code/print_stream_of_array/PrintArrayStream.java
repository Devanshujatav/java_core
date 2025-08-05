package in.devanshu.code.print_stream_of_array;

import java.util.List;

public class PrintArrayStream {
    public static void main(String[] args) {
        List<String> fruits = List.of("apple" , "mango" , "banana");
        fruits.stream().forEach(fruit -> System.out.println(fruit));
    }
}
