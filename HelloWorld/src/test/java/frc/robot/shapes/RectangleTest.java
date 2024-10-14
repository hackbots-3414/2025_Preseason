// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.shapes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/** Add your docs here. */
public class RectangleTest {
    @Test
    public void testArea() {
        Rectangle rectangle = new Rectangle(4,3);
        assertEquals(12.1, rectangle.getArea(), "Expected and actual area should match");
    }
}
