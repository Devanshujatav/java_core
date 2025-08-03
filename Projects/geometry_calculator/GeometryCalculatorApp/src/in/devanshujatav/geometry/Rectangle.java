package in.devanshujatav.geometry;

public class Rectangle {
    int length;
    int breadth;

    public Rectangle(int length , int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    public int getArea(){
        return this.length * this.breadth;
    }
}
