/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.BasicRobot.subsystems;

import edu.wpi.first.wpilibj.BasicRobot.RobotMap;
import edu.wpi.first.wpilibj.BasicRobot.commands.DriveWithJoysticks;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.Encoder;

/**
 *
 * @author Team-61
 */
public class DriveTrain extends Subsystem {
    
    // Distance traveled per encoder pulse
    // pi * diameter of wheel / pulses per rotation
    private static final double dp = (3.14*8.5)/360;
    
    //Define Encoders
    private Encoder leftEncoder = new Encoder(RobotMap.leftEncoderA, RobotMap.leftEncoderB);
    private Encoder rightEncoder = new Encoder(RobotMap.rightEncoderA, RobotMap.rightEncoderB);
    
   // Define speed controllers
    private SpeedController leftMotor = new Victor(RobotMap.leftMotor);
    private SpeedController rightMotor = new Victor(RobotMap.rightMotor);

    // Initialize your subsystem here
    public DriveTrain() {
        super("DriveTrain");
        leftEncoder.setDistancePerPulse(dp);
        rightEncoder.setDistancePerPulse(dp);
    }
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new DriveWithJoysticks());
    }
    
    /**
     * Tank drive for main drivetrain.
     * @param left Left motor value
     * @param right Right motor value
     */
    public void tankDrive(double left, double right) {
        moveLeftMotor(left);
        moveRightMotor(right);
    }
    
    /**
     * Reversed controls tankDrive.
     * @param right Right motor value
     * @param left Left motor value
     */
    public void reverseTankDrive(double right, double left) {
        moveRightMotor(right);
        moveLeftMotor(left);
    }
    
    
    public void startRightEncoder()
    {
        rightEncoder.reset();
        rightEncoder.start();
    }
    
    public void startLeftEncoder()
    {
        leftEncoder.reset();
        leftEncoder.start();
    }
    
    public double getRightEncoder()
    {
        return rightEncoder.getDistance();
    }
    
    public double getLeftEncoder()
    {
        return leftEncoder.getDistance();
    }
    
    /**
     * 
     * @param speed 
     */
    
    private void moveLeftMotor(double speed)
    {
        speed = speed*-1.0;
        leftMotor.set(speed);
    }
    
    /**
     * 
     * @param speed 
     */
    
    private void moveRightMotor(double speed)
    {
        rightMotor.set(speed);
    }
}
 