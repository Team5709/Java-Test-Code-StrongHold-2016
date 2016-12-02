package org.usfirst.frc.team5709.robot.commands;

import org.usfirst.frc.team5709.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

public class AutoDrive extends Command {
	
	Double LSpeed, RSpeed, Time;
	public AutoDrive(double LSpeedp, double RSpeedp, double Timep){
		LSpeed = LSpeedp;
		RSpeed = RSpeedp;
		Time = Timep;
	}

	@Override
	protected void initialize() {
	}

	@Override
	protected void execute() {
		Robot.DriveTrain.AutoDrive(LSpeed, RSpeed);
		Timer.delay(Time);
	}

	@Override
	protected boolean isFinished() {
		return true;
	}

	@Override
	protected void end() {
		//Robot.DriveTrain.Stop();
		
	}

	@Override
	protected void interrupted() {
		//Robot.DriveTrain.Stop();
		
	}

}
