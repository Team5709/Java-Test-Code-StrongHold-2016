
package org.usfirst.frc.team5709.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;
import org.usfirst.frc.team5709.robot.commands.Auton;
import org.usfirst.frc.team5709.robot.commands.Auton2;
import org.usfirst.frc.team5709.robot.subsystems.Ball;
//import org.usfirst.frc.team5709.robot.subsystems.CameraFeeds;
import org.usfirst.frc.team5709.robot.subsystems.DriveTrain;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Robot extends IterativeRobot {
	public static DriveTrain DriveTrain;
	public static Ball Ball;
	public static OI oi;
	//CameraFeeds CameraFeeds;
    Command autonomousCommand;
    SendableChooser chooser;
    
    public void robotInit() {
    	//CameraFeeds = new CameraFeeds(Robot.oi.Driver);
    	DriveTrain = new DriveTrain();
    	oi = new OI();
    	Ball = new Ball();
        chooser = new SendableChooser();
        chooser.addDefault("Default Auto", new Auton());
        chooser.addObject("My Auto", new Auton2());
        SmartDashboard.putData("Auto mode", chooser);
    }
	
    public void disabledInit(){
    	//CameraFeeds.end();
    }
	
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}
	
    public void autonomousInit() {
        autonomousCommand = (Command) chooser.getSelected();
        
		 String autoSelected = SmartDashboard.getString("Auto Selector", "Default");
		 switch(autoSelected) {
		case "My Auto":
			autonomousCommand = new Auton2();
			break;
		case "Default Auto":
		default:
			autonomousCommand = new Auton();
			break;
		} 
    	
        if (autonomousCommand != null) autonomousCommand.start();
    }

    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
        if (autonomousCommand != null) autonomousCommand.cancel();
        //CameraFeeds.init();
    }

    public void teleopPeriodic() {
        Scheduler.getInstance().run();
        log();
    }

	public void testPeriodic() {
        LiveWindow.run();
    }
	
	private void log() {
		
	}
    
}
