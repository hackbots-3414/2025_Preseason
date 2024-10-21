// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import frc.robot.shapes.Circle;

// import edu.wpi.first.wpilibj.RobotBase;

/**
 * Do NOT add any static variables to this class, or any initialization at all.
 * Unless you know what
 * you are doing, do not modify this file except to change the parameter class
 * to the startRobot
 * call.
 */
public final class Main {
  private static final Logger LOG = LoggerFactory.getLogger(Main.class);

  private Main() {
  }

  /**
   * Main initialization function. Do not perform any initialization here.
   *
   * <p>
   * If you change your main robot class, change the parameter type.
   */
  public static void main(String... args) {
    // RobotBase.startRobot(Robot::new);
    for (int i = 0; i < 50; i++) {
      print(i);
    }
    System.out.println("///////////////////////////");
    boolean doLoop = true;
    int a = 0;
    while (doLoop) {
      print(a);
      a += 2;
      if (a > 100) {
        doLoop = false;
      }
    }
    System.out.println("///////////////////////////");
    do {
      print(a);
    } while (doLoop);

    Circle trevor = new Circle();
    Circle geofery = new Circle();
    trevor.setRadius(5);
    geofery.setRadius(7);

    LOG.error("main(): trevor.getArea(): ()", trevor.area());
    LOG.error("main(): geofery.getArea(): ()", geofery.area());


  }

  private static void print(int count) {
    LOG.trace("print(): Hello World :) {}", count);
    LOG.debug("Hello World :) {}", count);
    LOG.info("Hello World :) {}", count);
    LOG.warn("Hello World :) {}", count);
    LOG.error("Hello World :) {}", count);
  }
}
