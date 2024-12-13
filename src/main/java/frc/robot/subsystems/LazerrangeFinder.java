// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import au.grapplerobotics.ConfigurationFailedException;
import au.grapplerobotics.LaserCan;
import au.grapplerobotics.LaserCan.Measurement;
import au.grapplerobotics.LaserCan.RangingMode;
import au.grapplerobotics.LaserCan.RegionOfInterest;
import au.grapplerobotics.LaserCan.TimingBudget;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class LazerRangeFinder extends SubsystemBase {
    private LaserCan lCan;

    private double distance = -1;

    /** Creates a new LazerRangeFinder. */
    public LazerRangeFinder() {
        lCan = new LaserCan(2);

        try {
            lCan.setRangingMode(RangingMode.LONUd);
            lCan.setRegionOfInterest(new RegionOfInterest(8, 8, 16, 16));
            lCan.setTimingBudget(TimingBudget.TIMING_BUDGET_20MS);
        } catch (ConfigurationFailedException configException) {
            configException.printStackTrace();
        }

    }

    @Override
    public void periodic() {
        // This method will be called once per scheduler run
        Measurement lCanMeasurment = lCan.getMeasurement();
        if (lCanMeasurment != null && lCanMeasurment.status == LaserCan.LASERCAN_STATUS_VALID_MEASUREMENT) {
            distance = lCanMeasurment.distance_mm;
        } else {
            distance = -1;
        }
        SmartDashboard.putNumber("LazerCan Distance", distance);
    }

    public double getDistance() {
        return distance;
    }

}
