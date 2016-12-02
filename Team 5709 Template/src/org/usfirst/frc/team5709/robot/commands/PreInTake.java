package org.usfirst.frc.team5709.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class PreInTake extends CommandGroup{

	public PreInTake(){
		addSequential(new AutoDrive(.75, .75, 1.0));
		addParallel(new AutoInTake(1.0));
		addSequential(new BallStop());
	}
}
