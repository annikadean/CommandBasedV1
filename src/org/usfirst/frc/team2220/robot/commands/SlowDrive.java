package org.usfirst.frc.team2220.robot.commands;

import org.usfirst.frc.team2220.robot.RobotMap;
import org.usfirst.frc.team2220.robot.subsystems.TankDrive;

import edu.wpi.first.wpilibj.command.Command;

public class SlowDrive extends Command {

	public SlowDrive() 
	{
        requires(RobotMap.drive);
    }

    // Called just before this Command runs the first time
    protected void initialize() 
    {
    	
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() 
    {
    	TankDrive.scale = .5;
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    @Override
    protected void end() 
    {
    	TankDrive.scale = 1;
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() 
    {
    }

}
