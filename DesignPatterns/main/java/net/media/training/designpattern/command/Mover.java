package net.media.training.designpattern.command;

import java.io.File;

public class Mover implements Command {
    private String source;
    private String destination;

    public Mover(String source, String destination) {
        this.source = source;
        this.destination = destination;
    }

    public void execute() {
        File file = new File(source);
        if (!file.exists())
            throw new RuntimeException("File does not exist");
        if (!file.renameTo(new File(destination)))
            throw new RuntimeException("Rename failed");
    }

    public void undo() {
        new Mover(this.destination, this.source);
    }
}