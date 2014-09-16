/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.BasicRobot.subsystems;

import edu.wpi.first.wpilibj.BasicRobot.RobotMap;
import edu.wpi.first.wpilibj.Ultrasonic;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author OAmour
 */
public class SonicArray extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.

    Ultrasonic forward = new Ultrasonic(RobotMap.ultrasonicPing, RobotMap.ultrasonicEcho);
    
    public SonicArray() {
        
    }
    
    public void initDefaultCommand() {
        
    }
    
    public double getForwardReading() {
        return forward.getRangeMM();
    }
}
