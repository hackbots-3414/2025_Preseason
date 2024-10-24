// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.shapes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/** Add your docs here. */
public class RectangleTest {
    @Test
    public void TestArea() {
        Rectangle rectangle = new Rectangle(4,3);
        assertEquals(12.0, rectangle.area(), "Expected and actual area should match");
    }
    @Test
    public void TestPerimeter(){
      Rectangle rectangle = new Rectangle(4,3);
      assertEquals(14.0, rectangle.perimiter(), "Expected and actual area should match");
    }
}
