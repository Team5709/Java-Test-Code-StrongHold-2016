package org.usfirst.frc.team5709.robot.subsystems;

import org.usfirst.frc.team5709.robot.RobotMap;
//import org.usfirst.frc.team5709.robot.commands.BallStop;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;

public class Ball extends Subsystem {
	private SpeedController BallL = new Victor(RobotMap.BallL);
	private SpeedController BallR = new Victor(RobotMap.BallR);
	
	@Override
	protected void initDefaultCommand() {
		//setDefaultCommand(new ShootNIntake());
	}
	
	public void Shoot(double PosSpeed, double NegSpeed){
		BallL.set(PosSpeed);
		BallR.set(NegSpeed);
	}
	
	public void InTake(double PosSpeed, double NegSpeed){
		BallL.set(NegSpeed);
		BallR.set(PosSpeed);
	}
	
	public void Stop(){
		BallL.set(0);
		BallR.set(0);
	}

}
