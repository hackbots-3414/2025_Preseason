package frc.robot.shape;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.beans.Transient;

public class RectangleTest {
    @Test
    public void testArea() {
        Rectangle rectangle = new Rectangle (4, 3);
        assertEquals(12.0, rectangle.getArea(), "Expected and actual should match");
    }
    @Test 
    public void testPerimeter(){
        Rectangle rectangle = new Rectangle (3, 4);
        assertEquals(14.0, rectangle.perimeter(),"Expected and actual should match");
    }

}
