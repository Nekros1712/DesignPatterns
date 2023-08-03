package solid.live.dip.reader;

import java.io.BufferedReader;
import java.io.IOException;

class FileReader implements Reader {

    private final String filePath;
	
    public FileReader(String filePath) {
		this.filePath = filePath;
	}

    @Override
    public String readData() {
        StringBuilder data = new StringBuilder();
		try {
			BufferedReader reader = new BufferedReader(new FileReader(this.filePath));
			while (reader.readLine() != null) {
				data.append(reader.readLine());
			}
			reader.close();
		} catch (IOException exception) {
			exception.printStackTrace();
		}
		return data.toString()
    }
}