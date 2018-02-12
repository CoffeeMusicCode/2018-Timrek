package org.usfirst.frc4930.Timrek;

public class Constants {
	
	public static final int
		
		// drive train motor controller IDs
		L_DRV_MSTR_ID = 22,
		L_DRV_SLV1_ID = 24,
		L_DRV_SLV2_ID = 26,
		R_DRV_MSTR_ID = 28,
		R_DRV_SLV1_ID = 30,
		R_DRV_SLV2_ID = 32,
		DROP_WHL_ID = 34,

		// arm motor controller IDs
		L_SHOULDER_ID = 21,
		R_SHOULDER_ID = 23,
		L_ELBOW_ID = 25,
		R_ELBOW_ID = 27,
		L_INTAKE_ID = 29,
		R_INTAKE_ID = 31,

		// mast motor controller ID
		MAST_ID = 33;

	public static final int
		
		// sensor channels
		GRIPPER_LSWITCH_CHNL = 0,
		UARM_UP_LSWITCH_CHNL = 0,
		UARM_DOWN_LSWITCH_CHNL = 0,
		LARM_DOWN_LSWITCH_CHNL = 8;

	public static final double
	
		// intake/outtake speeds
		INTAKE_SPEED = 1.0,
		OUTTAKE_SPEED = -1.0;

	public static final int
	
		// encoder values for the arm
		SHOULDER_VELOCITY = 500,
		ELBOW_VELOCITY = 500,
		SHOULDER_EXTENDED = 75000,
		ELBOW_EXTENDED = 100000;

}
