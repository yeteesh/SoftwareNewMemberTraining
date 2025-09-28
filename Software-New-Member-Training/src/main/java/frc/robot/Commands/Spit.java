package frc.robot.Commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.Subsystems.Intake;
import frc.robot.Constants;

public class Spit extends Command{

    private Intake mIntake = Intake.getInstance();

    public Spit() {
        addRequirements(mIntake);
    }

    @Override
    public void execute() {
        mIntake.setIntakeSpeed(Constants.kIntake.kSpit.kspitdutycycle);
    }

    public void end (boolean interrupted) {
        mIntake.setIntakeSpeed(0);
    }

    public boolean isFinished() {
        return false;
    }

    
}
