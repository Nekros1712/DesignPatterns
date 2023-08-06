package net.media.training.designpattern.abstractfactory;

public interface PhoneFactory {
    Case createCase();
    Screen createScreen();
    MotherBoard createMotherBoard();
    Processor createProcessor();
}
