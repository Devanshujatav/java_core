package in.devanshu.code.enum_of_days;

public class EnumTest {
    public static void main(String[] args) {
        for (Days day : Days.values()){
            System.out.println(day +  " : " + day.getType());
        }
    }
}
