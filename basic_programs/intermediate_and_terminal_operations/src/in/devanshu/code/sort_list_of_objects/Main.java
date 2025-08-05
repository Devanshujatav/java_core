package in.devanshu.code.sort_list_of_objects;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
                new Employee("Devanshu" , 100000000),
                new Employee("Neha" , 10000),
                new Employee("Kruti", 100000)
        );

        employees.stream().sorted((emp1 , emp2)-> emp1.getSalary()- emp2.getSalary()).forEach(System.out::println);
    }
}
