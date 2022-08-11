package frc.robot.commands;

import frc.robot.OI;
import frc.robot.subsystems.Elevator;
import harkerrobolib.commands.IndefiniteCommand;

public class ElevatorManual extends IndefiniteCommand{
    public ElevatorManual() {
        addRequirements(Elevator.getInstance());
    }

    public void execute() {
        double value = OI.getInstance().getDriver().getRightY();
        if (Math.abs(value) < 0.1) {
            Elevator.getInstance().setPercentOutput(0.1);
        } else {
            Elevator.getInstance().setPercentOutput(value);
        }
    }
    
    public void end(boolean interrupted) {
        Elevator.getInstance().setPercentOutput(0);
    }
}
