package org.usfirst.frc.team5709.robot.commands;

import org.usfirst.frc.team5709.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
//import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

public class AutoInTake extends Command{
	
	double Time;
	public AutoInTake(double Timep){
		Time = Timep;
	}

	@Override
	protected void initialize() {
	}

	@Override
	protected void execute() {
		//Timer.delay(Time2);
		Robot.Ball.InTake(-0.5, 0.5);
		Timer.delay(1);
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
		//Robot.Ball.Stop();
	}
}
