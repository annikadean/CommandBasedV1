package org.usfirst.frc.team2220.robot.subsystems;

import org.usfirst.frc.team2220.robot.RobotMap;
import org.usfirst.frc.team2220.robot.commands.*;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Clawz extends Subsystem {


    public void open() {
    	RobotMap.clawzSolenoid.set(DoubleSolenoid.Value.kForward);
    }

    public void close() {
    	RobotMap.clawzSolenoid.set(DoubleSolenoid.Value.kReverse);
    }

    public void initDefaultCommand() 
    {
    	setDefaultCommand(new ClawzClose());
    }
}

