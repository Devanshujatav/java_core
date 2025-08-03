package in.devanshujatav.utils;
import in.devanshujatav.geometry.Circle;
import in.devanshujatav.geometry.Rectangle;

public class Calculator {
    public static void main(String[] args){
        Circle clr = new Circle(12);
        Rectangle rect = new Rectangle(10 , 4);

        double areaOfCircle = clr.getArea();

        double areaOfRectangle = rect.getArea();

        System.out.println("Area of Circle : " + areaOfCircle);
        System.out.println("Area of Rectangle : " + areaOfRectangle);
    }
}
