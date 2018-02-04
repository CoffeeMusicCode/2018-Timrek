package org.usfirst.frc4930.Timrek.PathPlanning;



public class StartingLeft extends StartingPath {

	
	
	
	public StartingLeft() {
		leftSwitch.addPoint(Points.leftStart);
		leftScale.addPoint(Points.leftStart);
		rightSwitch.addPoint(Points.leftStart);
		rightScale.addPoint(Points.leftStart);
		
		//Create Paths
		leftSwitch.addPoint(Points.switchLeftSide);
		
		leftScale.addPoint(Points.scaleLeftSide);
		
		rightSwitch.addPoint(Points.turnRight);
		rightSwitch.addPoint(Points.forwardRightSide);
		rightSwitch.addPoint(Points.switchRightSide);
		
		rightScale.addPoint(Points.turnRight);
		rightScale.addPoint(Points.forwardRightSide);
		rightScale.addPoint(Points.scaleRightSide);
		
		leftSwitch.config(velocity, acceleration, jerk);
		leftScale.config(velocity, acceleration, jerk);
		rightSwitch.config(velocity, acceleration, jerk);
		rightScale.config(velocity, acceleration, jerk);
		
		leftSwitch.generate();
		leftScale.generate();
		rightSwitch.generate();
		rightScale.generate();
		
		leftSwitch.setTankDrive();
		leftScale.setTankDrive();
		rightSwitch.setTankDrive();
		rightScale.setTankDrive();
		
		leftSwitch.getValues(leftSwitch.left);
		leftSwitch.getValues(leftSwitch.right);
		
		
	}
}
