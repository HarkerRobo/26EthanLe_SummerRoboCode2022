package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.HatchLatcher;

public class ToggleExtender extends CommandBase {

    public ToggleExtender() {
        addRequirements(HatchLatcher.getInstance());
    }

    public void intialize() {
        HatchLatcher.getInstance().toggleFlower();
    }
}
