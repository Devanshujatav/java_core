package in.devanshu.code.sort_list_of_objects;

public class Employee {
    private final String name;
    private final int salary;

    public Employee(String name , int salary){
        this.name = name;
        this.salary = salary;
    }

    public String getName(){
        return this.name;
    }

    public int getSalary(){
        return this.salary;
    }

    @Override
    public String toString(){
        return this.name + " " + this.salary;
    }
}
