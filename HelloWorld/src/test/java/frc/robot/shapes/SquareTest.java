// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.shapes;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/** Add your docs here. */
public class SquareTest {
    
    @Test
    public void testArea() {
        Square SquareTest = new Square();
        SquareTest.setLength(10);
       assertEquals(100, SquareTest.area());
    }

    @Test
    public void testPerimiter() {
        Square SquareTest = new Square();
        SquareTest.setLength(10);
        assertEquals(40, SquareTest.perimiter());
    }

    @Test
    public void testMeasurment() {
        Square SquareTest = new Square();
        SquareTest.setLength(10);
        SquareTest.setWidth(2);
        assertEquals(2, SquareTest.getLength());
        SquareTest.setLength(11);
        assertEquals(11, SquareTest.getWidth());
    }
}
