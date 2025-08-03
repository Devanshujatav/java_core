package in.devanshu.arithematic_exception_handling;

public interface Operations {
    int calculateAddition();
    int calculateDivision();

    default void showMessage(){
        System.out.println("Performing Operation :");
    }
}
