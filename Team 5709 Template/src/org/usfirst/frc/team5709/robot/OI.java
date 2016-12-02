package org.usfirst.frc.team5709.robot;

import org.usfirst.frc.team5709.robot.commands.DriveSlow;
import org.usfirst.frc.team5709.robot.commands.PreInTake;
import org.usfirst.frc.team5709.robot.commands.TeleopInTake;
import org.usfirst.frc.team5709.robot.commands.TeleopShoot;
import org.usfirst.frc.team5709.robot.commands.TurnAround;
import org.usfirst.frc.team5709.robot.commands.Auton;
import org.usfirst.frc.team5709.robot.commands.Auton2;
import org.usfirst.frc.team5709.robot.commands.BallStop;
import org.usfirst.frc.team5709.robot.triggers.DoubleButton;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class OI {Joystick Driver = new Joystick(0);

	//Creating buttons
	JoystickButton TeleopShoot1;
	JoystickButton TeleopInTake1;
	JoystickButton PreInTake1;
	JoystickButton DriveSlow1;
	JoystickButton Auton1;
	JoystickButton Auton;
	JoystickButton StopBall;
	DoubleButton TurnAround1;

	public OI(){
		TeleopShoot1 = new JoystickButton(Driver, 1);
		TeleopInTake1 = new JoystickButton(Driver, 2);
		PreInTake1 = new JoystickButton(Driver, 7);
		DriveSlow1 = new JoystickButton(Driver, 8);
		Auton1 = new JoystickButton(Driver, 9);
		Auton = new JoystickButton(Driver, 10);
		TurnAround1 = new DoubleButton(Driver, 7, 8);
		StopBall = new JoystickButton(Driver, 3);
		
		//Assigning Buttons
		StopBall.whileHeld(new BallStop());
		TeleopShoot1.whileHeld(new TeleopShoot());
		PreInTake1.whileActive(new PreInTake());
		DriveSlow1.whileHeld(new DriveSlow());
		TeleopInTake1.whileActive(new TeleopInTake());
		Auton.whenPressed(new Auton());
		Auton1.whenPressed(new Auton2());
		TurnAround1.whenActive(new TurnAround(1, -1, 0.345));
		
		//Smart Dash board Buttons
		SmartDashboard.putData("Shoot", new TeleopShoot());
		SmartDashboard.putData("Turn Around", new TurnAround(1.0, -1.0, 0.345));
		SmartDashboard.putData("Slow Drive", new DriveSlow());
		SmartDashboard.putData("Auto In Take", new PreInTake());
		SmartDashboard.putData("In Take", new TeleopInTake());
		SmartDashboard.putData("Auton1", new Auton());
		SmartDashboard.putData("Auton2", new Auton2());
		
	}

	public Joystick getJoystick(){
		return Driver;

	}
}
