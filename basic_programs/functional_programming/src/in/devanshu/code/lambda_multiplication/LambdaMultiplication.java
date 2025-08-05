package in.devanshu.code.lambda_multiplication;

import java.util.function.BinaryOperator;

public class LambdaMultiplication {
    public static void main(String[] args) {
        BinaryOperator<Integer> multiply = (a,b) -> a*b;
        int result = multiply.apply(2,3);
        System.out.println(result);
    }
}
