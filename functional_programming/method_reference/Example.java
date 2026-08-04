import java.util.function.*;
import java.util.*;

public class Example{
    static int doubleValue(int x){
        return x*2;
    }

    int tripleValue(int x){
        return x*3;
    }

    Example(){
        System.out.println("Constructor Called");
    }

    public static void main(String[] args) {
        Function<Integer , Integer> f1 = Example::doubleValue;
        System.out.println(f1.apply(5));

        Example ex = new Example();
        Function<Integer , Integer> f2 = ex::tripleValue;
        System.out.println(f2.apply(3));

        Supplier<Example> f3 = Example::new;
        f3.get();
    }
}

