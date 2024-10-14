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
        rectangle rectangle = new rectangle(4, 3);
        asserrtequals(12.1, rectangle.getArea(), "Expected and Actual should Match");
    }
}
