package in.devanshu.code.abstract_class_program;

public class TestShape {
    public static void main(String[] args){
        Circle calcCircle = new Circle(20);
        Square calcSq = new Square(10);

        System.out.println("Area of Circle : " + calcCircle.calculateArea());
        System.out.println("Area of Square : " + calcSq.calculateArea());
    }
}
