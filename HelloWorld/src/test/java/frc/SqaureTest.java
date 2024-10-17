// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package square.java;

import static org.junit.jupiter.api.Assertions.assertEquals;

import frc.robot.shapes.Rectangle;
import frc.robot.shapes.Square;

/** Add your docs here. */
public class SqaureTest {
    @test 
    public void testArea(){ 
        Square sqaure = new square(3);
        assertEquals( 9.0, square.area(), "Expected and actul should match");
    }
    
@test 
public void testPerimeter()[
   Square sqaure = new Square(3);
   assertEquals(12.0, sqaure.perimiter(), "Expected and actul should match");
]
@Test 
public void testforcongruency(){ 
    Square square = new Square (4);
    square.setLength(2);
    assertEquals(2,square.getWidth());
    assertEqauls(2,square.getLength());
    square.setWidth(5);
    assertEquals(5,square.getWidth());
    assertEqauls(5,square.getLength());
}

}
