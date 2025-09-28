// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.Commands.DriveTrainCommand;
import frc.robot.Commands.Spit;
import frc.robot.Subsystems.Drive_Train;

public class RobotContainer {
  Drive_Train mDriveTrain = Drive_Train.getInstance();


  private final CommandXboxController m_driverController =
      new CommandXboxController(Constants.OperatorConstants.kDriverController);
  private final CommandXboxController m_manipController =
      new CommandXboxController(Constants.OperatorConstants.kManipController);





  public RobotContainer() {
    mDriveTrain.setDefaultCommand(
        new DriveTrainCommand(
          ()-> -m_driverController.getLeftY(),
          ()-> m_driverController.getRightY(), 
          ()-> m_driverController.getLeftX()
          ));

          m_driverController.leftStick().onTrue(Drive_Train.getInstance().runOnce(() -> Drive_Train.getInstance().setMulti(0.2)));
          m_driverController.rightStick().onTrue(Drive_Train.getInstance().runOnce(() -> Drive_Train.getInstance().setMulti(0.4)));
    configureBindings();
  }

  private void configureBindings() {

    m_manipController.x().whileTrue(new Spit());
  }

  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }
}
