package net.media.training.designpattern.abstractfactory;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 18, 2011
 * Time: 6:34:34 PM
 * To change this template use File | Settings | File Templates.
 */
public class PhoneMaker {

    public Case buildPhone(PhoneFactory phone) {
        MotherBoard motherBoard;
        motherBoard = phone.createMotherBoard();
        motherBoard.attachBattery(new Battery());

        Processor processor = phone.createProcessor();
        motherBoard.attachProcessor(processor);

        Screen screen;
        screen = phone.createScreen();

        Case phoneCase;
        phoneCase = phone.createCase();
        phoneCase.attachMotherBoard(motherBoard);
        phoneCase.attachScreen(screen);

        return phoneCase;
    }
}
