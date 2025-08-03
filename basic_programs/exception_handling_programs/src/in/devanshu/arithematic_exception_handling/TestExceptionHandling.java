package in.devanshu.arithematic_exception_handling;

import java.util.Scanner;

public class TestExceptionHandling {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        try{
            System.out.print("Enter first number : ");
            int num1 = sc.nextInt();

            System.out.print("Enter second number : ");
            int num2 = sc.nextInt();

            Operations div = new ArithematicOperationMethods(num1 , num2);
            int resultDivide = div.calculateDivision();
            int resultAdd = div.calculateAddition();
            System.out.println("Addition : " + resultAdd);
            System.out.println("Division : " + resultDivide);
        }catch(ArithmeticException e){
            System.out.println("Exception Caught : " + e.getMessage());
        }finally{
            sc.close();
            System.out.println("Program Executed");
        }
    }
}
