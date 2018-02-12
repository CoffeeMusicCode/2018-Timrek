package org.usfirst.frc4930.Timrek.commands;

import org.usfirst.frc4930.Timrek.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class ShiftIntoLowGear extends Command{
	  public ShiftIntoLowGear() {
		    requires(Robot.shifter);
		  }

		  protected void initialize() {}

		  protected void execute() {
		    Robot.shifter.setLowGear();
		  }

		  protected boolean isFinished() {
		    return true;
		  }

		  protected void end() {}

		  protected void interrupted() {
		    end();
		  }
}
