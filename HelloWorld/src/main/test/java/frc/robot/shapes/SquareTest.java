// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package SquareTest;

/** Add your docs here. */
public class SquareTest {
    @Test 
    public void testArea() {
        Square SquareTest = new Square ();
        squareTest.setLength(3);
        assertEquals(9.0, SquareTest.area(), "Expected and actual");
    }
    @Test
    public void testPerimeter(){
        Square square = new Square();
        squareTest.setWidth(3)
        assertEquals(expected:12.0, squareTest.perimeter())
    
    @Test
    public void testParameters() ;
        Square testmeasures = new Square();
        testmeasures.setLength(5);
        testmeasures.setWidth(6);
        assertEquals(expected:5, testMeasures.getLength())
        
    }

}