package org.usfirst.frc4930.Timrek.commands;

import org.usfirst.frc4930.Timrek.Robot;

import edu.wpi.first.wpilibj.command.Command;

public class PTOEngage extends Command {
	  public PTOEngage() {
		    requires(Robot.pto);
		  }

		  protected void initialize() {}

		  protected void execute() {
		    Robot.pto.setHighGear();
		  }

		  protected boolean isFinished() {
		    return true;
		  }

		  protected void end() {}

		  protected void interrupted() {
		    end();
		  }
}
