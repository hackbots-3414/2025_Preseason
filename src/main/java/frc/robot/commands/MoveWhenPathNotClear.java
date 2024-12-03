// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.CommandSwerveDrivetrain;
import frc.robot.subsystems.LazerRangeFinder;

public class MoveWhenPathNotClear extends Command {
  private CommandSwerveDrivetrain drivetrain;
  private LazerRangeFinder lazer;
  /** Creates a new MoveWhenPathNotClear. */
  public MoveWhenPathNotClear(CommandSwerveDrivetrain commandswervedrivetrain, LazerRangeFinder lazerrangefinder) {
    // Use addRequirements() here to declare subsystem dependencies.
    drivetrain = commandswervedrivetrain;
    lazer = lazerrangefinder;
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    if (lazer.getDistance() > 0) {
      drivetrain.drive(3, 0, 0);
    }
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
