// RobotBuilder Version: 2.0
//
// This file was generated by RobotBuilder. It contains sections of
// code that are automatically generated and assigned by robotbuilder.
// These sections will be updated in the future when you export to
// Java from RobotBuilder. Do not put any code or make any change in
// the blocks indicating autogenerated code or it will be lost on an
// update. Deleting the comments indicating the section will prevent
// it from being updated in the future.


package org.usfirst.frc4930.Timrek;

import org.usfirst.frc4930.Timrek.commands.*;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	public Joystick j0;
	public Joystick j1;
	public Joystick j2;
	
	public JoystickButton j1b1;
	public JoystickButton j1b3;
	public JoystickButton j1b4;
	public JoystickButton j1b7;
	public JoystickButton j1b8;
	public JoystickButton j1b9;
	public JoystickButton j1b10;
	public JoystickButton j1b11;
	public JoystickButton j1b12;
	
	
	
	public JoystickButton j2b3;
	public JoystickButton j2b4;
	public JoystickButton j2b7;
	public JoystickButton j2b8;
	public JoystickButton j2b9;
	public JoystickButton j2b10;
	public JoystickButton j2b11;
	public JoystickButton j2b12;
	
    public OI() {
       j0 = new Joystick(0);
       j1 = new Joystick(1);
       j2 = new Joystick(2);

       j1b1 = new JoystickButton(j1, 1);
       j1b3 = new JoystickButton(j1, 3);
       j1b4 = new JoystickButton(j1, 4);
       j1b7 = new JoystickButton(j1, 7);
       j1b8 = new JoystickButton(j1, 8);
       j1b9 = new JoystickButton(j1, 9);
       j1b10 = new JoystickButton(j1, 10);
       j1b11 = new JoystickButton(j1, 11);
       j1b12 = new JoystickButton(j1, 12);
       
       j2b3 = new JoystickButton(j2, 3);
       j2b4 = new JoystickButton(j2, 4);
       j2b7 = new JoystickButton(j2, 7);
       j2b8 = new JoystickButton(j2, 8);
       j2b9 = new JoystickButton(j2, 9);
       j2b10 = new JoystickButton(j2, 10);
       j2b11 = new JoystickButton(j2, 11);
       j2b12 = new JoystickButton(j2, 12);

       
       
       //Shifter (Solenoid 0)
       j1b3.whenPressed(new LowGear()); //Set True
       j1b4.whenPressed(new HighGear());  //Set False
       
       //PTO (Solenoid 1)
       j1b7.whenPressed(new Disengage()); //Set True
       j1b8.whenPressed(new Engage());  //Set False
       
       //DropWheel (Solenoid 2)
//       j1b9.whenPressed(new Drop());   //Set True
//       j1b10.whenPressed(new Raise()); //Set False
       j1b1.whileHeld(new MoveDropWheel());
       
       //Claw (Solenoid 4)
       j1b11.whenPressed(new ClawOpen()); //Set True
       j1b12.whenPressed(new ClawClose()); //Set False
       
       //Intake 
       j2b3.whileHeld(new Intake()); 
       j2b4.whileHeld(new Outtake());
      
    }

}

