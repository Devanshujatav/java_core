public class Student {

    String name;
    int age;

    Student(String name , int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString(){
        return "Name : "+ name + " , Age : " + age + ".";
    }

    public static void main(String[] args){
        Student std = new Student("Devanshu" , 21);

        System.out.println(std);

    }
}
