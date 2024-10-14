// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.shapes;

/** Add your docs here. */
public class Rectangle implements Shape {

    private double length = 0;
    private double width = 0;

    public Rectangle() {
    }

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width; 
    }

    public double getLength() {
        double length = 500;
        return length;  // this.something is used so you can bring back a specific variable
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

  

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimiter() {
        return (2 * length) + (2 * width); 
    }
}
