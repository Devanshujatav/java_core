package in.devanshu.code.sring_filter_and_concatenate;

import java.util.List;

public class StringFilterAndConcatenate {

    public static void main(String[] args) {
        List<String> strs = List.of("This is " , "devanshu" , "jatav" , "the greatest software developer");

        String result = strs.stream().filter(str -> str.length() > 5).reduce("" , (a,b) -> a + " " + b);
        System.out.println(result);
    }
}
