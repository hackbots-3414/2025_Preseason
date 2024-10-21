// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.shapes;
import org.junit.jupiter.api.Test;

import frc.robot.shapes.Rectangle;

import static org.junit.jupiter.api.Assertions.assertEquals;

/** Add your docs here. */
public class RectangleTest {
    @Test
    public void testArea() {
        Rectangle rectangleTest = new Rectangle();
        rectangleTest.setLength(3);
        rectangleTest.setWidth(4);
        assertEquals(12.0, rectangleTest.area(), "");
    }

    @Test
    public void testPerimiter() {
        Rectangle rectangleTest = new Rectangle();
        rectangleTest.setLength(3);
        rectangleTest.setWidth(4);
        assertEquals(14.0, rectangleTest.perimiter(), "");
    } 
}
