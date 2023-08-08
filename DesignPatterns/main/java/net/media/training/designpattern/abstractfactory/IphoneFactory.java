package net.media.training.designpattern.abstractfactory;

public class IphoneFactory implements PhoneFactory {
    public Case createCase() {
        return new IphoneCase();
    }

    public Screen createScreen() {
        return new IphoneScreen();
    }

    public MotherBoard createMotherBoard() {
        return new IphoneMotherBoard();
    }

    public Processor createProcessor() {
        return new IphoneProcessor();
    }

    public Battery createBattery() {
        return new IphoneBattery();
    }
}
