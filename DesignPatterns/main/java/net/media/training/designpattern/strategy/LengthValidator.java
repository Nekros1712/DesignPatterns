package net.media.training.designpattern.strategy;

public class LengthValidator implements Validator<Object[]> {

    public void validate(Object[] value) {
        String val = (String) value[0];
        int allowedLength = (Integer) value[1];
        if (val.length() > allowedLength)
            throw new RuntimeException("Invalid length:" + allowedLength);
    }

}