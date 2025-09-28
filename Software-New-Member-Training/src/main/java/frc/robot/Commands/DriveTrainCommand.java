package frc.robot.Commands;

import java.util.function.DoubleSupplier;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Subsystems.Drive_Train;

public class DriveTrainCommand extends Command {

        private Drive_Train mDrivetrain = Drive_Train.getInstance();
        private double RightTriggerValue, LeftTriggerValue, LeftjoyValue;
        private double overallspeed;
        private double leftspeed, rightspeed;
        private DoubleSupplier LeftTrigger, RightTrigger, Leftjoy;
    

        // You can decide the what each button on the controller will do
        
        public DriveTrainCommand(DoubleSupplier LeftTrigger, DoubleSupplier RightTrigger, DoubleSupplier Leftjoy) {
            this.LeftTrigger = LeftTrigger;
            this.RightTrigger = RightTrigger;
            this.Leftjoy = Leftjoy;
            addRequirements(mDrivetrain);
        }

    @Override
    public void execute() {
        //calculate Speed for the right and left motors

        overallspeed = RightTriggerValue - LeftTriggerValue;
        leftspeed = overallspeed + LeftjoyValue;
        rightspeed = overallspeed - LeftjoyValue;

        //set the speed to the drivetrain
        mDrivetrain.setspeed(LeftTrigger.getAsDouble(), RightTrigger.getAsDouble());
    
    }

    public void intialize() {

    }

    public void end(boolean interrupted) {
        mDrivetrain.setspeed(0, 0);
    }


    public boolean isFinished() {
        return false;
    }   
    
}
