// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.button.CommandPS5Controller;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.subsystems.CommandSwerveDrivetrain;

public class ManualDrive extends Command {
  private static final Logger LOG = LoggerFactory.getLogger(ManualDrive.class);
  private CommandSwerveDrivetrain drivetrain;
  private CommandPS5Controller xboxController;

  /** Creates a new ManualDrive. */
  public ManualDrive(CommandSwerveDrivetrain drivetrain, CommandPS5Controller ps5Controller) {
    this.drivetrain = drivetrain;
    this.xboxController = ps5Controller;


    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(drivetrain);

  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    LOG.trace("initialize()");
    drivetrain.stop();
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    drivetrain.drive(xboxController.getLeftX(), xboxController.getLeftY(), xboxController.getRightX());
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    drivetrain.stop();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}
