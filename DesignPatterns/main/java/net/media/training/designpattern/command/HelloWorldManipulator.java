package net.media.training.designpattern.command;

import java.util.ArrayList;
import java.util.List;

public class HelloWorldManipulator {

    private List<Command> commandsList = new ArrayList<Command>();

    public void fixManipulate(final String fileName, final String newPath) {
        int cnt = 0;
        commandsList.add(new Creator(fileName, "hello world"));
        commandsList.add(new Updater(fileName, "new hello world"));
        commandsList.add(new Mover(fileName, newPath));

        for(Command command: commandsList) {
            try {
                command.execute();
            } catch (Exception e) {
                command.undo();
                break;
            }
        }

//        try {
//            for(Command command: commandsList) {
//                command.execute();
//            }
//        } catch (Exception e) {
//            switch (cnt) {
//                case 3:
//                    move(newPath, fileName);
//                case 2:
//                    update(fileName, "hello world");
//                case 1:
//                    delete(fileName);
//
//            }
//        }
    }

    public void brokenManipulate(String fileName, String newPath) {
        int cnt = 0;
        commandsList.add(new Creator(fileName, "hello world"));
        commandsList.add(new Updater(fileName, "new hello world"));
        commandsList.add(new Mover(fileName, newPath));
        commandsList.add(new Creator(fileName, "hello world"));
        commandsList.add(new Creator(fileName, "hello world"));

        for(Command command: commandsList) {
            try {
                command.execute();
            } catch (Exception e) {
                command.undo();
                break;
            }
        }

//        try {
//            for(Command command: commandsList) {
//                command.execute();
//            }
//        } catch (Exception e) {
            // add undo
//            switch (cnt) {
//                case 5:
//                    delete(fileName);
//                case 4:
//                    delete(fileName);
//                case 3:
//                    move(newPath, fileName);
//                case 2:
//                    update(fileName, "hello world");
//                case 1:
//                    delete(fileName);
//
//            }
//        }
    }
}
