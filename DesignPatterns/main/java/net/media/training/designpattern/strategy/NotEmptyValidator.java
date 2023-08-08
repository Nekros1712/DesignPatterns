package net.media.training.designpattern.strategy;

public class NotEmptyValidator implements Validator<String> {

    public void validate(String val) {
        if (val == null || val.length() == 0)
            throw new RuntimeException("not empty check failed for value:" + val);
    }

}