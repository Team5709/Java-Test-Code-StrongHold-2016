package org.usfirst.frc.team5709.robot.commands;

import org.usfirst.frc.team5709.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
//import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

public class AutoShoot extends Command {
	
	double Time;
	
	public AutoShoot(double Timep){
		Time = Timep;
	}
	@Override
	protected void initialize() {
		
	}

	@Override
	protected void execute() {
		Robot.Ball.Shoot(1, -1);
		Timer.delay(Time);
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
		Robot.Ball.Stop();
	}

}
