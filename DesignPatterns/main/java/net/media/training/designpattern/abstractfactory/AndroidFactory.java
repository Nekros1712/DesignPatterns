package net.media.training.designpattern.abstractfactory;

public class AndroidFactory implements PhoneFactory {
    public Case createCase() {
        return new AndroidCase();
    }

    public Screen createScreen() {
        return new AndroidScreen();
    }

    public MotherBoard createMotherBoard() {
        return new AndroidMotherBoard();
    }

    public Processor createProcessor() {
        return new AndroidProcessor();
    }
}
