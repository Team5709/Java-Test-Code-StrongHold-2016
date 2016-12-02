package org.usfirst.frc.team5709.robot.triggers;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Trigger;

public class DoubleButton extends Trigger{
	private Joystick Joy;
	private int Button1, Button2;
	
	public DoubleButton(Joystick Joy, int Button1, int Button2){
		this.Joy = Joy;
		this.Button1 = Button1;
		this.Button2 = Button2;
	}

	@Override
	public boolean get() {
		return Joy.getRawButton(Button1) && Joy.getRawButton(Button2);
	}

}
