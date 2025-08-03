package in.devanshu.code.concatenate_strings;

public class ConcatenateStrings {

    private static String concatenate(String... strs){
        StringBuilder sb = new StringBuilder();
        for(String str : strs){
            sb.append(str).append(" ");
        }
        return sb.toString();
    }

    public static void main(String[] args){
        String result = concatenate("hello" , "world");
        System.out.println("Output : " + result);
    }
}
