package net.media.training.designpattern.command;

import java.io.File;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 20, 2011
 * Time: 4:55:07 PM
 * To change this template use File | Settings | File Templates.
 */

public interface Command {
    void execute();
    void undo();
}

