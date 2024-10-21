package frc.robot.shapes;

public class Circle implements Shape {
    
    private double radius = 0;

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override public double area() {
        // TODO Auto-generated method stub
        return Math.PI * Math.pow(radius, 2);
    }

    @Override public double perimiter() {
        // TODO Auto-generated method stub
        return Math.PI * 2 * radius;
    }

}
