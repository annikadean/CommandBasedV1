package org.usfirst.frc.team2220.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team2220.robot.RobotMap;
/**
 *
 */
public class ClawzOpen extends Command {

    public ClawzOpen() {
        requires(RobotMap.clawz);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() 
    {
    	RobotMap.clawz.open();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
