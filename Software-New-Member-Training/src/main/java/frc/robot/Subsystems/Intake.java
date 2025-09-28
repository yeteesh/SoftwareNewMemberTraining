package frc.robot.Subsystems;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;


public class Intake extends SubsystemBase {

    SparkMax intakeMotor;
    private static Intake mIntake;
    public Intake() {
        intakeMotor = new SparkMax(Constants.kIntake.IntakeMotor_ID, MotorType.kBrushless);


    }

    public static Intake getInstance() {
        if (mIntake == null) {
            mIntake = new Intake();
        }
        return mIntake;
    }

    public void setIntakeSpeed(double speed) {
        intakeMotor.set(speed);
    }
}
