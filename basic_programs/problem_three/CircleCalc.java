public class CircleCalc {

    double radius;

    CircleCalc(double radius){
        this.radius = radius;
    }

    double Area(){
        return this.radius * this.radius * Math.PI;
    }

    double Circumference(){
        return 2*this.radius*Math.PI;
    }

    public static void main(String[] args){
        CircleCalc circle = new CircleCalc(22.22);
        System.out.println("Area of Circle : "+circle.Area());
        System.out.println("Circumference of circle : " + circle.Circumference());
    }
}
