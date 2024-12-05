// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import frc.robot.subsystems.CommandSwerveDrivetrain;
import frc.robot.subsystems.LazerRangeFinder;

/** Add your docs here. */
public class MoveWhenDontSee {
    private CommandSwerveDrivetrain drivetrain;
public MoveWhenDontSee(CommandSwerveDrivetrain drivetrain, CommandLazerRangeFinder lazerRangeFinder) {
    this.drivetrain = drivetrain;
    this.lazerRangeFinder = lazerRangeFinder;
}
}