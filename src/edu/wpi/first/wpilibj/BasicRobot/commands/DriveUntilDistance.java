/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.BasicRobot.commands;

/**
 * Drive until certain distance away from object according to ultrasonic sensor.
 * @author OAmour
 */
public class DriveUntilDistance extends CommandBase {
    
    private static final double threshold = 10.0;
    private static final double speed = 0.5;
    private static double target;
    private static double remaining;
    
    public DriveUntilDistance( double target ) {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
        requires(drivetrain);
        requires(sonicarray);
        
    }

    // Called just before this Command runs the first time
    protected void initialize() {
        remaining = target - sonicarray.getForwardReading();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
        drivetrain.tankDrive(speed, speed);
        remaining = target - sonicarray.getForwardReading();
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return remaining < threshold;
    }

    // Called once after isFinished returns true
    protected void end() {
        drivetrain.tankDrive(0.0, 0.0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
