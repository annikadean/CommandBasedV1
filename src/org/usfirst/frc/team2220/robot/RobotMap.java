package org.usfirst.frc.team2220.robot;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.DoubleSolenoid;
//t edu.wpi.first.wpilibj.Solenoid;

import org.usfirst.frc.team2220.robot.subsystems.*;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	public static CANTalon rightMaster;
	public static CANTalon leftMaster;
	public static CANTalon rightSlave;
	public static CANTalon leftSlave;

	public static DoubleSolenoid clawzSolenoid;
	public static Clawz clawz;
	
	public static TankDrive drive;
	
	
	public static void init()
	{
		clawzSolenoid = new DoubleSolenoid(0,1);
		clawz = new Clawz();

		drive = new TankDrive();
		rightMaster = new CANTalon(1);
		leftMaster  = new CANTalon(2);
		rightSlave = new CANTalon(3);
		leftSlave  = new CANTalon(4);
		
		leftSlave.changeControlMode(CANTalon.TalonControlMode.Follower);
		rightSlave.changeControlMode(CANTalon.TalonControlMode.Follower);
		leftSlave.set(leftMaster.getDeviceID());
		rightSlave.set(rightMaster.getDeviceID());
		
	}
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
}