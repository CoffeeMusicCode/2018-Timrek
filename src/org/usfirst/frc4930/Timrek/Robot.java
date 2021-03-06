package org.usfirst.frc4930.Timrek;

import org.usfirst.frc4930.Timrek.subsystems.*;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

public class Robot extends TimedRobot {

	Command autonomousCommand;
	SendableChooser<Command> chooser = new SendableChooser<>();

	public static OI oi;
	public static DriveTrain driveTrain;
	public static Gripper gripper;
	public static LowerArm lowerArm;
	public static UpperArm upperArm;
	public static PTO pto;
	public static Claw claw;
	public static Shifter shifter;
	public static DropWheel dropWheel;
	public static Dial positionDial;
	public static Dial timeDelayDial;
	public static Arm arm;
	public static Mast mast;

	// Robot State
	public static boolean shifterInLowGear = true;
	public static boolean ptoOn = true;
	public static boolean dropped = false;
	public static boolean clawOpen = false;

	@Override
	public void robotInit() {
		RobotMap.init();
		driveTrain = new DriveTrain();
		gripper = new Gripper();
		pto = new PTO();
		claw = new Claw();
		dropWheel = new DropWheel();
		shifter = new Shifter();
		lowerArm = new LowerArm();
		upperArm = new UpperArm();
		positionDial = new Dial(RobotMap.positionPot);
		timeDelayDial = new Dial(RobotMap.timeDelayPot);
		arm = new Arm();
		mast = new Mast();
		oi = new OI();
	}

	@Override
	public void disabledInit() {
	}

	@Override
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

	@Override
	public void autonomousInit() {
		autonomousCommand = chooser.getSelected();
		if (autonomousCommand != null) {
			autonomousCommand.start();
		}
	}

	@Override
	public void autonomousPeriodic() {
		Scheduler.getInstance().run();
	}

	@Override
	public void teleopInit() {
		if (autonomousCommand != null) {
			autonomousCommand.cancel();
		}
		RobotMap.lShoulder.setSelectedSensorPosition(0, 0, 100);
		RobotMap.lElbow.setSelectedSensorPosition(0, 0, 100);
		RobotMap.lDrvMSTR.setSelectedSensorPosition(0, 0, 100);
		RobotMap.rDrvMSTR.setSelectedSensorPosition(0, 0, 100);
		RobotMap.dropWhl.setSelectedSensorPosition(0, 0, 100);
	}

	@Override
	public void teleopPeriodic() {
		Scheduler.getInstance().run();

		SmartDashboard.putBoolean("Compressor Enabled: ", RobotMap.compressor.enabled());
		SmartDashboard.putBoolean("Shifter (Solenoid 0)", RobotMap.solenoid0.get());
		SmartDashboard.putBoolean("PTO (Solenoid 1)", RobotMap.solenoid1.get());
		SmartDashboard.putBoolean("DropWheel (Solenoid 2)", RobotMap.solenoid2.get());
		SmartDashboard.putBoolean("Claw (Solenoid 4)", RobotMap.solenoid4.get());

		SmartDashboard.putNumber("LeftShoulder", RobotMap.lShoulder.get());

		SmartDashboard.putNumber("Left Shoulder Encoder(21):", RobotMap.lShoulder.getSelectedSensorPosition(0));
		SmartDashboard.putNumber("Left Elbow Encoder(25):", RobotMap.lElbow.getSelectedSensorPosition(0));
		SmartDashboard.putNumber("Left Master Encoder(22):", RobotMap.lDrvMSTR.getSelectedSensorPosition(0));
		SmartDashboard.putNumber("Right Master Encoder(28):", RobotMap.rDrvMSTR.getSelectedSensorPosition(0));
		SmartDashboard.putNumber("Drop Wheel Encoder(34):", RobotMap.dropWhl.getSelectedSensorPosition(0));

		SmartDashboard.putNumber("UpperArmState: ", Robot.upperArm.getState());
		SmartDashboard.putNumber("LowerArmState: ", Robot.lowerArm.getState());

		SmartDashboard.putNumber("Gyro", RobotMap.ahrs.getAngle());

		SmartDashboard.putNumber("PositionPot Raw: ", RobotMap.positionPot.get());
		SmartDashboard.putNumber("DelayPot Raw: ", RobotMap.timeDelayPot.get());
		SmartDashboard.putNumber("PositionPot", Robot.positionDial.getPosition());
		SmartDashboard.putNumber("DelayPot", Robot.timeDelayDial.getPosition());
	}

}
