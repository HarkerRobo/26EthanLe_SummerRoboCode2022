package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.HatchLatcher;

public class ToggleFlower extends CommandBase{

    public ToggleFlower() {
        addRequirements(HatchLatcher.getInstance());
    }

    public void intialize() {
        HatchLatcher.getInstance().toggleFlower();
    }
}
