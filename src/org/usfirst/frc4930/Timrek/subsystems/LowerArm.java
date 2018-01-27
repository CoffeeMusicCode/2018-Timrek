package org.usfirst.frc4930.Timrek.subsystems;

import org.usfirst.frc4930.Timrek.Robot;
import org.usfirst.frc4930.Timrek.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

public class LowerArm extends Subsystem{
	
	private boolean isGrounded;
	private boolean upperArmRaised;
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		upperArmRaised = Robot.upperArm.checkState();
	}
	
	public boolean checkMove() {
		return upperArmRaised;
	}
	
	public boolean checkState() {
		// encoder values NEED TO BE TESTED
		
		if (RobotMap.lShoulder.getSelectedSensorPosition(0) < 10) {
			isGrounded = true;
		}
		else if (RobotMap.lShoulder.getSelectedSensorPosition(0) > 100) {
			isGrounded = false;
		}
		
		return isGrounded;
	}
	
	public void move(double speed) { 
		RobotMap.lShoulder.set(speed);
	}
	
	public void stop() {
		RobotMap.lShoulder.stopMotor();
	}
}

