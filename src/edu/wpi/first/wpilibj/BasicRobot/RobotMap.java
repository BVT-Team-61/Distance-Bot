package edu.wpi.first.wpilibj.BasicRobot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    //Joysticks
    public static final int leftStick = 1;
    public static final int rightStick = 2;
    
    //Motors
    public static final int leftMotor = 1; // Left motor in port 1
    public static final int rightMotor = 2; // Right motor in port 2
    
    //Digital IO
    public static final int leftEncoderA = 1;
    public static final int leftEncoderB = 2; 
    public static final int rightEncoderA = 3;
    public static final int rightEncoderB = 4;
    public static final int ultrasonicPing = 5;
    public static final int ultrasonicEcho = 6;
   
    
    //Analog IO
    public static final int mainGyro = 1;
    
}
