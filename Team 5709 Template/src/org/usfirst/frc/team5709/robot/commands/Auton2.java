package org.usfirst.frc.team5709.robot.commands;
import edu.wpi.first.wpilibj.command.CommandGroup;

public class Auton2 extends CommandGroup {

	public Auton2(){
		addSequential(new AutoDrive(1.0, 1.0, 1.0));
		addSequential(new AutoShoot(1.0));
		addSequential(new BallStop());
		addSequential(new AutoDrive(1.0, 1.0, 1.5));
		addParallel(new AutoInTake(2.0));
		addSequential(new BallStop());
		addParallel(new AutoDrive(1.0, 1.0, 2.0));
		addSequential(new AutoDrive(1.0, .5, 3.5));
		addSequential(new AutoShoot(1.0));
		addSequential(new BallStop());
		addSequential(new AutoDrive(1.0, -1.0, 1.0));
		addSequential(new AutoDrive(0.0, 0.0, 0.0));
	}
}
