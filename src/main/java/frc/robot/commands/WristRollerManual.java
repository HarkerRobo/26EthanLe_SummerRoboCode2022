package frc.robot.commands;

import frc.robot.OI;
import frc.robot.subsystems.Intake;
import frc.robot.subsystems.WristRoller;
import harkerrobolib.commands.IndefiniteCommand;

public class WristRollerManual extends IndefiniteCommand{
    public WristRollerManual() {
        addRequirements(WristRoller.getInstance());
    }
    public void execute() {
        if (Intake.getInstance().isIntaking()) {
            WristRoller.getInstance().setPercentOutput(0.3);
        } else if(OI.getInstance().getDriver().getLeftTrigger()>0.5) {
            WristRoller.getInstance().setPercentOutput(-0.3);
        } else {
            WristRoller.getInstance().setPercentOutput(0.1);
        }
    }
    
    public void end(boolean interrupted) {
        WristRoller.getInstance().setPercentOutput(0);
    }
}
