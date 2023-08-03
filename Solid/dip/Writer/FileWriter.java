package solid.live.dip.writer;

import java.io.BufferedWriter;
import java.io.IOException;

class FileWriter implements Writer {
    private final String filePath;
	
    public MyFileWriter(String filePath) {
		this.filePath = filePath;
	}

    @Override
    public void writeData(String encryptedData) {
        try {
			BufferedWriter writer = new BufferedWriter(new FileWriter(this.filePath));
			writer.write(encryptedData);
			writer.flush();
			writer.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
    }
}