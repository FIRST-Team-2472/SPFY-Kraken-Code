// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.ExampleSubsystem;
import java.util.function.Supplier;

/** An example command that uses an example subsystem. */
public class MotorCheese extends Command {

  private final ExampleSubsystem subsystem;
  private final Supplier<Double> speedSupplier;
  /**
   * Creates a new ExampleCommand.
   *
   * @param subsystem The subsystem used by this command.
   */
  public MotorCheese(ExampleSubsystem subsystem, Supplier<Double> speedSupplier) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.subsystem = subsystem;
    this.speedSupplier = speedSupplier;
    addRequirements(subsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {}

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {
    subsystem.setMotorPower(speedSupplier.get());
  }

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {}

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}