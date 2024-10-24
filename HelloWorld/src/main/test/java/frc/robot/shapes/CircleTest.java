// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.beans.Transient;

import org.junit.jupiter.api.Test;

/** Add your docs here. */
public class CircleTest {
    @Test
    public void testArea(){
        Circle cricleTest = new Circle();
        circleTest.setRadius(3);
        assertEquals(Math.PI * Math.pow(3.0, 2.0), circleTest.area());
    }
        
    @Test
    public void testPerimeter() {
        Circle circleTest = new Circle();
        circleTest.setRadius(3);
        assertEquals(2 * 3 * Math.PI, circleTest.perimiter());
    }
}
