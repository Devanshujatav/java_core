package in.devanshu.code.generics_method;

public class GenericMethodExample {
    public static <T> void printArray(T[] arr){
        for (T val : arr){
            System.out.print(val + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Integer[] intArray = {1,2,3,4,5};
        String[] strArray = {"hello" , "devanshu" , "jatav"};

        printArray(intArray);
        printArray(strArray);
    }
}
