package in.devanshu.arithematic_exception_handling;

public class ArithematicOperationMethods extends ArithematicOperation{
    public ArithematicOperationMethods(int num1 , int num2){
        super(num1,  num2);
    }

    @Override
    public int calculateAddition() throws ArithmeticException {
        if (num2<0){
            throw new ArithmeticException("The second number you entered can't be negetive.");
        }
        showMessage();
        printOperands();
        return num1 + num2;
    }

    @Override
    public int calculateDivision() throws ArithmeticException {
        if (num2==0){
            throw new ArithmeticException("The second number you entered can't be zero.");
        }
        showMessage();
        printOperands();
        return num1 / num2;
    }

}

