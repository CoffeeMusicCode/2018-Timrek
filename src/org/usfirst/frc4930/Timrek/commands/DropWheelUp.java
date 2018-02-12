package org.usfirst.frc4930.Timrek.commands;

import org.usfirst.frc4930.Timrek.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class DropWheelUp extends Command {
	 public DropWheelUp() {
		    requires(Robot.dropWheel);
		  }

		  protected void initialize() {}

		  protected void execute() {
		    Robot.dropWheel.raise();
		  }

		  protected boolean isFinished() {
		    return true;
		  }

		  protected void end() {}

		  protected void interrupted() {
		    end();
		  }
}
