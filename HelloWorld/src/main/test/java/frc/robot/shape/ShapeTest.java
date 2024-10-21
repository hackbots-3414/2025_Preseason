package frc.robot.shape;

import java.beans.Transient;

public class ShapeTest {
    public static final int MAX_SHAPE_ARRAY_LENGTH = 50;

    @Test
    public void testShapes() {

        Shape[] shapes = new Shape[MAX_SHAPE_ARRAY_LENGTH];
        
        for (int i = 0; i < shapes.length; i++) {

            switch (i) {
                case 1:
                    shapes[i] = new Rectangle();
                    ((Rectangle)shapes[i]).setLength(3);
                    ((Rectangle)shapes[i]).setWidth(5);
                    break;
                case 2:
                    shapes[i] = new Circle();
                    ((Circle)shapes[i]).setRadius(4);
                default:
                    shapes[i] = new Square();
                    ((Square)shapes[i]).setLength(3);
                    break;
            }
        }
        for(int i = 0; i < shapes.length; i++) {

            assertTrue(shapes[i] instanceof Shape);
        }
    }
}