package frc.robot.Subsystems;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.Spark;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

import com.revrobotics.spark.SparkMax;
import com.revrobotics.spark.SparkLowLevel.MotorType;

public class Drive_Train extends SubsystemBase {
    SparkMax leftMotor;
    SparkMax rightMotor;

    


    public Drive_Train () {
        leftMotor = new SparkMax(Constants.kDrivetrain.LeftMotor_ID, MotorType.kBrushless);
        rightMotor = new SparkMax(Constants.kDrivetrain.RightMotor_ID, MotorType.kBrushless);

        DifferentialDrive drive = new DifferentialDrive(leftMotor, rightMotor);
    }

    private static Drive_Train mDrivetrain;

    public static Drive_Train getInstance() {
        if (mDrivetrain == null) {
            mDrivetrain = new Drive_Train();
        }
        return mDrivetrain;
    }

    public void setspeed(double asDouble, double asDouble2) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setspeed'");
    }

    public Object setMulti(double d) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'setMulti'");
    }

    

    
    
}
