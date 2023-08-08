package net.media.training.designpattern.command;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class Creator implements Command {
    private String fileName;
    private String content;

    public Creator(String fileName, String content) {
        this.fileName = fileName;
        this.content = content;
    }

    public void execute() {
        File file = new File(fileName);
        if (file.exists())
            throw new RuntimeException("File already exists");
        try {
            file.createNewFile();
            PrintWriter writer = new PrintWriter(file);
            writer.write(content);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void deleteFile(String fileName) {
        File file = new File(fileName);
        file.delete();
    }

    public void undo() {
        deleteFile(this.fileName);
    }
}