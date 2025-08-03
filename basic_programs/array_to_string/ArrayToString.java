public class ArrayToString {
    public static void main(String[] args){
        String[] arr = {"This" , "is" , "Devanshu" , "jatav" , ", The" , "Greatest" , "Software" , "Developer"};

        StringBuilder sb = new StringBuilder();

        for (String str : arr){
            sb.append(str).append(" ");
        }

        System.out.println(sb);
    }
}
