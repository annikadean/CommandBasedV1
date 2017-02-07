package org.usfirst.frc.team2220.robot;

import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team2220.robot.commands.*;
import edu.wpi.first.wpilibj.Joystick;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	public static Joystick stick = new Joystick(0);
	public static int lAxis = 1;
	public static int rAxis = 5;
	public static int motorValueOff = 0;
	
	
	/**
	 * Xbox button bindings
	 */
	public static Button aButton = new JoystickButton(stick, 1);
	/*
	private static Button bButton = new JoystickButton(stick, 2);
	private static Button xButton = new JoystickButton(stick, 2);
	private static Button yButton = new JoystickButton(stick, 2);
	*/
	public static void init()
	{
		aButton.whileHeld(new ClawzOpen());
		/*
		aButton.whileHeld(new DriveOff());
		bButton.whileHeld(new SlowDrive());
		*/
		
	}
}
