package frc.robot;

import frc.robot.commands.ToggleExtender;
import frc.robot.commands.ToggleFlower;
import frc.robot.commands.ToggleIntake;
import harkerrobolib.wrappers.XboxGamepad;

public class OI {
    private XboxGamepad driver;
    private static final int DRIVER_ID = 0;
    private static OI instance;
    private OI() {
        driver = new XboxGamepad(DRIVER_ID);
        initBinding();
    }

    public void initBinding() {
        driver.getButtonA().whenPressed(new ToggleIntake());
        driver.getButtonB().whenPressed(new ToggleFlower());
        driver.getButtonX().whenPressed(new ToggleExtender());
    }

    public static OI getInstance() {
        if(instance == null) {
            instance = new OI();
        }
        return instance;
    }

    public XboxGamepad getDriver() {
        return driver;
    }
}
