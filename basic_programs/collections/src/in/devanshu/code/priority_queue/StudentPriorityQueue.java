package in.devanshu.code.priority_queue;

import java.util.Comparator;
import java.util.PriorityQueue;

public class StudentPriorityQueue {
    private static class Student{
        private final String name;
        private final char grade;

        public Student(String name , char grade){
            this.name = name;
            this.grade = grade;
        }

        public String getName(){
            return this.name;
        }

        public char getGrade(){
            return this.grade;
        }

        @Override
        public String toString(){
            return name + " : " + grade;
        }
    }

    public static void main(String[] args) {
        PriorityQueue<Student> queue = new PriorityQueue<>(new Comparator<Student>() {
            @Override
            public int compare(Student s1 , Student s2) {
                return s1.getGrade() - s2.getGrade();
            }
        });

        queue.offer(new Student("Devanshu" , 'A'));
        queue.offer(new Student("Neha" , 'B'));

        System.out.println("Queue : " + queue);
        System.out.println(queue.poll());
        System.out.println(queue.poll());
    }
}
