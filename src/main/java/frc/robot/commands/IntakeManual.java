package frc.robot.commands;

import frc.robot.OI;
import frc.robot.subsystems.Intake;
import harkerrobolib.commands.IndefiniteCommand;

public class IntakeManual extends IndefiniteCommand{
    public IntakeManual() {
        addRequirements(Intake.getInstance());
    }

    public void execute() {
        if (OI.getInstance().getDriver().getRightTrigger() > 0.5) {
            Intake.getInstance().setPercentOutput(0.3);
        } else {
            Intake.getInstance().setPercentOutput(0);
        }
    }
    
    public void end(boolean interrupted) {
        Intake.getInstance().setPercentOutput(0);
    }
}
