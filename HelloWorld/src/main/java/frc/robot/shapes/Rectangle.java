// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.shapes;

/** Add your docs here. */
public class Rectangle implements Shape {
    public double width = 2;
    public double length = 2;
    public Rectangle() {}
    public Rectangle(double width, double length) {
        this.length = length;
        this.width = width;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public void setWidth(double length) {
        this.length = length;
    }
   @Override public double area() {
        return length * width;
    }
   @Override public double perimiter() {
        return (length * 2) + (width * 2);
    }
}
