/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.BasicRobot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 * @author FrankAdmin
 */
public class AutonomousGroup extends CommandGroup {
    
    public AutonomousGroup() {        
        // Drive forward for 100 mm
        addSequential(new ReverseDriveForDistance(100));
        // Drive until 100 mm away
        addSequential(new DriveUntilDistance(100));
    }
}
