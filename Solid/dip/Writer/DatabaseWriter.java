package solid.live.dip.writer;

import java.util.Hashtable;
import java.util.Map;

class DatabaseWriter implements Writer {

    private static Map<Integer, String> data = new Hashtable<Integer, String>();
    private static int count = 0;

    @Override
    public void writeData(String encryptedData) {
        data.put(++count, encryptedData);
    }
}