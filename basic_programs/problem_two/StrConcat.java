import java.util.Locale;

public class StrConcat {

    String s1;
    String s2;

    StrConcat(String s1 , String s2){
        this.s1 = s1;
        this.s2 = s2;
    }

    String display(){
        return s1 + " " + s2;
    }

    public static void main(String[] args){
        StrConcat sc = new StrConcat("hello" , "devanshu");
        String result = sc.display();
        System.out.println(result.toUpperCase());
    }
}
