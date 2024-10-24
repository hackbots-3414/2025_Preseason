// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.shapes;

import org.junit.jupiter.api.Test;

/** Add your docs here. */
public class ShapeTest {
    private static final int MAX_NUMBER_SHAPES = 10;
    private Shape[] shapesArray = new Shape[MAX_NUMBER_SHAPES];

    @Test
    public void testShapes() {
        for (int i = 0; i < shapesArray.length; i++) {
            switch (i % 3) {
                case 1:
                    shapesArray[i] = new Circle(5);
                    break;

                case 2:
                    shapesArray[i] = new Rectangle(3.0, 6);
                    break;

                default:
                    shapesArray[i] = new Square();
                    ((Square) shapesArray[i]).setLength(4);
            }
            shapesArray[i] = new Circle(5);

        }
        for (int i = 0; i < shapesArray.length; i++) {
            assertTrue(shapesArray[i].area() > 0);

        }
    }
}
