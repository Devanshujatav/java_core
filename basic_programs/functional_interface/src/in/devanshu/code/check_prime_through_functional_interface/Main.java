package in.devanshu.code.check_prime_through_functional_interface;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        CheckPrime check = num ->{
            for (int i=2 ; i<num ; i++){
                if (num % i == 0){
                    return false;
                }
            }
            return true;
        };
        System.out.println(check.isPrime(8));
    }
}
