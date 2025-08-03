package in.devanshu.arithematic_exception_handling;

public abstract class ArithematicOperation implements Operations{
    public int num1;
    public int num2;

    public ArithematicOperation(int num1 , int num2){
        this.num1 = num1;
        this.num2 = num2;
    }

    // concrete method
    public void printOperands(){
        System.out.println("Operands : " + num1 + " and " + num2);
    }
}
