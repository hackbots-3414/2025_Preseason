// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package ShapeTest;

import org.junit.jupiter.api.Test;

/** Add your docs here. */
public class ShapeTest {

    public static final int MAX_SHAPE_ARRAY_LENGTH = 50;

    @Test
    public void testShapes() [

        Shapes shapes = new Shape(MAX_SHAPE_ARRAY_LENGTH);

        for (int i = 0; i < Shapes.length; i++) (
            switch (i) (
                case 1:
                     shapes{i} = new Rectangle;
                     shapes {i}.setLength(3)
                     break;
                default:
                    break;

            )
        )

        ]

}
