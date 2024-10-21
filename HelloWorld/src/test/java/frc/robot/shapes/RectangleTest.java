// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/** Add your docs here. */
public class RectangleTest {
    
    @Test
    public void testArea(){
        Rectangle rectangleTest = new Rectangle();
        rectangleTest.setLength(3);
        rectangleTest.setWidth(10);
        assertEquals(30, rectangleTest.area());
    }

    @Test
    public void testPerimiter(){
        Rectangle rectangleTest = new Rectangle();
        rectangleTest.setLength(3);
        rectangleTest.setWidth(10);
        assertEquals(26, rectangleTest.perimiter());
    }
}
