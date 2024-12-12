// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.PIDCommand;
import frc.robot.subsystems.CommandSwerveDrivetrain;
import frc.robot.subsystems.LazerRangeFinder;

// NOTE:  Consider using this command inline, rather than writing a subclass.  For more
// information, see:
// https://docs.wpilib.org/en/stable/docs/software/commandbased/convenience-features.html
public class DrivePIDUntilClose extends PIDCommand {
  private CommandSwerveDrivetrain drivetrain;
  private LazerRangeFinder rangefinder;

  /** Creates a new DrivePIDUntilClose. */
  public DrivePIDUntilClose(CommandSwerveDrivetrain drivetrain, LazerRangeFinder rangeFinder) {
    super(
        // The controller that the command will use
        new PIDController(0.25, 0, 0),
        // This should return the measurement
        () -> {
          double distance = rangeFinder.getDistance();
          if (distance < 0) {
            distance = 5000;
          }
          return distance;
        },
        // This should return the setpoint (can also be a constant)
        () -> 50,
        // This uses the output
        output -> {
          // Use the output here
          drivetrain.drive(0, 0.5 * output, 0);
        });
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(drivetrain);
    // Configure additional PID options by calling `getController` here.
    getController().enableContinuousInput(0, 5000);
    SmartDashboard.putData("PIDController", getController());
    this.drivetrain = drivetrain;
    this.rangefinder = rangeFinder;
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return getController().atSetpoint();
  }
}
