package solid.live.dip.reader;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;

class NetworkReader implements Reader {
    private final URL url;

    NetworkReader(String protocol, String domain, String path) {
        try {
            this.url = new URL(protocol, domain, path);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public String readData() {
        InputStream in = null;
        try {
            in = url.openStream();
        } catch (IOException e) {
            e.printStackTrace();
        }
        InputStreamReader reader = new InputStreamReader(in);
        StringBuilder inputString = new StringBuilder();
        try {
            int c;
            c = reader.read();
            while (c != -1) {
                inputString.append((char) c);
                c = reader.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return inputString.toString();
    }
}