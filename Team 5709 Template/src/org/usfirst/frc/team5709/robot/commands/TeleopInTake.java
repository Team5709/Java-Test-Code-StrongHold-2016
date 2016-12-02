package org.usfirst.frc.team5709.robot.commands;

//import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team5709.robot.Robot;

public class TeleopInTake extends Command {
	@Override
	protected void initialize() {
	}

	@Override
	protected void execute() {
		while(Robot.oi.getJoystick().getRawButton(2) == true){
			Robot.Ball.InTake(-0.5, 0.5);
		}
		Robot.Ball.Stop();
		//Timer.delay(1);
	}

	@Override
	protected boolean isFinished() {
		return true;
	}

	@Override
	protected void end() {
		Robot.Ball.Stop();
	}

	@Override
	protected void interrupted() {
		end();
	}

}
