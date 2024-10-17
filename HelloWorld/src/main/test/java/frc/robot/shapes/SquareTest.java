// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.shapes;

/** Add your docs here. */
public class SquareTest {}

public class SquareTest {
    @Test
    public void testArea() {
        Square square = new Square(3);
        assertEquals(9.0, squareArea.area(), "Expected and actual should match")
    }
    @Test 
    public void testPerimeter(){
        Square square = new Square(3);
        assertEquals(12.0, square.perimeter(),"Expected and actual should match")
    }
    @Test
    public void testForCongruency(){
        Square square = new Square(4);
      
        square.setLength(2);
        assertEquals(2, square.getWidth());
        assertEquals(2, square.getLength());
      
        square.setWidth(5);
        assertEquals(5, square.getWidth());
        assertEquals(5, square.getLength());
    }

}