// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.shape;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

/** Add your docs here. */
public class SquareTest {

    @Test
    public void squareArea() {
        Square squareTest = new Square();
        squareTest.setLength(3);
        assertEquals(9.0, squareTest.area());
    }

    @Test
    public void squarePerimeter() {
        Square squareTest = new Square();
        squareTest.setWidth(3);
        assertEquals(12.0, squareTest.perimeter());
    }

    @Test
    public void testParameters() {
        Square testmeasures = new Square();
        testmeasures.setLength(5);
        testmeasures.setWidth(6);
        assertEquals(6, testmeasures.getLength());
        testmeasures.setLength(5);
        assertEquals(5, testmeasures.getWidth());
    }
}
