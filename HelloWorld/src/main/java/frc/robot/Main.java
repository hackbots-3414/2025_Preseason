// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import frc.robot.shapes.Circle;
import frc.robot.shapes.Rectangle;
import frc.robot.shapes.Square;

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

    Circle trevor = new Circle(5);
    Circle geofery = new Circle(7);

    Rectangle james = new Rectangle(5, 10);
    Rectangle thomas = new Rectangle(7, 9);

    Square clarence = new Square(15);
    Square don = new Square(5);

    LOG.error("main(): trevor.area(): {}", trevor.area());
    LOG.error("main(): geofery.area(): {}", geofery.area());
    LOG.error("main(): trevor.perimiter(): {}", trevor.perimiter());
    LOG.error("main(): geofery.perimiter(): {}", geofery.perimiter());

    LOG.error("main(): james.area(): {}", james.area());
    LOG.error("main(): thomas.area(): {}", thomas.area());
    LOG.error("main(): james.perimiter(): {}", james.perimiter());
    LOG.error("main(): thomas.perimiter(): {}", thomas.perimiter());

    LOG.error("main(): clarence.area(): {}", clarence.area());
    LOG.error("main(): don.area(): {}", don.area());
    LOG.error("main(): clarence.perimiter(): {}", clarence.perimiter());
    LOG.error("main(): don.perimiter(): {}", don.perimiter());
  }

  private static void print(int count) {
    LOG.trace("print(): Hello World :) {}", count);
    LOG.debug("print(): Hello World :) {}", count);
    LOG.info("print(): Hello World :) {}", count);
    LOG.warn("print(): Hello World :) {}", count);
    LOG.error("print(): Hello World :) {}", count);
  }
}
