package frc.robot.shape;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;


public class CircleTest {
    @Test
    public void testArea() {

        Circle circleTest = new Circle();
        circleTest.setRadius(3);
        assertEquals(Math.PI * Math.pow(3.0, 2.0), circleTest.area());
    }

    @Test
    public void testPerimeter() {

        
        Circle circleTest = new Circle();
        circleTest.setRadius(3);
        assertEquals(2*3 * Math.PI, circleTest.perimeter());
    }
}