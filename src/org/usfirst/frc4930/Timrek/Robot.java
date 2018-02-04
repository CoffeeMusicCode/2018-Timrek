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


import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc4930.Timrek.PathPlanning.PickAuto;
import org.usfirst.frc4930.Timrek.subsystems.*;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the TimedRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the build.properties file in 
 * the project.
 */
public class Robot extends TimedRobot {

    Command autonomousCommand;
    SendableChooser<Command> chooser = new SendableChooser<>();
    PickAuto pickAuto = new PickAuto();

    public static OI oi;
    public static DriveTrain driveTrain;
    public static Gripper gripper;
    public static LowerArm lowerArm;
    public static UpperArm upperArm;
    public static PTO pto;
    public static Claw claw;
    public static Shifter shifter;
    public static DropWheel dropWheel;
    
    //ALL THESE VALUES NEED TO BE CHECKED TO SEE HOW SOLENOID STATE RELATES TO ROBOT
    public static boolean shifterInLowGear = true;
    public static boolean ptoOn = true;
    public static boolean dropped = false;
    public static boolean clawOpen = false;

    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
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
        // OI must be constructed after subsystems. If the OI creates Commands
        //(which it very likely will), subsystems are not guaranteed to be
        // constructed yet. Thus, their requires() statements may grab null
        // pointers. Bad news. Don't move it.
        oi = new OI();


    }

    /**
     * This function is called when the disabled button is hit.
     * You can use it to reset subsystems before shutting down.
     */
    @Override
    public void disabledInit(){

    }

    @Override
    public void disabledPeriodic() {
        Scheduler.getInstance().run();
    }

    @Override
    public void autonomousInit() {

        autonomousCommand = pickAuto.getCommand();
        // schedule the autonomous command (example)
        if (autonomousCommand != null) autonomousCommand.start();
    }

    /**
     * This function is called periodically during autonomous
     */
    @Override
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    @Override
    public void teleopInit() {
        // This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to
        // continue until interrupted by another command, remove
        // this line or comment it out.
        if (autonomousCommand != null) autonomousCommand.cancel();
        RobotMap.lShoulder.setSelectedSensorPosition(0, 0, 100);
        RobotMap.lElbow.setSelectedSensorPosition(0, 0, 100);
        RobotMap.lDrvMSTR.setSelectedSensorPosition(0, 0, 100);
        RobotMap.rDrvMSTR.setSelectedSensorPosition(0, 0, 100);
        RobotMap.dropWhl.setSelectedSensorPosition(0, 0, 100);
    }

    /**
     * This function is called periodically during operator control
     */
    @Override
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
        
       SmartDashboard.putBoolean("Compressor Enabled: ", RobotMap.compressor.enabled()); 
       SmartDashboard.putBoolean("Shifter (Solenoid 0)", RobotMap.solenoid0.get());
       SmartDashboard.putBoolean("PTO (Solenoid 1)", RobotMap.solenoid1.get());
       SmartDashboard.putBoolean("DropWheel (Solenoid 2)", RobotMap.solenoid2.get());
       SmartDashboard.putBoolean("Claw (Solenoid 4)", RobotMap.solenoid4.get());
       
       SmartDashboard.putNumber("Left Shoulder Encoder(21):", RobotMap.lShoulder.getSelectedSensorPosition(0));
       SmartDashboard.putNumber("Left Elbow Encoder(25):", RobotMap.lElbow.getSelectedSensorPosition(0));
       SmartDashboard.putNumber("Left Master Encoder(22):", RobotMap.lDrvMSTR.getSelectedSensorPosition(0));
       SmartDashboard.putNumber("Right Master Encoder(28):", RobotMap.rDrvMSTR.getSelectedSensorPosition(0));
       SmartDashboard.putNumber("Drop Wheel Encoder(34):", RobotMap.dropWhl.getSelectedSensorPosition(0));
       
       SmartDashboard.putNumber("UpperArmState: ", Robot.upperArm.getState());
       SmartDashboard.putNumber("LowerArmState: ", Robot.lowerArm.getState());
    }
}
