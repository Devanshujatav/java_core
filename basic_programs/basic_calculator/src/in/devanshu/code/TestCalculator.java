package in.devanshu.code;

public class TestCalculator extends Calculator{
    public static void main(String[] args){
        Calculator calc = new Calculator();

        System.out.println(calc.add(2,3));
        System.out.println(calc.add(1.2 , 2.4));
        System.out.println( calc.add(1 , 3 , 4));
    }
}
