package frc.robot.shape;

public class Circle implements Shape {
    
    private double radius = 0;

    public void setRadius(double radius) {
        this.radius=radius;
    }

    public double getRadius() {
        return radius;
    }

    public double area() {
        return Math.PI * (radius)*(radius);
    }

    public double perimeter() {
        return 2*radius *Math.PI;
    }
}
