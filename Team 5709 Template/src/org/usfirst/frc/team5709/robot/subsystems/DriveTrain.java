package org.usfirst.frc.team5709.robot.subsystems;

import org.usfirst.frc.team5709.robot.RobotMap;
import org.usfirst.frc.team5709.robot.commands.ArcadeDrive;

//import edu.wpi.first.wpilibj.ADXRS450_Gyro;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
//import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class DriveTrain extends Subsystem{
	private RobotDrive MainDrive = new RobotDrive(RobotMap.DriveL, RobotMap.DriveR);
	//private ADXRS450_Gyro Gyro = new ADXRS450_Gyro();
	
	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new ArcadeDrive());
	}
	
	public void AutoDrive(double TurnAngle, double Time){
		MainDrive.tankDrive(TurnAngle, Time);
		
		/*double Timer = 0;
		double Kp = 0.3;
		
		while(Timer < Time){
			double Angle = Gyro.getAngle();
			Gyro.reset();
			MainDrive.drive(1, -Angle*Kp-TurnAngle);
			SmartDashboard.putData("Gyro Andgle",Gyro);
			Timer ++;
		}*/
	}
	
	public void Drive(Joystick Driver){
		MainDrive.arcadeDrive(-Driver.getY(), -Driver.getX());
	}
	
	public void TurnAround(double Left_Speed, double Right_Speed){
		MainDrive.tankDrive(Left_Speed, Right_Speed);
	}
	
	public void DriveSlow(Joystick Driver){
		MainDrive.arcadeDrive(-Driver.getY()*.75, Driver.getX()*.75);
	}
	
	public void Stop(){
		MainDrive.tankDrive(0, 0);
	}
}
