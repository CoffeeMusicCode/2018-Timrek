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

import edu.wpi.first.wpilibj.SPI;
import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.FeedbackDevice;
import com.ctre.phoenix.motorcontrol.NeutralMode;
import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;
import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import com.kauailabs.navx.frc.AHRS;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;


/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	public static WPI_TalonSRX lShoulder; 
	public static WPI_TalonSRX rShoulder;
	
	public static WPI_TalonSRX lElbow;
	public static WPI_TalonSRX rElbow;
	
	public static WPI_TalonSRX lIntake;
	public static WPI_TalonSRX rIntake;
	
	public static WPI_TalonSRX lDrvMSTR;
	public static WPI_VictorSPX lDrvSlv1;
	public static WPI_VictorSPX lDrvSlv2;
	public static WPI_TalonSRX rDrvMSTR;
	public static WPI_VictorSPX rDrvSlv1;
	public static WPI_VictorSPX rDrvSlv2;
	
	public static WPI_TalonSRX dropWhl;
	public static WPI_TalonSRX mast;

	public static Compressor compressor;
	public static Solenoid solenoid0;
	public static Solenoid solenoid1;
	public static Solenoid solenoid2;
	public static Solenoid solenoid4;
	public static Solenoid solenoid5;
	
	public static AHRS ahrs;
	
	public static DifferentialDrive driveTank;
	
    public static void init() {
    
        lShoulder = new WPI_TalonSRX(21);       
        rShoulder = new WPI_TalonSRX(23);
        
        lElbow = new WPI_TalonSRX(25);
        rElbow = new WPI_TalonSRX(27);
        
        lIntake = new WPI_TalonSRX(29);
        rIntake = new WPI_TalonSRX(31);
        
        lDrvMSTR = new WPI_TalonSRX(22);
        lDrvSlv1 = new WPI_VictorSPX(24); 
        lDrvSlv2 = new WPI_VictorSPX(26);
        
        rDrvMSTR = new WPI_TalonSRX(28);
        rDrvSlv1 = new WPI_VictorSPX(30); 
        rDrvSlv2 = new WPI_VictorSPX(32);
        
        dropWhl = new WPI_TalonSRX(34);
        mast = new WPI_TalonSRX(33);
        
     //Invert necessary motors   
        lDrvMSTR.setInverted(true);
        
        rDrvMSTR.setInverted(true);
        
        rShoulder.setInverted(true);
        
        lElbow.setInverted(true);
        
        rIntake.setInverted(true);
        
     //Assign Slaves  
        lDrvSlv1.follow(lDrvMSTR);
        lDrvSlv1.setNeutralMode(NeutralMode.Brake);
        
        lDrvSlv2.follow(lDrvMSTR);
        lDrvSlv2.setNeutralMode(NeutralMode.Brake);
        
        rDrvSlv1.follow(rDrvMSTR);
        rDrvSlv1.setNeutralMode(NeutralMode.Brake);
        
        rDrvSlv2.follow(rDrvMSTR);
        rDrvSlv2.setNeutralMode(NeutralMode.Brake);
        
        rShoulder.set(ControlMode.Follower, 21);
        rElbow.set(ControlMode.Follower, 25);
      
      //Assign Encoders  
        lShoulder.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder, 0,100);
        lElbow.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder, 0,100);
       
        
        lDrvMSTR.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder, 0,100);
        rDrvMSTR.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder, 0,100);
        dropWhl.configSelectedFeedbackSensor(FeedbackDevice.QuadEncoder, 0,100);
        
     //Invert Necessary Encoders
        lDrvMSTR.setSensorPhase(true);
        
     // Safety Enabled   
//        lShoulder.setSafetyEnabled(true);
//        rShoulder.setSafetyEnabled(true);
//        
//        lIntake.setSafetyEnabled(true);
//        rIntake.setSafetyEnabled(true);
//        
//        lDrvMSTR.setSafetyEnabled(true);
//        lDrvSlv1.setSafetyEnabled(true); 
//        lDrvSlv2.setSafetyEnabled(true); 
//        
//        rDrvMSTR.setSafetyEnabled(true); 
//        rDrvSlv1.setSafetyEnabled(true);  
//        rDrvSlv2.setSafetyEnabled(true); 
//        
//        dropWhl.setSafetyEnabled(true); 
        
     //Make DriveTank   
        driveTank = new DifferentialDrive(lDrvMSTR, rDrvMSTR);
        driveTank.setSafetyEnabled(false);
        
        ahrs = new AHRS(SPI.Port.kMXP); 
        
      //Pneumatics
        compressor = new Compressor(50);
    	solenoid0 = new Solenoid(50, 0);
    	solenoid1 = new Solenoid(50, 1);
    	solenoid2 = new Solenoid(50, 2);
    	solenoid4 = new Solenoid(50, 4);
    	solenoid5 = new Solenoid(50, 5);
    	
    	solenoid0.set(true);
    	solenoid1.set(true);
    	solenoid2.set(true);
    	solenoid4.set(true);
    	solenoid5.set(true);
    }
}
