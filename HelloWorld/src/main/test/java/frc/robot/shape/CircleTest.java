package frc.robot.shape;

import java.beans.Transient;

public class CircleTest {
    @Test
    public void circleArea() {
        Circle circleArea = new Circle (8);
        assertEquals (Math.PI * Math.pow(8, 2), circleArea.area(), "Expected should match actual");
    }

    @Test
    public void circlePerimeter() {
        Circle circlePerimeter = new Circle (8);
        assertEquals (Math.PI * (8 * 2), circlePerimeter.perimiter(), "Expected should match actual");
    }
}