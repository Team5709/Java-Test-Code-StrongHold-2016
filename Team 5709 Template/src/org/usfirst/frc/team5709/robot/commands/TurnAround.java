package org.usfirst.frc.team5709.robot.commands;

import org.usfirst.frc.team5709.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

public class TurnAround extends Command{
	
	double Left_Speed, Right_Speed, Time;
	
	public TurnAround(double Left_Speedp, double Right_Speedp, double Timep){
		Left_Speed = Left_Speedp;
		Right_Speed = Right_Speedp;
		Time = Timep;
	}
	
	@Override
	protected void initialize() {
		
	}

	@Override
	protected void execute() {
		Robot.DriveTrain.TurnAround(Left_Speed, Right_Speed);
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
