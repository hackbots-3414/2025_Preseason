// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package SquareTest;

import frc.robot.shapes.Square;

/** Add your docs here. */
public class SquareTest {

    @Test 
    public void testArea() {
        Square SquareTest = new Square();
        squareTest.setLength(10);
        assertEquals(100, SquareTest.area());
    }

    @Test
    public void testPerimeter() {
        Square square = new Square();
        squareTest.setWidth(10);
        assertEquals(40, SquareTest.perimeter());
    }
    
    @Test
    public void testMeasurement() {
        Square SquareTest = new Square();
        SquareTest.setLength(10);
        SquareTest.setWidth(2);
        assertEquals(2, SquareTest.getlength());
        SquareTest.setLength(11);
        assertEquals(11, SquareTest.getWidth());
    }
        

}