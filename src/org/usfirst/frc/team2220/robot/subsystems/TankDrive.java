package org.usfirst.frc.team2220.robot.subsystems;

import com.ctre.CANTalon;

import edu.wpi.first.wpilibj.command.Subsystem;

import org.usfirst.frc.team2220.robot.OI;
import org.usfirst.frc.team2220.robot.RobotMap;
import org.usfirst.frc.team2220.robot.commands.DriveWithControllers;;

/**
 *
 */
public class TankDrive extends Subsystem {

	public static double scale = 1;
	
	public void controllerTank()
	{
		double lVal = OI.stick.getRawAxis(OI.lAxis) * -1 * scale;
		double rVal = OI.stick.getRawAxis(OI.rAxis) * scale;
		RobotMap.rightMaster.set(rVal);
		RobotMap.leftMaster.set(lVal);
	}
	
	public void stopMotors()
	{
		RobotMap.rightMaster.set(0);
		RobotMap.leftMaster.set(0);
	}

    public double getScale()
    {
    	return TankDrive.scale;
    }
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
	@Override
    protected void initDefaultCommand()
    {
    	setDefaultCommand(new DriveWithControllers());
    }
}

