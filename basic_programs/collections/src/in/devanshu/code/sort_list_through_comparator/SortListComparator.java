package in.devanshu.code.sort_list_through_comparator;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class SortListComparator {

    public static void sortInDescending(List<String> stringList){
        Collections.sort(stringList , new java.util.Comparator<String>(){
            @Override
            public int compare(String s , String t){
                if (s.equals(t)){
                    return 0;
                }else if(s.charAt(0) < t.charAt(0)){
                    return 1;
                }else{
                    return -1;
                }
            }
        });
    }


    public static void main(String[] args){
        List<String> list = Arrays.asList("Bear" , "Zebra" , "Lion");
        System.out.println(list);
        sortInDescending(list);
        System.out.println(list);

    }
}
