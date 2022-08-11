package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class HatchLatcher extends SubsystemBase {
    private static HatchLatcher instance;
    private DoubleSolenoid flower;
    private DoubleSolenoid extender;
    private static final int FLOWER_FORWARD_ID = 0;
    private static final int FLOWER_REVERSE_ID = 0;
    private static final int EXTENDER_FORWARD_ID = 0;
    private static final int EXTENDER_REVERSE_ID = 0;

    private HatchLatcher() {
        flower = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, FLOWER_FORWARD_ID, FLOWER_REVERSE_ID);
        extender = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, EXTENDER_FORWARD_ID, EXTENDER_REVERSE_ID);
    }

    public void toggleFlower() {
        if(flower.get() == DoubleSolenoid.Value.kOff) {
            flower.set(DoubleSolenoid.Value.kForward);
        } else if(flower.get() == DoubleSolenoid.Value.kForward) {
            flower.set(DoubleSolenoid.Value.kReverse);
        } else {
            flower.set(DoubleSolenoid.Value.kForward);
        }
    }
    
    public void toggleExtender() {
        if(extender.get() == DoubleSolenoid.Value.kOff) {
            extender.set(DoubleSolenoid.Value.kForward);
        } else if(extender.get() == DoubleSolenoid.Value.kForward) {
            extender.set(DoubleSolenoid.Value.kReverse);
        } else {
            extender.set(DoubleSolenoid.Value.kForward);
        }
    }
    
    public static HatchLatcher getInstance() {
        if(instance == null) {
            instance = new HatchLatcher();
        }
        return instance;
    }
}
