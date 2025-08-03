import java.util.Objects;

public class Course {

    // static variable
    static int maxCapacity = 2;

    // Instance Variable
    String courseName;
    int enrollment=0;
    String[] enrolledStudents;

    Course(String courseName){
        this.courseName = courseName;
        this.enrollment=0;
        this.enrolledStudents = new String[maxCapacity];
    }

    static void setMaxCapacity(int maxCapacity){
        Course.maxCapacity=maxCapacity;
    }

    void enrollStudent(String studentName){
        if (enrollment <= maxCapacity){
            this.enrolledStudents[enrollment] = studentName;
            enrollment++;
        }else{
            System.out.println("Sorry....the course is full of students.");
        }
    }

    void unenrollStudent(String studentName){
        for (int i=0 ; i<enrollment ; i++){
            if(Objects.equals(enrolledStudents[i], studentName)) {
                for (int j = i; j < enrollment - 1; j++) {
                    enrolledStudents[j] = enrolledStudents[j + 1];
                }
                enrolledStudents[enrollment-1] = null;
                enrollment--;
                break;
            }
        }
    }



    public static void main(String[] args){
        Course design = new Course("Graphic Design");

        design.enrollStudent("devanshu");

        for(String val : design.enrolledStudents){
            System.out.println(val);
        }

        System.out.println();

        design.unenrollStudent("devanshu");

        for(String val : design.enrolledStudents){
            System.out.println(val);
        }
    }
}
