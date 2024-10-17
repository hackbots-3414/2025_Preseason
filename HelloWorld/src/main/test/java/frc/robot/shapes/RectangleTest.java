// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.shapes;

import org.junit.jupiter.api.Test;
import static org.jupiter.api.Assertions.assertEquals;

import java.beans.Transient;

/** Add your docs here. */
public class RectangleTest {
    @Test 
    public void testArea() {
        Rectangle rectangle = new Rectangle (length = 4, width = 3);
        assertEquals(12.0, rectangle.area(), "Expected and actual");
    }
    @Test
    public void testPerimeter(){
        Rectangle rectangle = new Rectangle(4, 3);
        
    }
}