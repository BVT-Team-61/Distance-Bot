/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.BasicRobot.subsystems;

import edu.wpi.first.wpilibj.Gyro;
import edu.wpi.first.wpilibj.BasicRobot.RobotMap;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author Richard
 */
public class Gyroscope extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    
    Gyro mainGyro = new Gyro(RobotMap.mainGyro);
   
    public void reset(){
        mainGyro.reset();
    }
    
    public double getAngle(){
        return mainGyro.getAngle();
    }
    
    public double getRate(){
        return mainGyro.getRate();
    }
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}
