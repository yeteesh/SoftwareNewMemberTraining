package frc.robot;

public class Constants {
    public abstract static class kDrivetrain{
        //List the ID from the rev hardware client, change the number given.
        public static final int LeftMotor_ID = 1;
        public static final int RightMotor_ID = 2;
    }

    public abstract static class kIntake{

        //List the ID from the rev hardware client, change the number given.
        public static final int IntakeMotor_ID = 3;

        public abstract static class kSpit{

            public static double kspitdutycycle = 0.5;
        }
    }

    public static class OperatorConstants {
        public static final int kDriverController = 0;
        public static final int kManipController = 1;
    }

    
    
}
