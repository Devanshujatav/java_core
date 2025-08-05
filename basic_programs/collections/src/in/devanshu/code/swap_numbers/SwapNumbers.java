package in.devanshu.code.swap_numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SwapNumbers {
    public static void swap(List<Integer> list , int a , int b){
        int temp = list.get(a);
        list.set(a , list.get(b));
        list.set(b , temp);
    }

    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        System.out.println("Original Array : " + list);
        swap(list , 1 , 3);
        System.out.println("Swapped Array : " + list);
    }
}
