// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.CommandSwerveDrivetrain;
import frc.robot.subsystems.LazerRangeFinder;

/** Add your docs here. */
public class MoveWhenDontSee extends Command{

    private CommandSwerveDrivetrain drivetrain;
    private LazerRangeFinder lazerRangeFinder;

    public MoveWhenDontSee(CommandSwerveDrivetrain drivetrain, LazerRangeFinder lazerRangeFinder) {
        this.drivetrain = drivetrain;
        this.lazerRangeFinder = lazerRangeFinder;
    }

    @Override
    public void end(boolean interrupted) {
        // TODO Auto-generated method stub
        super.end(interrupted);
    }

    @Override
    public void execute() {
        // TODO Auto-generated method stub
        super.execute();
    }

    @Override
    public void initialize() {
        // TODO Auto-generated method stub
        super.initialize();
    }

    @Override
    public boolean isFinished() {
        // TODO Auto-generated method stub
        return super.isFinished();
    }
}