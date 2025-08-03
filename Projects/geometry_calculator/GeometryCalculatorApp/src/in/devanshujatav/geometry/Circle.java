package in.devanshujatav.geometry;

public class Circle {
    double radius;

    public Circle(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return Math.PI * Math.pow(this.radius , 2);
    }
}
