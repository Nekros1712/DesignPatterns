package net.media.training.designpattern.command;

import java.io.*;

public class Updater implements Command {
    private String fileName;
    private String content;
    private String oldContent;

    public Updater(String fileName, String content) {
        this.fileName = fileName;
        this.content = content;
    }

    public void execute() {
        File file = new File(fileName);
        if (!file.exists())
            throw new RuntimeException("File: " + fileName + " does not exist");

        try {
            BufferedReader reader = new BufferedReader(new FileReader(file));
            StringBuilder stringBuilder = new StringBuilder();
            String line;
            while ((line = reader.readLine()) != null) {
                stringBuilder.append(line);
            }
            oldContent = stringBuilder.toString();
            reader.close();

            PrintWriter writer = new PrintWriter(file);
            writer.write(content);
            writer.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void undo() {
        new Updater(this.fileName, this.oldContent);
    }
}
