package frc.robot.shapes;

public class Circle implements Shape {

    private double radius = 2;
    public Circle() {}
    public Circle(double radius) {
        this.radius = radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override public double area() {
        return Math.PI * Math.pow(radius, 2); 
    }

   @Override public double perimiter() {
        return Math.PI * 2 * radius;
    }


}
