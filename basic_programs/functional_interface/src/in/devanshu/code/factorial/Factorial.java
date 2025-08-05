package in.devanshu.code.factorial;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Factorial {
    public static void main(String[] args) {
        System.out.print("Enter a Number : ");
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        IntStream.rangeClosed(2 , number).reduce((a,b) -> a*b).ifPresent(System.out::println);
    }
}
