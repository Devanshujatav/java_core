package in.devanshu.code.abstract_class_program;

public class Circle extends Shape {

    private final double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    @Override
    public double calculateArea(){
        return Math.PI * Math.pow(this.radius , 2);
    }
}
