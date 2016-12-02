package org.usfirst.frc.team5709.robot.commands;

import org.usfirst.frc.team5709.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
//import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

public class TeleopShoot extends Command {
	
	@Override
	protected void initialize() {
	}

	@Override
	protected void execute() {
		Robot.Ball.Shoot(1.0, -1.0);
		//setTimeout(1);
		Timer.delay(1);
		Robot.Ball.Stop();
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
