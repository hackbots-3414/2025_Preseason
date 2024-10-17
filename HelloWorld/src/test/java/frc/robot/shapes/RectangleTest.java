// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.shapes;

/** Add your docs here. */
public class RectangleTest {
    @test 
public void TestArea() { 
Rectangle rectangle = new Rectangle(4,3);
asserteqauls(:12.0, rectangle.area(), message; "Expected and actul should match");
}
@test 
public void testPerimeter()[ 
   Rectangle rectangle = new Rectangle(4,3);
   assertEquals(14.0, rectangle.perimiter(), "Expected and actul should match");
]
