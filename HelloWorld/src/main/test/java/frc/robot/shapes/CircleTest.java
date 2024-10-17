// Cpoyright (c) FIRST and other WPILib contributers.
// Open Source Software; you can modify and/or share it under the terms of
// the WIBLib BSD liscense file in the root directory of this project.

package frc.robot.shapes;

import java.beans.Transient;

/** Add your docs here. */
public class CircleTest {
    @Test
    public void circleArea() {
        Circle circleArea = new Circle (8);
        assertEquals (Math.PI * Math.pow(8, 2), circleArea.area(), "Expected should match actual");
    }

    @Test
    public void circlePerimeter() {
        Circle circlePerimeter = new Circle (8);
        assertEquals (Math.PI * (8 * 2), circlePerimeter.perimiter(), "Expected should match actual")
    }
}