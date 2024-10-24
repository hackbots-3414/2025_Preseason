
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.shapes;

import java.beans.Transient;

import org.junit.jupiter.api.Test;

/** Add your docs here. */
public class CircleTest {
    @Test
    public void circleArea(){
        Circle circleArea = new Circle(8);
        assertEquals(Math.PI * Math.pow(8.0,2.0), circleArea, "Expected should match actual");
    }
    @Test
    public void circlePerimeter(){
        Circle circleTest = new Circle();
        circleTest.setRadius(3);
        assertEquals(2*3 * Math.PI, circleTest, perimeter());
    }
}
