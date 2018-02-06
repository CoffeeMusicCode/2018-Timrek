package org.usfirst.frc4930.Timrek.commands;

import org.usfirst.frc4930.Timrek.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class Drop extends Command{
	 public Drop() {
		    requires(Robot.dropWheel);
		  }

		  protected void initialize() {}

		  protected void execute() {
		    Robot.dropWheel.drop();;
		  }

		  protected boolean isFinished() {
		    return true;
		  }

		  protected void end() {}

		  protected void interrupted() {
		    end();
		  }
}
