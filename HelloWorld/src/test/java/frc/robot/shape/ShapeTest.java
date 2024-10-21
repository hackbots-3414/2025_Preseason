// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.shapes;
import org.junit.jupiter.api.Test;

import frc.robot.shapes.Square;
import frc.robot.shapes.Circle;
import frc.robot.shapes.Rectangle;
import frc.robot.shapes.Shape;

import static org.junit.jupiter.api.Assertions.assertEquals;

/** Add your docs here. */
public class ShapeTest {
    public static final int MAX_SHAPE_ARRAY_LENGTH = 50;

    @Test
    public void testShapes() {
        Shape[] shapes = new Shape[MAX_SHAPE_ARRAY_LENGTH];

        for (int i = 0; i < shapes.length; i++) {
            switch (i) {
                case 1:
                shapes[i] = new Rectangle();
                ((Rectangle) shapes[i]).setLength(3);
                ((Rectangle) shapes[i]).setWidth(3);
                break;
                                case 2:
                shapes[i] = new Circle();
                ((Circle) shapes[i]).setRadius(4);
                break;
                                default:
                shapes[i] = new Square();
                ((Square) shapes[i]).setLength(3);
                break;
            }
        }
        for (int i = 0; i < shapes.length; i++) {
            assertTrue(shapes[i] instanceof Shape);
        }
    }
}
