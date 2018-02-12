package org.usfirst.frc4930.Timrek;

import org.usfirst.frc4930.Timrek.commands.*;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class OI {

	public Joystick j0;
	public Joystick j1;
	public Joystick j2;

	public JoystickButton j0b1;
	public JoystickButton j0b2;
	public JoystickButton j0b3;
	public JoystickButton j0b4;
	public JoystickButton j0b5;
	public JoystickButton j0b6;
	public JoystickButton j0b7;
	public JoystickButton j0b8;
	public JoystickButton j0b9;
	public JoystickButton j0b10;
	public JoystickButton j0b11;
	public JoystickButton j0b12;

	public JoystickButton j1b1;
	public JoystickButton j1b2;
	public JoystickButton j1b3;
	public JoystickButton j1b4;
	public JoystickButton j1b5;
	public JoystickButton j1b6;
	public JoystickButton j1b7;
	public JoystickButton j1b8;
	public JoystickButton j1b9;
	public JoystickButton j1b10;
	public JoystickButton j1b11;
	public JoystickButton j1b12;

	public JoystickButton j2b1;
	public JoystickButton j2b2;
	public JoystickButton j2b3;
	public JoystickButton j2b4;
	public JoystickButton j2b5;
	public JoystickButton j2b6;
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

		j0b1 = new JoystickButton(j0, 1);
		j0b2 = new JoystickButton(j0, 2);
		j0b3 = new JoystickButton(j0, 3);
		j0b4 = new JoystickButton(j0, 4);
		j0b5 = new JoystickButton(j0, 5);
		j0b6 = new JoystickButton(j0, 6);
		j0b7 = new JoystickButton(j0, 7);
		j0b8 = new JoystickButton(j0, 8);
		j0b9 = new JoystickButton(j0, 9);
		j0b10 = new JoystickButton(j0, 10);
		j0b11 = new JoystickButton(j0, 11);
		j0b12 = new JoystickButton(j0, 12);

		j1b1 = new JoystickButton(j1, 1);
		j1b2 = new JoystickButton(j1, 2);
		j1b3 = new JoystickButton(j1, 3);
		j1b4 = new JoystickButton(j1, 4);
		j1b5 = new JoystickButton(j1, 5);
		j1b6 = new JoystickButton(j1, 6);
		j1b7 = new JoystickButton(j1, 7);
		j1b8 = new JoystickButton(j1, 8);
		j1b9 = new JoystickButton(j1, 9);
		j1b10 = new JoystickButton(j1, 10);
		j1b11 = new JoystickButton(j1, 11);
		j1b12 = new JoystickButton(j1, 12);

		j2b1 = new JoystickButton(j2, 1);
		j2b2 = new JoystickButton(j2, 2);
		j2b3 = new JoystickButton(j2, 3);
		j2b4 = new JoystickButton(j2, 4);
		j2b5 = new JoystickButton(j2, 5);
		j2b6 = new JoystickButton(j2, 6);
		j2b7 = new JoystickButton(j2, 7);
		j2b8 = new JoystickButton(j2, 8);
		j2b9 = new JoystickButton(j2, 9);
		j2b10 = new JoystickButton(j2, 10);
		j2b11 = new JoystickButton(j2, 11);
		j2b12 = new JoystickButton(j2, 12);

		// Shifter
		j0b1.whenPressed(new ShiftIntoHighGear());
		j0b1.whenReleased(new ShiftIntoLowGear());

		// DropWheel
		j1b1.whenPressed(new DropWheelDown());
		j1b1.whenReleased(new DropWheelUp());

		// PTO
		j1b7.whenPressed(new PTODisengage());
		j1b8.whenPressed(new PTOEngage());

		// Claw
		j1b11.whenPressed(new ClawOpen());
		j1b12.whenPressed(new ClawClose());
		j2b3.whileHeld(new ClawIntake());
		j2b4.whileHeld(new ClawOuttake());

		// Mast
		j2b10.whileHeld(new MastUp());
		j2b12.whileHeld(new MastDown());
	}

}
