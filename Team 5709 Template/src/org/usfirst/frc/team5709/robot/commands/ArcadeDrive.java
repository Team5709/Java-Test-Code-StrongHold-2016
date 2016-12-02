package org.usfirst.frc.team5709.robot.commands;

import org.usfirst.frc.team5709.robot.Robot;
import edu.wpi.first.wpilibj.command.Command;

public class ArcadeDrive extends Command{

	public ArcadeDrive(){
		requires(Robot.DriveTrain);
	}
	@Override
	protected void initialize() {
		
	}

	@Override
	protected void execute() {
		Robot.DriveTrain.Drive(Robot.oi.getJoystick());
		
	}

	@Override
	protected boolean isFinished() {
		return false;
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
