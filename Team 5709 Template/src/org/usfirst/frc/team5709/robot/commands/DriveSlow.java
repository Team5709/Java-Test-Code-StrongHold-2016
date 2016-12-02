package org.usfirst.frc.team5709.robot.commands;

import org.usfirst.frc.team5709.robot.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class DriveSlow extends Command{
	
	@Override
	protected void initialize() {
		
	}

	@Override
	protected void execute() {
		Robot.DriveTrain.DriveSlow(Robot.oi.getJoystick());
	}

	@Override
	protected boolean isFinished() {
		return true;
	}

	@Override
	protected void end() {
		
	}

	@Override
	protected void interrupted() {
		
	}

}
