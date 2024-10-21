// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.shapes;
import org.junit.jupiter.api.Test;

import frc.robot.shapes.Square;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class SquareTest {
    @Test
    public void squareArea() {
        Square squareTest = new Square();
        squareTest.setLength(3);
        assertEquals(9.0, squareTest.area(), "");
    }

    @Test
    public void squarePerimiter() {
        Square squareTest = new Square();
        squareTest.setLength(3);
        assertEquals(12.0, squareTest.perimiter(), "");
    }

    @Test
    public void testParameters() {
        Square testmeasures = new Square();
        testmeasures.setLength(3);
        testmeasures.setWidth(3);
        assertEquals(3, testmeasures.length);
        
    }
}
