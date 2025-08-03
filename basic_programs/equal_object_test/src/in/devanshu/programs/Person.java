package in.devanshu.programs;

public class Person {
    private String name;
    private int age;

    Person(String name , int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj){
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Person o = (Person) obj;
        return (this.age == o.age) && this.name == o.name;
    }

    @Override
    public int hashCode(){
        return this.name.hashCode();
    }
}
