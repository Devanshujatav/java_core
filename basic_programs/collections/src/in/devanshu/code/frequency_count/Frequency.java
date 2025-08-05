package in.devanshu.code.frequency_count;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Frequency {

    public static void main(String[] args){
        List<Integer> list = Arrays.asList(1,4,8,6,4);
        System.out.println(Collections.frequency(list , 1));
        System.out.println(Collections.frequency(list , 4));
    }
}
