// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WIBLib BSD liscense file in the root directory of this project.

package frc.robot.shapes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.beans.Transient;

/** Add your docs here */
public class RectangleTest {
    @Test
    public void testArea() {
        Rectangle rectangle = new Rectangle (4, 3);
        assertEquals(12.0, rectangle.getArea(), "Expected and actual should match")
    }
    @Test 
    public void testPerimeter(){
        Rectangle rectangle = new Rectangle (3, 4);
        assertEquals(14.0, rectangle.perimeter(),"Expected and actual should match")
    }

}
