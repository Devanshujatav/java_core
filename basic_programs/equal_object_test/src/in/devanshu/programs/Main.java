package in.devanshu.programs;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person p1 = new Person("devanshu" , 21);
        Person p2 = new Person("devanshu" , 22);

        System.out.println(p1.equals(p2));
        System.out.println(p1.hashCode());
    }
}