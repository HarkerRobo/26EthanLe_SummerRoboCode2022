package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import harkerrobolib.wrappers.HSTalon;

public class Elevator extends SubsystemBase{
    private HSTalon Master;
    private HSTalon Follower;
    private VictorSPX Follower1;
    private VictorSPX Follower2;

    public static final int MASTER_ID = 0;
    public static final int FOLLOWER_ID = 0;
    public static final int FOLLOWER1_ID = 0;
    public static final int FOLLOWER2_ID = 0;

    private static final boolean MASTER_INVERT = false;
    private static final boolean FOLLOWER_INVERT = false;
    private static final boolean FOLLOWER1_INVERT = false;
    private static final boolean FOLLOWER2_INVERT = false;

    private static Elevator instance;

    private Elevator() {
        Master = new HSTalon(MASTER_ID);
        Follower = new HSTalon(FOLLOWER_ID);
        Follower1 = new VictorSPX(FOLLOWER1_ID);
        Follower2 = new VictorSPX(FOLLOWER2_ID);
        Follower.follow(Master);
        Follower1.follow(Master);
        Follower2.follow(Master);
        Master.setInverted(MASTER_INVERT);
        Follower.setInverted(FOLLOWER_INVERT);
        Follower1.setInverted(FOLLOWER1_INVERT);
        Follower2.setInverted(FOLLOWER2_INVERT);
    }

    public void setPercentOutput(double value) {
        Master.set(ControlMode.PercentOutput, value);
    }

    public static Elevator getInstance() {
        if(instance == null) {
            instance = new Elevator();
        }
        return instance;
    }
    
}
