package solid.live.dip;

import solid.live.dip.*;
import java.io.IOException;

/**
 * Created by IntelliJ IDEA.
 * User: goyalamit
 * Date: Jul 13, 2011
 * Time: 10:20:57 AM
 * To change this template use File | Settings | File Templates.
 */
public class EncodingModuleClient {
    public static void main(String[] args) throws IOException {
        EncodingModule encodingModule  = new EncodingModule();
        
        Encoder base64Encoder = new Base64Encoder();
        
        Reader readFromFile = new FileReader("/Users/goyalamit/Sandbox/training/src/solid_2011/live/dip/beforeEncryption.txt");
        Writer writeToFile = new FileWriter("/Users/goyalamit/Sandbox/training/src/solid_2011/live/dip/afterEncryption.txt");
        encodingModule.encode(readFromFile, writeToFile, base64Encoder);

        Reader readFromNetwork = new NetworkReader("http", "myfirstappwith.appspot.com", "index.html");
        Writer writeToDatabase = new DatabaseWriter();
        encodingModule.encode(readFromNetwork, writeToDatabase, base64Encoder);
    }
}
