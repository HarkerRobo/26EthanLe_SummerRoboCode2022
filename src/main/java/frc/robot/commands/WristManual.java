package frc.robot.commands;

import frc.robot.OI;
import frc.robot.subsystems.Wrist;
import harkerrobolib.commands.IndefiniteCommand;

public class WristManual extends IndefiniteCommand{
    public WristManual() {
        addRequirements(Wrist.getInstance());
    }
    public void execute() {
        if (OI.getInstance().getDriver().getUpDPadButton().get()) {
            Wrist.getInstance().setPercentOutput(0.7);
        } else if (OI.getInstance().getDriver().getUpDPadButton().get()){
            Wrist.getInstance().setPercentOutput(-0.7);
        } else {
            Wrist.getInstance().setPercentOutput(0.2);
        }
    }
    
    public void end(boolean interrupted) {
        Wrist.getInstance().setPercentOutput(0);
    }
}
