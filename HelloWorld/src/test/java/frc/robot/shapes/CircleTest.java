// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.shapes;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/** Add your docs here. */
public class CircleTest {
    @Test
    public void circleArea(){
        Circle circleArea = new Circle(8);
        assertEquals(Math.PI * Math.pow(8, 2), circleArea.area(), "Expected should match actual");
    }
    @Test
    public void circlePerimeter(){
        
    }
}