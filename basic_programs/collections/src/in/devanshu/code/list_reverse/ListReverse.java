package in.devanshu.code.list_reverse;

import in.devanshu.code.swap_numbers.SwapNumbers;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListReverse {
    private static void reverse(List<Integer> list){
        // Method 1
//        Collections.reverse(list);

        // Method 2
        for (int i=0 ; i<list.size()/2 ; i++){
            SwapNumbers.swap(list , i , list.size() - 1 - i);
        }
    }

    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,2,3,4,5);
        System.out.println("Original Array : " + list);
        reverse(list);
        System.out.println("Reversed Array : " + list);
    }
}
