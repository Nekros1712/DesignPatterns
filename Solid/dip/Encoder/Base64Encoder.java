package solid.live.dip.encoder;

import net.iharder.Base64;

class Base64Encoder implements Encoder {

    @Override
    public String encodeData(String dataToEncrypt) {
        return Base64.encodeBytes(dataToEncrypt.getBytes())
    }
}