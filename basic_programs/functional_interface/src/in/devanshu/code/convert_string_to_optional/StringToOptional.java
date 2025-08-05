package in.devanshu.code.convert_string_to_optional;

import java.util.Locale;
import java.util.Optional;

public class StringToOptional {

    public static Optional<String> toOptional(String s){
        if (s==null || s.isEmpty()){
            return Optional.empty();
        }

        return Optional.of(s.toUpperCase());
    }

    public static void main(String[] args) {
        String s = "devanshu";
        System.out.println(toOptional(""));
        System.out.println(toOptional(null));
        System.out.println(toOptional(s));
    }
}
